/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record.Controller;

import com.sun.corba.se.impl.oa.poa.Policies;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import medical.record.Model.Dokter;
import medical.record.Model.Karyawan;
import medical.record.Model.Pasien;
import medical.record.Model.Penyakit;
import medical.record.Model.Poliklinik;
import medical.record.Model.Spesialisasi;
import medical.record.View.ViewDokter;
import medical.record.View.ViewRekamMedis;

/**
 *
 * @author Acer
 */
public class Service {

    Connection conn;    
    DefaultTableModel modelDokter, modelPasien, modelRekamMedis, modelPoliklinik;
    PreparedStatement preparedStatement;
    ResultSet neSet;
    
    Dokter dokter;
    ArrayList<Dokter> listDokter;
    
    Pasien pasien;
    ArrayList<Pasien> listPasien;
    
    Karyawan karyawan;
    ArrayList<Karyawan> listKaryawan;
    
    Penyakit penyakit;
    ArrayList<Penyakit> listPenyakit;
    
    Poliklinik poliklinik;
    ArrayList<Poliklinik> listPoliklinik;
    
    Spesialisasi spesialis;
    ArrayList<Spesialisasi> listSpesialisasi;
    

    public Service(Connection conn) {
        this.conn = conn;
    }
    
    public Service() {
        modelDokter = new DefaultTableModel();
        modelPasien = new DefaultTableModel();
        modelRekamMedis = new DefaultTableModel();
        conn = Conf.databaseConnected();
    }
    
    public DefaultTableModel getModelDokter() {
        return modelDokter;
    }
    
    public void setTableDokter(){
        modelDokter.addColumn("NIP");
        modelDokter.addColumn("Nama");
        modelDokter.addColumn("Spesialis");
        modelDokter.addColumn("Poliklinik");
        modelDokter.addColumn("Tanggal Mulai Kerja");
        modelDokter.addColumn("No Telepon");
    }
    
    public void setTablePasien(){
        modelPasien.addColumn("ID");
        modelPasien.addColumn("Nama");
        modelPasien.addColumn("Tanggal Lahir");
        modelPasien.addColumn("Telepon");
        modelPasien.addColumn("Pekerjaan");
        modelPasien.addColumn("Alamat");
    }
    
    public void setTableRekamMedis(){}
    
    public void setTablePoliklinik(){
        modelPasien.addColumn("Kode Poli");
        modelPasien.addColumn("Nama Poliklinik");
    }
    
    public void readDokter(){
        modelDokter.setRowCount(0);
        for(Dokter value : listDokter){
            modelDokter.addRow(
                    new Object[]{
                        value.getId_dokter(), 
                        value.getNamaDokter(),
                        value.getNamaSpesialisasi(),
                        value.getNamaPoliklinik(),
                        value.getTglMulaiKerja(),
                        value.getNoTelpDokter()
                    }
            );
        }
    }
    
    public void loadDokter(){
        if(conn != null){
            try{
                String query = "SELECT * FROM dokter "
                        + "JOIN poliklinik ON dokter.kode_poliklinik = poliklinik.kode_poliklinik "
                        + "JOIN spesialisasi ON poliklinik.kode_spesialisasi = spesialisasi.kode_spesialisasi "
                        + "ORDER BY dokter.id_dokter";
                listDokter = new ArrayList<>();
                preparedStatement =  conn.prepareStatement(query);
                neSet = preparedStatement.executeQuery();
                while(neSet.next()){
                    int idDokter = neSet.getInt("id_dokter");
                    String nama = neSet.getString("nama_dokter");
                    String gender = neSet.getString("gender_dokter");
                    String tglLahir = neSet.getString("tgl_lahir");
                    String tglMulaiKerja = neSet.getString("tgl_mulai_kerja");
                    String noTelp = neSet.getString("no_telepon");
                    String alamat = neSet.getString("alamat");
                    String kdPoli = neSet.getString("nama_poliklinik");
                    String kdSpesialis = neSet.getString("nama_spesialisasi");
                    
                    Dokter dokter = new Dokter(
                            idDokter, 
                            nama, 
                            gender, 
                            tglLahir,
                            tglMulaiKerja,
                            noTelp, 
                            alamat, 
                            kdPoli,                            
                            kdSpesialis
                    );
                    listDokter.add(dokter);
                }
                listDokter.size();
                neSet.close();
                preparedStatement.close();
            }catch(SQLException ex){
                Logger.getLogger(ViewDokter.class.getName()).log(Level.SEVERE,null,ex);     
            }
        }else{
            System.out.println("Disconnected");
        }
    }
    
    public void CariDokter(int keyword){
        modelDokter.setRowCount(0);
        loadDokter();
        for (Dokter value : listDokter) {
            if(value.getId_dokter() == keyword){
                readDokter();
            }
        }
    }
    
      public void insertDokter(String nip, String nama, String spesialis, String poliklinik, String tglL, String gender,String tgl){
        if(conn != null){
            try{
                String sql = "INSERT INTO dokter(id_dokter, nama_dokter, jns_kelamin, tgl_lahir,tgl_mulai_bekerja, kode_poliklinik, kode_spesialisasi) VALUES"
                        + "(?,?,?,?,?,?,?)";
                preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, nip);
                preparedStatement.setString(2, nama);
                preparedStatement.setString(3, gender);
                preparedStatement.setString(4, tglL);
                preparedStatement.setString(5, tgl);
                preparedStatement.setString(6, poliklinik);
                preparedStatement.setString(7, spesialis);
                
                
            }catch(SQLException e){
                Logger.getLogger(ViewDokter.class.getName()).log(Level.SEVERE,null,e); 
            }
        }
        
    }
      
      public void addRekamMedik(
              int idPasien,  
              int idDokter, 
              int kdSpesialisasi, 
              int kdPoliklinik, 
              int kdPenyakit, 
              String jenisRM, 
              String ruangPerawatan, 
              String tglMasuk,
              String tglKeluar,
              String Pemeriksaan,
              String Tindakan,
              String Pengobatan){
          if(conn != null){
              try{
              String query = "INSERT INTO medical_record("
                      + "jenis_rekam_medis, " //1
                      + "id_pasien, " //2
                      + "id_dokter, " //3
                      + "kode_spesialisasi, " //4
                      + "kode_poliklinik, "  //5
                      + "kode_penyakit, " //6
                      + "ruang_perawatan, "  //7
                      + "tgl_masuk, "  //8
                      + "tgl_keluar,"  //9
                      + "pemeriksaan, "  //11
                      + "tindakan, "  //12
                      + "pengobatan) "  //13
                      + "VALUES(" 
                      + "?,?,?,?,?,"
                      + "?,?,?,?,?,"
                      + "?,?)";
             preparedStatement = conn.prepareStatement(query);
             preparedStatement.setString(1, jenisRM);
             preparedStatement.setInt(2, idPasien);
             preparedStatement.setInt(3, idDokter);
             preparedStatement.setInt(4, kdSpesialisasi);
             preparedStatement.setInt(5, kdPoliklinik);
             preparedStatement.setInt(6, kdPenyakit);
             preparedStatement.setString(7, ruangPerawatan);
             preparedStatement.setString(8, tglMasuk);
             preparedStatement.setString(9, tglKeluar);
             preparedStatement.setString(10, Pemeriksaan);
             preparedStatement.setString(11, Tindakan);
             preparedStatement.setString(12, Pengobatan);
            }catch(SQLException e){
                Logger.getLogger(ViewRekamMedis.class.getName()).log(Level.SEVERE,null,e);
            }
              
          }else{
              System.out.println("Database not connected");
          }
      
      }
      
}

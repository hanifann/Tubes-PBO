/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record.View;

import com.placeholder.PlaceHolder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import medical.record.Controller.Auth;
import medical.record.Controller.Conf;
import medical.record.Controller.Service;
import medical.record.Model.Pasien;
import medical.record.Model.Dokter;



/**
 *
 * @author Acer
 */
public final class ViewAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ViewAdmin
     */
    
    Connection conn = Conf.databaseConnected();
    Service function;
    Auth auth = new Auth();
    Conf conf = new Conf();
    PreparedStatement sst;
    DefaultTableModel modelKaryawan, modelDokter, modelPasien;   
    int id; String nama;
    
    public ViewAdmin() {
        initComponents();
    }

    ViewAdmin(String session, int username) {
        initComponents();
        nama = session;
        id = username;
        function = new Service(conn);        
        modelDokter = function.getModelDokter();
        modelPasien = function.getModelPasien();
        modelKaryawan = function.getModelKaryawan();
        
        loadSpesialisCB();
        loadPoliklinikCB();
        
        tblPegawai.setModel(modelKaryawan);
        setKaryawan();
        function.loadKaryawan();
        function.readKaryawan();
        
        tblDokter.setModel(modelDokter);
        setDokter();
        function.loadDokter();
        function.readDokter();
        
        tblPasien.setModel(modelPasien);
        setPasien();
        function.loadPasien();
        function.readPasien();
        
        new PlaceHolder(tfNamaDokter, "Nama Dokter");
        new PlaceHolder(tfTeleponDokter, "No Telepon");
        new PlaceHolder(tfAlamatDokter, "Alamat Dokter");
        new PlaceHolder(tfPassDokter, "Password Dokter");
        
        new PlaceHolder(tfNamaPasien, "Nama Pasien");
        new PlaceHolder(tfUmurPasien, "Umur Pasien");
        new PlaceHolder(tfTeleponPasien, "No Telepon Pasien");
        new PlaceHolder(tfPekerjaanPasien, "Pekerjaan Pasien");
        new PlaceHolder(tfAlamatPasien, "Alamat Pasien");
        
        new PlaceHolder(tfNamaKaryawan, "Nama Pegawai");
        new PlaceHolder(tfPassKaryawan, "Password Karyawan");
    }
    
    // nama, gender, tanggal lahir, tanggal mulai kerja, no telpon, alamat status, pass
    private void setKaryawan(){
        modelKaryawan.addColumn("NIP");
        modelKaryawan.addColumn("Nama");
        modelKaryawan.addColumn("Gender");
        modelKaryawan.addColumn("Tanggal Lahir");
        modelKaryawan.addColumn("Mulai Kerja");        
        modelKaryawan.addColumn("Status");
    }
   
    // nip nama mulai kerja  telepon spesialisasi   
    private void setDokter(){
        modelDokter.addColumn("NIP");
        modelDokter.addColumn("Nama");
        modelDokter.addColumn("Mulai Kerja");
        modelDokter.addColumn("Telepon");
        modelDokter.addColumn("Spesialisasi");
    }
    
    //nama, gender, tanggal lahir, umur , notelp, pekerjaan, alamat    
    private void setPasien(){
        modelPasien.addColumn("Id Pasien");
        modelPasien.addColumn("Nama");
        modelPasien.addColumn("Tanggal Lahir");
        modelPasien.addColumn("No Telepon");
        modelPasien.addColumn("Pekerjaan");
        modelPasien.addColumn("Alamat");
    }
    
    private void reset (){
        tfNamaKaryawan.setText("");
        tfGenderKaryawan.setSelectedIndex(0);
        tfPassKaryawan.setText("");
        cbStatus.setSelectedIndex(0);
        dcLahirKaryawan.setDate(null);
        dcMulaiKerjaKaryawan.setDate(null);
    }
    
     public void loadSpesialisCB(){
        try {
            String query = "SELECT * FROM spesialisasi";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet neSet = ps.executeQuery();
            while(neSet.next()){
                Object[] obj = new Object[2];
                obj[0] = neSet.getString(1);
                obj[1] = neSet.getString(2);
                cbKdSpesialis1.addItem((String) obj[0] +" - "+ (String) obj[1]);
            }
            
            neSet.close(); 
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
     
      public void loadPoliklinikCB(){
        try {
            String query = "SELECT * FROM poliklinik";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet neSet = ps.executeQuery();
            while(neSet.next()){
                Object[] obj = new Object[2];
                obj[0] = neSet.getString(1);
                obj[1] = neSet.getString(2);
                cbKdPoliklinik.addItem((String) obj[0] +" - "+ (String) obj[1]);
            }
            
            neSet.close(); 
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Service.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPasien = new javax.swing.JButton();
        btnDokter = new javax.swing.JButton();
        btnPegawai = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        uwaw = new javax.swing.JPanel();
        ListPegawai = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tfNamaKaryawan = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPegawai = new javax.swing.JTable();
        btnTambahKaryawan = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        tfPassKaryawan = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        dcLahirKaryawan = new com.toedter.calendar.JDateChooser();
        dcMulaiKerjaKaryawan = new com.toedter.calendar.JDateChooser();
        tfGenderKaryawan = new javax.swing.JComboBox<>();
        ListDokter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNamaDokter = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfTeleponDokter = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfAlamatDokter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDokter = new javax.swing.JTable();
        btnTambahDokter = new javax.swing.JButton();
        tfPassDokter = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        dcLahirDokter = new com.toedter.calendar.JDateChooser();
        dcKerjaDokter = new com.toedter.calendar.JDateChooser();
        tfGenderDokter = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cbKdSpesialis1 = new javax.swing.JComboBox<>();
        cbKdPoliklinik = new javax.swing.JComboBox<>();
        ListPasien = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfNamaPasien = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfUmurPasien = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfTeleponPasien = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfAlamatPasien = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPasien = new javax.swing.JTable();
        btnTambahPasien = new javax.swing.JButton();
        tfPekerjaanPasien = new javax.swing.JTextField();
        tfPekerjaan = new javax.swing.JLabel();
        tfGenderPasien = new javax.swing.JComboBox<>();
        dcLahirPasien = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(42, 147, 151));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hello ADMIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 67, 291, 112);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 42.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1030, 820, 420, 210);

        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 41.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 840, 127, 186);

        btnPasien.setBackground(new java.awt.Color(42, 147, 151));
        btnPasien.setForeground(new java.awt.Color(255, 255, 255));
        btnPasien.setText("Pasien");
        btnPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienActionPerformed(evt);
            }
        });
        jPanel1.add(btnPasien);
        btnPasien.setBounds(480, 310, 130, 32);

        btnDokter.setBackground(new java.awt.Color(42, 147, 151));
        btnDokter.setForeground(new java.awt.Color(255, 255, 255));
        btnDokter.setText("Dokter");
        btnDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDokterActionPerformed(evt);
            }
        });
        jPanel1.add(btnDokter);
        btnDokter.setBounds(330, 310, 130, 32);

        btnPegawai.setBackground(new java.awt.Color(42, 147, 151));
        btnPegawai.setForeground(new java.awt.Color(255, 255, 255));
        btnPegawai.setText("Pegawai");
        btnPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegawaiActionPerformed(evt);
            }
        });
        jPanel1.add(btnPegawai);
        btnPegawai.setBounds(180, 310, 130, 32);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 45.png"))); // NOI18N
        jPanel1.add(jLabel34);
        jLabel34.setBounds(550, 30, 331, 201);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 57.png"))); // NOI18N
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(1170, 80, 220, 90);

        uwaw.setLayout(new java.awt.CardLayout());

        ListPegawai.setBackground(new java.awt.Color(255, 255, 255));
        ListPegawai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ListPegawai.setForeground(new java.awt.Color(0, 0, 0));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Tambah Data Pegawai");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("nama");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("gender");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Tanggal Lahir");

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("tanggal mulai kerja");

        tblPegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIP", "Nama", "Gender", "Tanggal Lahir", "Mulai Kerja", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblPegawai);

        btnTambahKaryawan.setText("tambah");
        btnTambahKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahKaryawanActionPerformed(evt);
            }
        });

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("status");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "karyawan", "admin" }));

        tfPassKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPassKaryawanActionPerformed(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("password");

        tfGenderKaryawan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        javax.swing.GroupLayout ListPegawaiLayout = new javax.swing.GroupLayout(ListPegawai);
        ListPegawai.setLayout(ListPegawaiLayout);
        ListPegawaiLayout.setHorizontalGroup(
            ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPegawaiLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ListPegawaiLayout.createSequentialGroup()
                            .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel29)
                                .addComponent(jLabel28)
                                .addComponent(jLabel27))
                            .addGap(49, 49, 49)
                            .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dcLahirKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfGenderKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ListPegawaiLayout.createSequentialGroup()
                            .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListPegawaiLayout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListPegawaiLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addGap(90, 90, 90)))
                            .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfPassKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dcMulaiKerjaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel26)
                    .addComponent(btnTambahKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        ListPegawaiLayout.setVerticalGroup(
            ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPegawaiLayout.createSequentialGroup()
                .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListPegawaiLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel26)
                        .addGap(35, 35, 35)
                        .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(tfNamaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(tfGenderKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(dcLahirKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(dcMulaiKerjaKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(ListPegawaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(tfPassKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnTambahKaryawan))
                    .addGroup(ListPegawaiLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        uwaw.add(ListPegawai, "card2");

        ListDokter.setBackground(new java.awt.Color(255, 255, 255));
        ListDokter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ListDokter.setForeground(new java.awt.Color(0, 0, 0));
        ListDokter.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tambah Data Dokter");
        ListDokter.add(jLabel2);
        jLabel2.setBounds(48, 54, 177, 24);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("nama");
        ListDokter.add(jLabel6);
        jLabel6.setBounds(48, 117, 32, 16);
        ListDokter.add(tfNamaDokter);
        tfNamaDokter.setBounds(174, 113, 311, 24);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("gender");
        ListDokter.add(jLabel7);
        jLabel7.setBounds(48, 157, 40, 16);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tanggal Lahir");
        ListDokter.add(jLabel8);
        jLabel8.setBounds(48, 201, 77, 16);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Kode Spesialisasi");
        ListDokter.add(jLabel9);
        jLabel9.setBounds(50, 320, 108, 16);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("no telepon");
        ListDokter.add(jLabel10);
        jLabel10.setBounds(50, 360, 59, 16);
        ListDokter.add(tfTeleponDokter);
        tfTeleponDokter.setBounds(170, 350, 311, 24);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("alamat");
        ListDokter.add(jLabel11);
        jLabel11.setBounds(50, 380, 39, 16);
        ListDokter.add(tfAlamatDokter);
        tfAlamatDokter.setBounds(170, 380, 311, 24);

        tblDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIP", "Nama", "Mulai Kerja", "Telepon", "Spesialisasi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDokter);

        ListDokter.add(jScrollPane1);
        jScrollPane1.setBounds(543, 31, 576, 484);

        btnTambahDokter.setText("tambah");
        btnTambahDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDokterActionPerformed(evt);
            }
        });
        ListDokter.add(btnTambahDokter);
        btnTambahDokter.setBounds(50, 470, 143, 32);
        ListDokter.add(tfPassDokter);
        tfPassDokter.setBounds(170, 410, 311, 24);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("password");
        ListDokter.add(jLabel19);
        jLabel19.setBounds(50, 410, 57, 16);
        ListDokter.add(dcLahirDokter);
        dcLahirDokter.setBounds(174, 201, 182, 29);
        ListDokter.add(dcKerjaDokter);
        dcKerjaDokter.setBounds(174, 236, 182, 29);

        tfGenderDokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        ListDokter.add(tfGenderDokter);
        tfGenderDokter.setBounds(174, 157, 40, 26);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("tanggal mulai kerja");
        ListDokter.add(jLabel20);
        jLabel20.setBounds(48, 236, 108, 16);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Kode Poliklinik");
        ListDokter.add(jLabel21);
        jLabel21.setBounds(50, 290, 83, 16);

        ListDokter.add(cbKdSpesialis1);
        cbKdSpesialis1.setBounds(170, 310, 190, 26);

        ListDokter.add(cbKdPoliklinik);
        cbKdPoliklinik.setBounds(170, 280, 190, 26);

        uwaw.add(ListDokter, "card2");

        ListPasien.setBackground(new java.awt.Color(255, 255, 255));
        ListPasien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ListPasien.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Tambah Data Pasien");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("nama");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("gender");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Tanggal Lahir");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Umur");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("no telepon");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("alamat");

        tblPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Pasien", "Nama", "Umur", "Gender", "Telepon", "Pekerjaan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPasien);

        btnTambahPasien.setText("tambah");
        btnTambahPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPasienActionPerformed(evt);
            }
        });

        tfPekerjaan.setBackground(new java.awt.Color(255, 255, 255));
        tfPekerjaan.setForeground(new java.awt.Color(0, 0, 0));
        tfPekerjaan.setText("Pekerjaan");

        tfGenderPasien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        javax.swing.GroupLayout ListPasienLayout = new javax.swing.GroupLayout(ListPasien);
        ListPasien.setLayout(ListPasienLayout);
        ListPasienLayout.setHorizontalGroup(
            ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPasienLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ListPasienLayout.createSequentialGroup()
                            .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13))
                            .addGap(49, 49, 49)
                            .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfGenderPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dcLahirPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(ListPasienLayout.createSequentialGroup()
                            .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(ListPasienLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addGap(67, 67, 67))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ListPasienLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfUmurPasien)
                                .addComponent(tfTeleponPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel12)
                    .addComponent(btnTambahPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ListPasienLayout.createSequentialGroup()
                        .addComponent(tfPekerjaan)
                        .addGap(67, 67, 67)
                        .addComponent(tfPekerjaanPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ListPasienLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(87, 87, 87)
                        .addComponent(tfAlamatPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        ListPasienLayout.setVerticalGroup(
            ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListPasienLayout.createSequentialGroup()
                .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListPasienLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel12)
                        .addGap(35, 35, 35)
                        .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tfGenderPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ListPasienLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListPasienLayout.createSequentialGroup()
                                .addComponent(dcLahirPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfUmurPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(tfTeleponPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPekerjaan)
                            .addComponent(tfPekerjaanPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ListPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tfAlamatPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(btnTambahPasien))
                    .addGroup(ListPasienLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        uwaw.add(ListPasien, "card2");

        jPanel1.add(uwaw);
        uwaw.setBounds(180, 370, 1238, 537);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDokterActionPerformed
        // TODO add your handling code here:
        // nama , gender, tanggal lahir, tanggal mulai kerja, no telepon, alamat, pass
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
        String nama = tfNamaDokter.getText();
        String gender = tfGenderDokter.getSelectedItem().toString();
        String tglLahir = dateformat.format(dcLahirDokter.getDate());
        String mulaiKerja = dateformat.format(dcKerjaDokter.getDate());
        String telepon = tfTeleponDokter.getText();
        String alamat = tfAlamatDokter.getText();
        String pass = auth.MD5(tfPassDokter.getText());
        int kdPoli = Integer.parseInt(cbKdPoliklinik.getSelectedItem().toString().substring(0,4));
        int kdSpesial = Integer.parseInt(cbKdSpesialis1.getSelectedItem().toString().substring(0,4));
        
        
        function.addDokter(nama, gender, tglLahir, mulaiKerja, telepon, alamat, pass, kdPoli, kdSpesial);
        function.loadDokter();
        JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
        
        tfNamaDokter.setText("");
        tfGenderDokter.setSelectedIndex(0);
        dcLahirDokter.setDate(null);
        dcKerjaDokter.setDate(null);
        tfTeleponDokter.setText("");
        tfAlamatDokter.setText("");
        tfPassDokter.setText("");
        
        ArrayList<Dokter> lmao = function.ter();
        modelDokter.setRowCount(0);
        for (Dokter value: lmao){
            modelDokter.addRow(
                  new Object[]{
                       value.getId_dokter(),
                       value.getNamaDokter(),
                       value.getTglMulaiKerja(),
                       value.getNoTelpDokter(),
                       value.getNamaSpesialisasi()
                  }
            );
        }
        
        
        
    }//GEN-LAST:event_btnTambahDokterActionPerformed

    private void btnTambahPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPasienActionPerformed
        // TODO add your handling code here:
        //nama, gender, tanggal lahir, umur , notelp, pekerjaan, alamat
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
        String nama = tfNamaPasien.getText();
        String gender = tfGenderPasien.getSelectedItem().toString();
        String tglLahir = dateformat.format(dcLahirPasien.getDate());
        int umur = Integer.parseInt(tfUmurPasien.getText());
        String telp = tfTeleponPasien.getText();
        String pekerjaan = tfPekerjaanPasien.getText();
        String alamat = tfAlamatPasien.getText();
        
        function.addPasien(nama, gender, tglLahir, telp, pekerjaan, alamat, umur);
        function.loadPasien();
        JOptionPane.showMessageDialog(this, "berhasil di tambahkan");
        tfNamaPasien.setText("");
        tfGenderPasien.setSelectedIndex(0);
        dcLahirPasien.setDate(null);
        tfUmurPasien.setText("");
        tfTeleponPasien.setText("");
        tfPekerjaanPasien.setText("");
        tfAlamatPasien.setText("");
        
        ArrayList<Pasien> lol = function.sien();
        modelPasien.setRowCount(0);
        for (Pasien va: lol){
            modelPasien.addRow(
                  new Object[]{
                       va.getId_pasien(),
                       va.getNamaPasien(),
                       va.getTglLahirPasien(),
                       va.getNoTelpPasien(),
                       va.getPekerjaanPasien(),
                       va.getAlamatPasien()
                  }
            );
        }
    }//GEN-LAST:event_btnTambahPasienActionPerformed

    private void btnPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienActionPerformed
        // TODO add your handling code here:
        uwaw.removeAll();
        uwaw.repaint();
        uwaw.revalidate();

        uwaw.add(ListPasien);
        uwaw.repaint();
        uwaw.revalidate();
        
    }//GEN-LAST:event_btnPasienActionPerformed

    private void btnDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDokterActionPerformed
        // TODO add your handling code here:
        uwaw.removeAll();
        uwaw.repaint();
        uwaw.revalidate();

        uwaw.add(ListDokter);
        uwaw.repaint();
        uwaw.revalidate();
    }//GEN-LAST:event_btnDokterActionPerformed

    private void btnPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegawaiActionPerformed
        // TODO add your handling code here:
        uwaw.removeAll();
        uwaw.repaint();
        uwaw.revalidate();

        uwaw.add(ListPegawai);
        uwaw.repaint();
        uwaw.revalidate();
    }//GEN-LAST:event_btnPegawaiActionPerformed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        ViewLogin menu = new ViewLogin();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void tfPassKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPassKaryawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPassKaryawanActionPerformed

    private void btnTambahKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKaryawanActionPerformed
        // TODO add your handling code here:
        // nama, gender, tanggal lahir, tanggal mulai kerja, no telpon, alamat status, pass
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        
        String nama = tfNamaKaryawan.getText();
        String gender = tfGenderKaryawan.getSelectedItem().toString();
        String tglLahir = dateformat.format(dcLahirKaryawan.getDate());
        String mulaiKerja = dateformat.format(dcMulaiKerjaKaryawan.getDate());
        int status = 0;
        if(cbStatus.getSelectedItem().toString().equalsIgnoreCase("admin")){
            status = 1;
        }
        String pass = auth.MD5(tfPassKaryawan.getText());
        
        function.addKaryawan(nama, gender, tglLahir, mulaiKerja, pass, status);
        function.loadKaryawan();
        JOptionPane.showMessageDialog(this, "berhasil di tambahkan");
        reset();
        function.readKaryawan();
        
    }//GEN-LAST:event_btnTambahKaryawanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAdmin().setVisible(true);
            }
        });
    }
    
    private javax.swing.JPanel adminPanel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ListDokter;
    private javax.swing.JPanel ListPasien;
    private javax.swing.JPanel ListPegawai;
    private javax.swing.JButton btnDokter;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JButton btnPasien;
    private javax.swing.JButton btnPegawai;
    private javax.swing.JButton btnTambahDokter;
    private javax.swing.JButton btnTambahKaryawan;
    private javax.swing.JButton btnTambahPasien;
    private javax.swing.JComboBox<String> cbKdPoliklinik;
    private javax.swing.JComboBox<String> cbKdSpesialis1;
    private javax.swing.JComboBox<String> cbStatus;
    private com.toedter.calendar.JDateChooser dcKerjaDokter;
    private com.toedter.calendar.JDateChooser dcLahirDokter;
    private com.toedter.calendar.JDateChooser dcLahirKaryawan;
    private com.toedter.calendar.JDateChooser dcLahirPasien;
    private com.toedter.calendar.JDateChooser dcMulaiKerjaKaryawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblDokter;
    private javax.swing.JTable tblPasien;
    private javax.swing.JTable tblPegawai;
    private javax.swing.JTextField tfAlamatDokter;
    private javax.swing.JTextField tfAlamatPasien;
    private javax.swing.JComboBox<String> tfGenderDokter;
    private javax.swing.JComboBox<String> tfGenderKaryawan;
    private javax.swing.JComboBox<String> tfGenderPasien;
    private javax.swing.JTextField tfNamaDokter;
    private javax.swing.JTextField tfNamaKaryawan;
    private javax.swing.JTextField tfNamaPasien;
    private javax.swing.JTextField tfPassDokter;
    private javax.swing.JTextField tfPassKaryawan;
    private javax.swing.JLabel tfPekerjaan;
    private javax.swing.JTextField tfPekerjaanPasien;
    private javax.swing.JTextField tfTeleponDokter;
    private javax.swing.JTextField tfTeleponPasien;
    private javax.swing.JTextField tfUmurPasien;
    private javax.swing.JPanel uwaw;
    // End of variables declaration//GEN-END:variables
}

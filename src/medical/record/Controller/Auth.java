/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record.Controller;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.ConditionalFeature;
import javax.swing.JOptionPane;
import medical.record.Model.Karyawan;
import medical.record.View.ViewLogin;

/**
 *
 * @author saftrn
 */
public class Auth {
    Connection conn;
    private int id;
    private String password;

    public Auth() {
    }

    public Auth(Connection conn) {
        this.conn = conn;
    }
    
    public Auth(Connection conn, int id, String password) {
        this.conn = conn;
        this.id = id;
        this.password = password;
    }
    
    public String MD5(String pass){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(pass.getBytes());
            
            BigInteger nmbr = new BigInteger(1, messageDigest);
            String hashText = nmbr.toString(16);
            while (hashText.length() < 32) {
                hashText = "0" + hashText;   
            }
            
            return hashText;
        }catch(NoSuchAlgorithmException e){
          throw new RuntimeException(e); 
        }        
    }
    
    public boolean Login(int id, String pass){
        boolean status = false;
        if(conn != null){
            try{
                String query = "SELECT * FROM karyawan WHERE id_karyawan = ? AND password = ?";           
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, id);
                ps.setString(2 , pass);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    status = true;
                }
            }catch(SQLException e){
            Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return status;
    }
    
     public boolean checkPassword(){
        boolean cekTrue = false;
        if(conn != null){
            try{
                String query = "SELECT password FROM kar WHERE username = ?";           
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if(rs.getString("password") == password){
                    cekTrue = true;
                }
            }catch(SQLException e){
                Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return cekTrue;
    }  
    
     public Karyawan session(){
         Karyawan karyawan = null;
         if(conn != null){
             try{
                String query = "SELECT * FROM tb_akun WHERE username = ? AND password = ?";           
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1, id);
                ps.setString(2 , password);
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    karyawan = new Karyawan(
                            rs.getInt("id_karyawan"),
                            rs.getString("nama_kayawan"),
                            rs.getString("jns_kelamin"),
                            rs.getString("tgl_lahir"),
                            rs.getString("tgl_mulai_bekerja")
                    );                    
                }
             }catch(SQLException ex){
                Logger.getLogger(ViewLogin.class.getName()).log(Level.SEVERE,null,ex);
             }
         }
         return karyawan;
     }
}

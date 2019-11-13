/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record;

/**
 *
 * @author zetsuen
 */
import java.sql.*;

public class Conf {
    static Connection conn;
    static Statement stm;
    static ResultSet rs;
    static String user = "root";
    static String pass = "";
    
    
    
    public static void main(String[]args){
        try{
            String url ="jdbc:mysql://localhost/MedicalRecord?serverTimezone=UTC";
            conn = DriverManager.getConnection(url,user,pass);
            stm =  conn.createStatement();
            
            if(conn != null){
                System.out.println("koneksi berhasil");
            }
        }catch(SQLException ex){
           System.out.println(ex.getMessage());
           
        }
    }
    
    
}

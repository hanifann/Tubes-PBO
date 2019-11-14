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
    static String url = "jdbc:mysql://localhost/MedicalRecord?serverTimezone=UTC";
    
    
    
    public static Connection connect(){
        if(conn == null){
            try{
                conn = DriverManager.getConnection(url,user,pass);
            }catch(SQLException e){
                System.err.format("SQL State : %s\n%s", e.getSQLState(), e.getMessage());
            }catch(Exception e){
                e.printStackTrace();
            }            
        }return conn;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.database;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Jacker
 */
public class DB {
    
    public  static Connection con = null;
    public static void loadConnection(){
        String url="jdbc:mysql://localhost:3306/world";
        String root="root";
        String pass="123456";
        
        try {
            con = DriverManager.getConnection(url,root,pass);
            
            if(con!=null){
                JOptionPane.showMessageDialog(null, "Kết nối thành công");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chưa thể kết nối"+e);
        }
    }
}

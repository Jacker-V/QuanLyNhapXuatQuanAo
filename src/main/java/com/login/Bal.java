/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import com.database.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacker
 */
public class Bal {
    public boolean insertDataSignUp(Bean beanObj) {
        boolean b = false;
        try {
            String fullName = beanObj.getFullName();
            String SDT = beanObj.getSDT();
            String password = beanObj.getPass();

            // Kiểm tra rỗng
            if (fullName == null || fullName.trim().isEmpty()
                    || SDT == null || SDT.trim().isEmpty()
                    || password == null || password.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
                return b;
            }

            // Kiểm tra SDT có phải là số và đủ 10 chữ số
            if (!SDT.matches("\\d{10,}")) {
                JOptionPane.showMessageDialog(null, "Số điện thoại phải là số và có ít nhất 10 chữ số");
                return b;
            }

            // Kiểm tra xem SDT có tồn tại trong bảng nhanvien không
            String checkNhanVienQuery = "SELECT * FROM nhanvien WHERE SDT = ?";
            PreparedStatement checkPs = DB.con.prepareStatement(checkNhanVienQuery);
            checkPs.setString(1, SDT);
            ResultSet rs = checkPs.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Số điện thoại không tồn tại trong hệ thống nhân viên");
                return b;
            }

            // Nếu mọi thứ hợp lệ, tiến hành insert
            String query = "INSERT INTO user VALUES (null, ?, ?, ?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, fullName);
            ps.setString(2, SDT);
            ps.setString(3, password);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Đăng kí tài khoản thành công");
            b = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + e.getMessage());
        }
        return b;
    }

    
    public boolean checkLogin(String FullName, String pass){
        boolean b = false;
        try {
            
            
            String query = "select FullName, Password from user where FullName = '"+FullName+"'AND Password= '"+pass+"'";
            Statement st = DB.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                
                b= true;
            }else{
                JOptionPane.showMessageDialog(null,"Đăng nhập không thành công");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+ e);
        }
        return b;
    }
    
    
}

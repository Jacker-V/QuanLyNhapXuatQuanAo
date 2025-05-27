/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhanvien;

import com.database.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacker
 */
public class NhanVienBal {
    public List<NhanVienBeans> loadData(){
        List<NhanVienBeans> list = new ArrayList<NhanVienBeans>();
        try {
            String query = "select * from nhanvien";
            PreparedStatement ps = DB.con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idnhanvien = rs.getInt("idnhanvien");
                String FullName = rs.getString("FullName");
                String ChucVu = rs.getString("ChucVu");
                float MucLuong = rs.getFloat("MucLuong");
                String SDT = rs.getString("SDT");
                String DiaChi = rs.getString("DiaChi");
                
                
                NhanVienBeans bean = new NhanVienBeans(idnhanvien, FullName, ChucVu, MucLuong, SDT, DiaChi);
                list.add(bean);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e);
        }
        return list;
        
      
    }
    
    
    
    
    
    public void insert(NhanVienBeans nhapBean){
        try {
            // Bước 1: Kiểm tra số điện thoại đã tồn tại hay chưa
            String checkQuery = "SELECT COUNT(*) FROM nhanvien WHERE SDT = ?";
            PreparedStatement checkPs = DB.con.prepareStatement(checkQuery);
            checkPs.setString(1, nhapBean.getSDT());
            ResultSet rs = checkPs.executeQuery();

            rs.next();
            int count = rs.getInt(1);

            if (count > 0) {
                // Nếu đã tồn tại
                JOptionPane.showMessageDialog(null, "Số điện thoại nhân viên đã tồn tại, vui lòng cập nhật!");
            } else {
                // Nếu chưa tồn tại, tiến hành thêm mới
                String query = "INSERT INTO nhanvien VALUES (null, ?, ?, ?, ?, ?)";
                PreparedStatement ps = DB.con.prepareStatement(query);
                ps.setString(1, nhapBean.getFullName());
                ps.setString(2, nhapBean.getChucVu());
                ps.setFloat(3, nhapBean.getMucLuong());
                ps.setString(4, nhapBean.getSDT());
                ps.setString(5, nhapBean.getDiaChi());

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + e.getMessage());
        }
        
    }
    
    
    public NhanVienBeans returnAllDataToTextFields(int id){
        NhanVienBeans bean = null;
        try {
            String query = "select * from nhanvien where idnhanvien = "+id;
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()){
                int idnhanvien = rs.getInt("idnhanvien");
                String FullName = rs.getString("FullName");
                String ChucVu = rs.getString("ChucVu");
                float MucLuong = rs.getFloat("MucLuong");
                String SDT = rs.getString("SDT");
                String DiaChi = rs.getString("DiaChi");
                
                bean = new NhanVienBeans(idnhanvien, FullName, ChucVu, MucLuong, SDT, DiaChi);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
    }
    
    
    //Update
    public void updateData(NhanVienBeans nhapBean){
        try {
            String query = "update nhanvien set FullName = ?, ChucVu = ?, MucLuong = ?, SDT = ?,DiaChi = ? WHERE idnhanvien = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(6, nhapBean.getIdnhanvien());
            ps.setString(1, nhapBean.getFullName());
            ps.setString(2, nhapBean.getChucVu());
            ps.setFloat(3, nhapBean.getMucLuong());
            ps.setString(4, nhapBean.getSDT());
            ps.setString(5, nhapBean.getDiaChi());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã cập nhật lại thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    public void deleteData(int id){
        try {
            String query = "delete from nhanvien WHERE idnhanvien = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(1, id);
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã xóa nhân viên thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
}

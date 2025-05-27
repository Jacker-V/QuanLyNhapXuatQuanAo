/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khachhang;

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
public class KhachHangBal {
    
    public List<KhachHangBean> loadData(){
        List<KhachHangBean> list = new ArrayList<KhachHangBean>();
        try {
            String query = "select * from khachhang";
            PreparedStatement ps = DB.con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idkhachhang = rs.getInt("idkhachhang");
                String FullName = rs.getString("FullName");
//                String ChucVu = rs.getString("ChucVu");
//                float MucLuong = rs.getFloat("MucLuong");
                String SDT = rs.getString("SDT");
                String DiaChi = rs.getString("DiaChi");
                
                
                KhachHangBean bean = new KhachHangBean(idkhachhang, FullName, SDT, DiaChi);
                list.add(bean);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e);
        }
        return list;
        
      
    }
    
    
    
    
    
    public void insert(KhachHangBean nhapBean){
        try {
            // Bước 1: Kiểm tra số điện thoại đã tồn tại hay chưa
            String checkQuery = "SELECT COUNT(*) FROM khachhang WHERE SDT = ?";
            PreparedStatement checkPs = DB.con.prepareStatement(checkQuery);
            checkPs.setString(1, nhapBean.getSDT());
            ResultSet rs = checkPs.executeQuery();

            rs.next();
            int count = rs.getInt(1);

            if (count > 0) {
                // Nếu đã tồn tại
                JOptionPane.showMessageDialog(null, "Số điện thoại khách hàng đã tồn tại, vui lòng cập nhật!");
            } else {
                // Nếu chưa tồn tại, tiến hành thêm mới
                String query = "INSERT INTO khachhang VALUES (null, ?, ?, ?)";
                PreparedStatement ps = DB.con.prepareStatement(query);
                ps.setString(1, nhapBean.getFullName());
                ps.setString(2, nhapBean.getSDT());
                ps.setString(3, nhapBean.getDiaChi());

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Thêm khách hàng thành công!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi: " + e.getMessage());
        }
        
    }
    
    
    public KhachHangBean returnAllDataToTextFields(int id){
        KhachHangBean bean = null;
        try {
            String query = "select * from khachhang where idkhachhang = "+id;
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()){
                int idkhachhang = rs.getInt("idkhachhang");
                String FullName = rs.getString("FullName");
//                String ChucVu = rs.getString("ChucVu");
//                float MucLuong = rs.getFloat("MucLuong");
                String SDT = rs.getString("SDT");
                String DiaChi = rs.getString("DiaChi");
                
                bean = new KhachHangBean(idkhachhang, FullName, SDT, DiaChi);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
    }
    
    
    //Update
    public void updateData(KhachHangBean nhapBean){
        try {
            String query = "update khachhang set FullName = ?,SDT = ?,DiaChi = ? WHERE idkhachhang = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(4, nhapBean.getIdkhachhang());
            ps.setString(1, nhapBean.getFullName());
            ps.setString(2, nhapBean.getSDT());
//            ps.setFloat(3, nhapBean.getMucLuong());
//            ps.setString(4, nhapBean.getSDT());
            ps.setString(3, nhapBean.getDiaChi());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã cập nhật lại thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    public void deleteData(int id){
        try {
            String query = "delete from khachhang WHERE idkhachhang = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(1, id);
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã xóa nhân viên thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
}


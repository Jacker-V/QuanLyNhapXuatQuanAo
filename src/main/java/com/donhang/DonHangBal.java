/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donhang;

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
public class DonHangBal {
    
    public List<DonHangBean> loadData(){
        List<DonHangBean> list = new ArrayList<DonHangBean>();
        try {
            String query = "select * from donhang";
            PreparedStatement ps = DB.con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int iddonhang = rs.getInt("iddonhang");
                String TenSanPham = rs.getString("TenSanPham");
                String KhachHang = rs.getString("KhachHang");
                float Gia = rs.getFloat("Gia");
                String NgayXuat = rs.getString("NgayXuat");
                String Size = rs.getString("Size");
                String Mau = rs.getString("Mau");
                int SoLuong = rs.getInt("SoLuong");
                
                DonHangBean bean = new DonHangBean(iddonhang, TenSanPham, KhachHang, Gia, NgayXuat, Size, Mau, SoLuong);
                list.add(bean);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e);
        }
        return list;
        
      
    }
    
    public DonHangBean returnAllDataToTextFields(int id){
        DonHangBean bean = null;
        try {
            String query = "select * from donhang where iddonhang = "+id;
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()){
                int iddonhang = rs.getInt("iddonhang");
                String TenSanPham = rs.getString("TenSanPham");
                String KhachHang = rs.getString("KhachHang");
                float Gia = rs.getFloat("Gia");
                String NgayXuat = rs.getString("NgayXuat");
                String Size = rs.getString("Size");
                String Mau = rs.getString("Mau");
                int SoLuong = rs.getInt("SoLuong");
                
                bean = new DonHangBean(iddonhang, TenSanPham, KhachHang, Gia, NgayXuat, Size, Mau, SoLuong);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
    }
    
    
    //Update
    public void updateData(DonHangBean nhapBean){
        try {
            String query = "update donhang set TenSanPham = ?, KhachHang = ?, Gia = ?, NgayXuat = ?,Size = ?, Mau = ?, SoLuong = ? WHERE iddonhang = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(8, nhapBean.getIddonhang());
            ps.setString(1, nhapBean.getTenSanPham());
            ps.setString(2, nhapBean.getKhachHang());
            ps.setFloat(3, nhapBean.getGia());
            ps.setString(4, nhapBean.getNgayXuat());
            ps.setString(5, nhapBean.getSize());
            ps.setString(6, nhapBean.getMau());
            ps.setInt(7, nhapBean.getSoLuong());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã cập nhật lại thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    public void deleteData(int id){
        try {
            String query = "delete from donhang WHERE iddonhang = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(1, id);
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã xóa đơn hàng thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
}

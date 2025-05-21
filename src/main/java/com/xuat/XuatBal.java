/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xuat;

import com.database.DB;
import com.nhap.NhapBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacker
 */
public class XuatBal {
    public List<XuatBean> loadData(){
        List<XuatBean> list = new ArrayList<XuatBean>();
        try {
            String query = "select * from sanpham";
            PreparedStatement ps = DB.con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int idsanpham = rs.getInt("idsanpham");
                String TenSanPham = rs.getString("TenSanPham");
                String NhaCungCap = rs.getString("NhaCungCap");
                float GiaNhap = rs.getFloat("GiaNhap");
                String NgayNhap = rs.getString("NgayNhap");
                String Size = rs.getString("Size");
                String Mau = rs.getString("Mau");
                int SoLuong = rs.getInt("SoLuong");
                
                XuatBean bean = new XuatBean(idsanpham,TenSanPham, NhaCungCap, GiaNhap, NgayNhap, Size, Mau, SoLuong);
                list.add(bean);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e);
        }
        
    
        return list;
    }
    
    public XuatBean returnAllDataToTextFields(int id){
        XuatBean bean = null;
        try {
            String query = "select * from sanpham where idsanpham = "+id;
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()){
                int idsanpham = rs.getInt("idsanpham");
                String TenSanPham = rs.getString("TenSanPham");
                String NhaCungCap = rs.getString("NhaCungCap");
                float GiaNhap = rs.getFloat("GiaNhap");
                String NgayNhap = rs.getString("NgayNhap");
                String Size = rs.getString("Size");
                String Mau = rs.getString("Mau");
                int SoLuong = rs.getInt("SoLuong");
                
                bean = new XuatBean(idsanpham, TenSanPham, NgayNhap, GiaNhap, NgayNhap, Size, Mau, SoLuong);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
    }
    
    public void updateData(XuatBean bean){
        try {
            String query = "Update sanpham Set SoLuong = SoLuong - ? where idsanpham = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(2, bean.getIdsanpham());
            ps.setInt(1, bean.getSoLuong());
             
            ps.executeUpdate();
            
            
            // Chèn dữ liệu vào bảng đơn hàng
            String insert_query = "insert into donhang values (null,?,?,?,?,?,?,?)";
            PreparedStatement ps2 = DB.con.prepareStatement(insert_query);
            ps2.setString(1, bean.getTenSanPham());
            ps2.setString(2, bean.getNhaCungCap());
            ps2.setFloat(3, bean.getGiaNhap());
            ps2.setString(4, bean.getNgayNhap());
            ps2.setString(5, bean.getSize());
            ps2.setString(6, bean.getMau());
            ps2.setInt(7, bean.getSoLuong());
            
            ps2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Xuất thành công");
            System.out.println("1");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+bean);
            System.out.println("2");
        }
    }
}

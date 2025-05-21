/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhap;
import java.sql.PreparedStatement;
import com.database.DB;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacker
 */
public class NhapBal {
    
    public List<NhapBean> loadData(){
        List<NhapBean> list = new ArrayList<NhapBean>();
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
                
                NhapBean bean = new NhapBean(idsanpham,TenSanPham, NhaCungCap, GiaNhap, NgayNhap, Size, Mau, SoLuong);
                list.add(bean);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e);
        }
        return list;
        
      
    }
    
    
    
    
    
    public void insert(NhapBean nhapBean){
        try {
            String query = "insert into sanpham values (null,?,?,?,?,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, nhapBean.getTenSanPham());
            ps.setString(2, nhapBean.getNhaCungCap());
            ps.setFloat(3, nhapBean.getGiaNhap());
            ps.setString(4, nhapBean.getNgayNhap());
            ps.setString(5, nhapBean.getSize());
            ps.setString(6, nhapBean.getMau());
            ps.setInt(7, nhapBean.getSoLuong());
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thanh cong");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e);
        }
        
    }
    
    
    public NhapBean returnAllDataToTextFields(int id){
        NhapBean bean = null;
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
                
                bean = new NhapBean(idsanpham,TenSanPham, NhaCungCap, GiaNhap, NgayNhap, Size, Mau, SoLuong);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
    }
    
    
    //Update
    public void updateData(NhapBean nhapBean){
        try {
            String query = "update sanpham set TenSanPham = ?, NhaCungCap = ?, GiaNhap = ?, NgayNhap = ?,Size = ?, Mau = ?, SoLuong = ? WHERE idsanpham = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(8, nhapBean.getIdsanpham());
            ps.setString(1, nhapBean.getTenSanPham());
            ps.setString(2, nhapBean.getNhaCungCap());
            ps.setFloat(3, nhapBean.getGiaNhap());
            ps.setString(4, nhapBean.getNgayNhap());
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
            String query = "delete from sanpham WHERE idsanpham = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(1, id);
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Đã xóa đơn hàng thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    
    
    
    
}

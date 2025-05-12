/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhap;
import java.sql.PreparedStatement;
import com.database.DB;
import java.sql.ResultSet;
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
            String query = "select * from hanghoa";
            PreparedStatement ps = DB.con.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int MaHangHoa = rs.getInt("MaHangHoa");
                String TenHangHoa = rs.getString("TenHangHoa");
                String LoaiHangHoa = rs.getString("LoaiHangHoa");
                String XuatXu = rs.getString("XuatXu");
                String NgaySanXuat = rs.getString("NgaySanXuat");
                float GiaBan = rs.getFloat("GiaBan");
                int SoLuong = rs.getInt("SoLuong");
                
                NhapBean bean = new NhapBean(MaHangHoa, TenHangHoa, LoaiHangHoa, XuatXu, NgaySanXuat, GiaBan, SoLuong);
                list.add(bean);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e);
        }
        return list;
        
      
    }
    
    
    
    
    
    public void insert(NhapBean nhapBean){
        try {
            String query = "insert into hanghoa value (?,?,?,?,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(1, nhapBean.getMaHangHoa());
            ps.setString(2, nhapBean.getTenHangHoa());
            ps.setString(3, nhapBean.getLoaiHangHoa());
            ps.setString(4, nhapBean.getXuatXu());
            ps.setString(5, nhapBean.getNgaySanXuat());
            ps.setFloat(6, nhapBean.getGiaBan());
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
            String query = "select * from hanghoa where MaHangHoa = "+id;
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while (rs.next()){
                int MaHangHoa = rs.getInt("MaHangHoa");
                String TenHangHoa = rs.getString("TenHangHoa");
                String LoaiHangHoa = rs.getString("LoaiHangHoa");
                String XuatXu = rs.getString("XuatXu");
                String NgaySanXuat = rs.getString("NgaySanXuat");
                float GiaBan = rs.getFloat("GiaBan");
                int SoLuong = rs.getInt("SoLuong");
                
                bean = new NhapBean(MaHangHoa, TenHangHoa, LoaiHangHoa, XuatXu, NgaySanXuat, GiaBan, SoLuong);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
    }
}

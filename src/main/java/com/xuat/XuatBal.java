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
                
                XuatBean bean = new XuatBean(MaHangHoa, TenHangHoa, LoaiHangHoa, XuatXu, NgaySanXuat, GiaBan, SoLuong);
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
                
                bean = new XuatBean(MaHangHoa, TenHangHoa, LoaiHangHoa, XuatXu, NgaySanXuat, GiaBan, SoLuong);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return bean;
    }
    
    public void updateData(XuatBean bean){
        try {
            String query = "Update hanghoa Set SoLuong = SoLuong - ? where MaHangHoa = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(2, bean.getMaHangHoa());
            ps.setInt(1, bean.getSoLuong());
             
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Xuất thành công");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+bean);
        }
    }
}

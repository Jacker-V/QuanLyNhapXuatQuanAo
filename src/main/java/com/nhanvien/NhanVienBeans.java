/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhanvien;

/**
 *
 * @author Jacker
 */
public class NhanVienBeans {
    private int idnhanvien;
    private String FullName;
    private String ChucVu;
    private float MucLuong;
    private String SDT;
    private String DiaChi;

    public NhanVienBeans(int idnhanvien, String FullName, String ChucVu, float MucLuong, String SDT, String DiaChi) {
        this.idnhanvien = idnhanvien;
        this.FullName = FullName;
        this.ChucVu = ChucVu;
        this.MucLuong = MucLuong;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
    }

    public int getIdnhanvien() {
        return idnhanvien;
    }

    public void setIdnhanvien(int idnhanvien) {
        this.idnhanvien = idnhanvien;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public float getMucLuong() {
        return MucLuong;
    }

    public void setMucLuong(float MucLuong) {
        this.MucLuong = MucLuong;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
    
    
}

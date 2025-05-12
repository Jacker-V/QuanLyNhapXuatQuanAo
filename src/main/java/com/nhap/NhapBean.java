/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhap;

/**
 *
 * @author Jacker
 */
public class NhapBean {
    private int MaHangHoa;
    private String TenHangHoa;
    private String LoaiHangHoa;
    private String XuatXu;
    private String NgaySanXuat;
    private float GiaBan;
    private int SoLuong;
    
    public NhapBean(int MaHangHoa, String TenHangHoa, String LoaiHangHoa, String XuatXu, String NgaySanXuat, float GiaBan, int SoLuong) {
        this.MaHangHoa = MaHangHoa;
        this.TenHangHoa = TenHangHoa;
        this.LoaiHangHoa = LoaiHangHoa;
        this.XuatXu = XuatXu;
        this.NgaySanXuat = NgaySanXuat;
        this.GiaBan = GiaBan;
        this.SoLuong = SoLuong;
    }
    public int getMaHangHoa() {
        return MaHangHoa;
    }

    public void setMaHangHoa(int MaHangHoa) {
        this.MaHangHoa = MaHangHoa;
    }

    public String getTenHangHoa() {
        return TenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.TenHangHoa = tenHangHoa;
    }

    public String getLoaiHangHoa() {
        return LoaiHangHoa;
    }

    public void setLoaiHangHoa(String loaiHangHoa) {
        this.LoaiHangHoa = loaiHangHoa;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.XuatXu = xuatXu;
    }

    public String getNgaySanXuat() {
        return NgaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.NgaySanXuat = ngaySanXuat;
    }

    public float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(float giaBan) {
        this.GiaBan = giaBan;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        this.SoLuong = soLuong;
    }
}



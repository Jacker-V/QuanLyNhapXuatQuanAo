/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donhang;

/**
 *
 * @author Jacker
 */
public class DonHangBean {
    private int iddonhang;
    private String TenSanPham;
    private String KhachHang;
    private float Gia;
    private String NgayXuat;
    private String Size;
    private String Mau;
    private int SoLuong;

    public DonHangBean(int iddonhang, String TenSanPham, String KhachHang, float Gia, String NgayXuat, String Size, String Mau, int SoLuong) {
        this.iddonhang = iddonhang;
        this.TenSanPham = TenSanPham;
        this.KhachHang = KhachHang;
        this.Gia = Gia;
        this.NgayXuat = NgayXuat;
        this.Size = Size;
        this.Mau = Mau;
        this.SoLuong = SoLuong;
    }

    public int getIddonhang() {
        return iddonhang;
    }

    public void setIddonhang(int iddonhang) {
        this.iddonhang = iddonhang;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public String getKhachHang() {
        return KhachHang;
    }

    public void setKhachHang(String KhachHang) {
        this.KhachHang = KhachHang;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public String getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(String NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
    
}

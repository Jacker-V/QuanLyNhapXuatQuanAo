/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhap;

import java.time.LocalDate;

/**
 *
 * @author Jacker
 */
public class NhapBean {
    private int idsanpham;
    private String TenSanPham;
    private String NhaCungCap;
    private float GiaNhap;
    private String NgayNhap;
    private String Size;
    private String Mau;
    private int SoLuong;

    public NhapBean(int idsanpham, String TenSanPham, String NhaCungCap, float GiaNhap, String NgayNhap, String Size, String Mau, int SoLuong) {
        this.idsanpham = idsanpham;
        this.TenSanPham = TenSanPham;
        this.NhaCungCap = NhaCungCap;
        this.GiaNhap = GiaNhap;
        this.NgayNhap = NgayNhap;
        this.Size = Size;
        this.Mau = Mau;
        this.SoLuong = SoLuong;
    }

    public int getIdsanpham() {
        return idsanpham;
    }

    public void setIdsanpham(int idsanpham) {
        this.idsanpham = idsanpham;
    }
    
    

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public String getNhaCungCap() {
        return NhaCungCap;
    }

    public void setNhaCungCap(String NhaCungCap) {
        this.NhaCungCap = NhaCungCap;
    }

    public float getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(float GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
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



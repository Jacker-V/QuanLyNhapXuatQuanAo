/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khachhang;

/**
 *
 * @author Jacker
 */
public class KhachHangBean {
    private int idkhachhang;
    private String FullName;
    private String SDT;
//    private float MucLuong;
//    private String SDT;
    private String DiaChi;

    public KhachHangBean(int idkhachhang, String FullName, String SDT, String DiaChi) {
        this.idkhachhang = idkhachhang;
        this.FullName = FullName;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
    }

    public int getIdkhachhang() {
        return idkhachhang;
    }

    public void setIdkhachhang(int idkhachhang) {
        this.idkhachhang = idkhachhang;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
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

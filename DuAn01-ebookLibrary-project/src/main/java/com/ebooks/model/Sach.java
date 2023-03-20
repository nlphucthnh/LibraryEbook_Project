/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebooks.model;

import java.time.Year;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Sach {

    private String maSach;
    private String tenSach;
    private String maNXB;
    private String moTa;
    private Date namXuatBan;
    private String biaTruoc;
    private String duongDan;
    private String tenDangNhap;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String maNXB, String moTa, Date namXuatBan, String biaTruoc, String duongDan, String tenDangNhap) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.maNXB = maNXB;
        this.moTa = moTa;
        this.namXuatBan = namXuatBan;
        this.biaTruoc = biaTruoc;
        this.duongDan = duongDan;
        this.tenDangNhap = tenDangNhap;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Date getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(Date namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getBiaTruoc() {
        return biaTruoc;
    }

    public void setBiaTruoc(String biaTruoc) {
        this.biaTruoc = biaTruoc;
    }

    public String getDuongDan() {
        return duongDan;
    }

    public void setDuongDan(String duongDan) {
        this.duongDan = duongDan;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    
    

  

}

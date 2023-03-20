/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebooks.model;

import java.sql.Time;

/**
 *
 * @author Admin
 */
public class TaiKhoan {

    private String tenDangNhap;
    private String matKhau;
    private boolean trangThai;
    private boolean vaiTro;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenDangNhap, String matKhau, boolean trangThai, boolean vaiTro) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
       
        this.trangThai = trangThai;
        this.vaiTro = vaiTro;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

   

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    

}

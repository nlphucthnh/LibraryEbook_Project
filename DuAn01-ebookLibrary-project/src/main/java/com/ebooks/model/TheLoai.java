/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebooks.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class TheLoai {
    private String maTheLoai;
    private String tenTheLoai;
    private String moTaTheLoai;
    private Date ngayTao;
    private String tenDangNhap;

    public TheLoai() {
    }

    public TheLoai(String maTheLoai, String tenTheLoai, String moTaTheLoai, Date ngayTao, String tenDangNhap) {
        this.maTheLoai = maTheLoai;
        this.tenTheLoai = tenTheLoai;
        this.moTaTheLoai = moTaTheLoai;
        this.ngayTao = ngayTao;
        this.tenDangNhap = tenDangNhap;
    }

    public String getMaTheLoai() {
        return maTheLoai;
    }

    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public String getTenTheLoai() {
        return tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    public String getMoTaTheLoai() {
        return moTaTheLoai;
    }

    public void setMoTaTheLoai(String moTaTheLoai) {
        this.moTaTheLoai = moTaTheLoai;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    

   
    
}

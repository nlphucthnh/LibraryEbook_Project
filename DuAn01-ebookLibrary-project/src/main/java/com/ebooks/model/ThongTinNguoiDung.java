
package com.ebooks.model;

import java.util.Date;

public class ThongTinNguoiDung {
    private String maNguoiDung;
    private String tenNguoiDung;
    private boolean gioiTinh;
    private Date ngaySinh;
    private String soDienThoai;
    private String email;
    private String anhDaiDien;
    private String tenDangNhap;
    private String moTaCaNhan;

    public ThongTinNguoiDung() {
    }

    public ThongTinNguoiDung(String maNguoiDung, String tenNguoiDung, boolean gioiTinh, Date ngaySinh, String soDienThoai, String email, String anhDaiDien, String tenDangNhap, String motaCaNhan) {
        this.maNguoiDung = maNguoiDung;
        this.tenNguoiDung = tenNguoiDung;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.anhDaiDien = anhDaiDien;
        this.tenDangNhap = tenDangNhap;
        this.moTaCaNhan = motaCaNhan;
    }

    public String getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAnhDaiDien() {
        return anhDaiDien;
    }

    public void setAnhDaiDien(String anhDaiDien) {
        this.anhDaiDien = anhDaiDien;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMoTaCaNhan() {
        return moTaCaNhan;
    }

    public void setMoTaCaNhan(String motaCaNhan) {
        this.moTaCaNhan = motaCaNhan;
    }
    
}

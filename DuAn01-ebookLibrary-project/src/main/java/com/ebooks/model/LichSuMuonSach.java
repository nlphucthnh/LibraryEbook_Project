
package com.ebooks.model;

import java.sql.Time;


public class LichSuMuonSach {
    private String maLichSuMuonSach;
    private String tenDangNhap; 
    private Time thoiGianMuon;
    private String maSach;
    private String maMuonSachChiTiet;

    public LichSuMuonSach() {
    }

    public LichSuMuonSach(String maLichSuMuonSach, String tenDangNhap, Time thoiGianMuon, String maSach, String maMuonSachChiTiet) {
        this.maLichSuMuonSach = maLichSuMuonSach;
        this.tenDangNhap = tenDangNhap;
        this.thoiGianMuon = thoiGianMuon;
        this.maSach = maSach;
        this.maMuonSachChiTiet = maMuonSachChiTiet;
    }

    public String getMaLichSuMuonSach() {
        return maLichSuMuonSach;
    }

    public void setMaLichSuMuonSach(String maLichSuMuonSach) {
        this.maLichSuMuonSach = maLichSuMuonSach;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public Time getThoiGianMuon() {
        return thoiGianMuon;
    }

    public void setThoiGianMuon(Time thoiGianMuon) {
        this.thoiGianMuon = thoiGianMuon;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getMaMuonSachChiTiet() {
        return maMuonSachChiTiet;
    }

    public void setMaMuonSachChiTiet(String maMuonSachChiTiet) {
        this.maMuonSachChiTiet = maMuonSachChiTiet;
    }

 
    

   
}

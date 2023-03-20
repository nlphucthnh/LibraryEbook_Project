
package com.ebooks.model;

import java.sql.Time;
import java.util.Date;


public class MuonSach {
    private String maMuonSach;
    private String tenDangNhap;
    private Date thoiGianMuon;

    public MuonSach() {
    }

    public MuonSach(String maMuonSach, String tenDangNhap, Date thoiGianMuon) {
        this.maMuonSach = maMuonSach;
        this.tenDangNhap = tenDangNhap;
        this.thoiGianMuon = thoiGianMuon;
    }

    public String getMaMuonSach() {
        return maMuonSach;
    }

    public void setMaMuonSach(String maMuonSach) {
        this.maMuonSach = maMuonSach;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public Date getThoiGianMuon() {
        return thoiGianMuon;
    }

    public void setThoiGianMuon(Time thoiGianMuon) {
        this.thoiGianMuon = thoiGianMuon;
    }

    
    
}

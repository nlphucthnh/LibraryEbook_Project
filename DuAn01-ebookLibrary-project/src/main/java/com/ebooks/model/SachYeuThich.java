
package com.ebooks.model;

public class SachYeuThich {
    private String tenDangNhap;
    private String maSach;

    public SachYeuThich() {
    }

    public SachYeuThich(String tenDangNhap, String maSach) {
        this.tenDangNhap = tenDangNhap;
        this.maSach = maSach;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    
    
    
}

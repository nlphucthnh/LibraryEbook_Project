
package com.ebooks.model;


public class NhaXuatBan {
    private String maNXB;
    private String tenNXB;
    private String diaChiNXB;
    private String mota;

    public NhaXuatBan() {
    }

    public NhaXuatBan(String maNXB, String tenNXB, String diaChiNXB, String mota) {
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
        this.diaChiNXB = diaChiNXB;
        this.mota = mota;
    }

    public String getMaNXB() {
        return maNXB;
    }

    public void setMaNXB(String maNXB) {
        this.maNXB = maNXB;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public String getDiaChiNXB() {
        return diaChiNXB;
    }

    public void setDiaChiNXB(String diaChiNXB) {
        this.diaChiNXB = diaChiNXB;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    
    
    
    
}

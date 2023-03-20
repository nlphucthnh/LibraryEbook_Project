/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebooks.dao;

import com.ebooks.helper.JdbcHelper;
import com.ebooks.model.TacGia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class TacGiaDAO {
    private TacGia readFromResultSet(ResultSet rs) throws SQLException{
	TacGia model=new TacGia();
        model.setMaTacGia(rs.getString("maTacGia"));
        model.setHoTen(rs.getString("hoTen"));
        model.setGioiTinh(rs.getBoolean("gioiTinh"));
        model.setNgaySinh(rs.getDate("ngaySinh"));
        model.setMoTa(rs.getString("moTa"));
        model.setHinh(rs.getString("hinh"));
        model.setTenDangNhap(rs.getString("tenDangNhap"));
        return model;
    }
    
    private List<TacGia> select(String sql, Object...args){
        List<TacGia> list=new ArrayList<>();
        try {
            ResultSet rs=null;
            try{
                rs=JdbcHelper.executeQuery(sql, args);
                while(rs.next()){
                    list.add(readFromResultSet(rs));
                }
            }finally{
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        return list;
    }
    
    /**
     * Thêm mới thực thể vào CSDL
     * @param entity là thực thể chứa thông tin bản ghi mới
     */
    public void insert(TacGia entity) {
        String sql="INSERT INTO TacGia (hoTen, gioiTinh, ngaySinh, moTa, hinh, tenDangNhap) VALUES (?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                entity.getHoTen(),
                entity.isGioiTinh(),
                entity.getNgaySinh(),
                entity.getMoTa(),
                entity.getHinh(),
                entity.getTenDangNhap());
    }
    /**
     * Cập nhật thực thể vào CSDL
     * @param entity là thực thể chứa thông tin bản ghi cần cập nhật
     */
    public void update(TacGia entity) {
        String sql="UPDATE TacGia SET hoTen=?, gioiTinh=?, ngaySinh=?, moTa=?, hinh=?, tenDangNhap=? WHERE maTacGia=?";
        JdbcHelper.executeUpdate(sql,
                entity.getHoTen(),
                entity.isGioiTinh(),
                entity.getNgaySinh(),
                entity.getMoTa(),
                entity.getHinh(),
                entity.getTenDangNhap(),
                entity.getMaTacGia());
    }
    
    /**
     * Xóa bản ghi khỏi CSDL
     * @param id là mã của bản ghi cần xóa
     */
    public void delete(String id) {
        String sql="DELETE FROM TacGia WHERE MaTacGia=?";
        JdbcHelper.executeUpdate(sql, id);
    }
    
    /**
     * Truy vấn tất cả các các thực thể
     * @return list danh sách các thực thể
     */
    public List<TacGia> selectAll() {
        String sql="SELECT * FROM TacGia";
        return select(sql);
    }
    
    /**
     * Truy vấn thực thể theo mã id
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
    public TacGia findById(String id) {
        String sql="SELECT * FROM TacGia WHERE MaTacGia=?";
        List<TacGia> list=select(sql,id);
        return list.size()>0?list.get(0):null;
    }
    
    public TacGia findByName(String name) {
        String sql="SELECT * FROM TacGia WHERE hoTen like ?";
        List<TacGia> list=select(sql,"%"+name+"%");
        return list.size()>0?list.get(0):null;
    }
    
}

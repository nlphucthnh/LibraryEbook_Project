/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebooks.dao;

import com.ebooks.helper.JdbcHelper;
import com.ebooks.model.MuonSach;
import com.ebooks.model.MuonSachChiTiet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thinh
 */
public class MuonSachChiTietDAO {
     private MuonSachChiTiet readFromResultSet(ResultSet rs) throws SQLException {
        MuonSachChiTiet model = new MuonSachChiTiet();
        model.setMaMuonSachChiTiet(rs.getString("maMuonSachChiTiet")); 
        model.setMaMuonSach(rs.getString("maMuonSach"));
        model.setMaSach(rs.getString("maSach"));
        return model;
    }

    private List<MuonSachChiTiet> select(String sql, Object... args) {
        List<MuonSachChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    list.add(readFromResultSet(rs));
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            throw new RuntimeException();
        }
        return list;
    }

    /**
     * Thêm mới thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi mới
     */
    public void insert(MuonSachChiTiet entity) {
        String sql = "INSERT INTO MuonSachChiTiet(maMuonSach,maSach) VALUES(?,?)";
        JdbcHelper.executeUpdate(sql,
               entity.getMaMuonSach(),
               entity.getMaSach()
        );
    }

    /**
     * Cập nhật thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi cần cập nhật
     */
    public void update(MuonSachChiTiet entity) {
        String sql = "UPDATE MuonSachChiTiet SET maMuonSach=?, maSach=? WHERE maMuonSachChiTiet=?";
        JdbcHelper.executeUpdate(sql,
                entity.getMaMuonSach(),
                entity.getMaSach(),
                entity.getMaMuonSachChiTiet()
        );
    }

    /**
     * Xóa bản ghi khỏi CSDL
     *
     * @param id là mã của bản ghi cần xóa
     */
    public void delete(String id) {
        String sql = "DELETE FROM MuonSachChiTiet WHERE maMuonSachChiTiet=?";
        JdbcHelper.executeUpdate(sql, id);
    }

    /**
     * Truy vấn tất cả các các thực thể
     *
     * @return list danh sách các thực thể
     */
    
    public List<MuonSachChiTiet> selectAll() {
        String sql = "SELECT * FROM MuonSachChiTiet";
        return select(sql);
    }

    /**
     * Truy vấn thực thể theo mã id
     *
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
    public MuonSachChiTiet findById(String id) {
        String sql = "SELECT * FROM MuonSachChiTiet WHERE maMuonSachChiTiet=?";
        List<MuonSachChiTiet> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
}

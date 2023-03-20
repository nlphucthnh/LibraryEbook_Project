/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebooks.dao;

import com.ebooks.helper.JdbcHelper;
import com.ebooks.model.SachYeuThich;
import com.ebooks.model.TacGia_Sach;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thinh
 */
public class TacGia_SachDAO {
    private TacGia_Sach readFromResultSet(ResultSet rs) throws SQLException {
        TacGia_Sach model = new TacGia_Sach();
        model.setMaSach(rs.getString("maSach"));
        model.setMaTacGia(rs.getString("maTacGia"));
        return model;
    }

    private List<TacGia_Sach> select(String sql, Object... args) {
        List<TacGia_Sach> list = new ArrayList<>();
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
    public void insert(TacGia_Sach entity) {
        String sql = "INSERT INTO TacGia_Sach(maSach,maTacGia)VALUES(?,?)";
        JdbcHelper.executeUpdate(sql,
               entity.getMaSach(),
               entity.getMaTacGia()
        );
    }

    /**
     * Cập nhật thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi cần cập nhật
     */


    /**
     * Xóa bản ghi khỏi CSDL
     *
     * @param id là mã của bản ghi cần xóa
     */
    public void delete(TacGia_Sach entity) {
        String sql = "DELETE FROM TacGia_Sach WHERE maSach=? AND maTacGia=?";
        JdbcHelper.executeUpdate(sql,
               entity.getMaSach(),
               entity.getMaTacGia()
        );
    }

    /**
     * Truy vấn tất cả các các thực thể
     *
     * @return list danh sách các thực thể
     */
    
    public List<TacGia_Sach> selectAll() {
        String sql = "SELECT * FROM TacGia_Sach";
        return select(sql);
    }

    /**
     * Truy vấn thực thể theo mã id
     *
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
    public TacGia_Sach findById(String id) {
        String sql = "SELECT * FROM TacGia_Sach WHERE maSach=? AND maTacGia=?";
        List<TacGia_Sach> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
}

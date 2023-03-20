/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebooks.dao;

import com.ebooks.helper.DialogHelper;
import com.ebooks.helper.JdbcHelper;
import com.ebooks.model.ThongTinNguoiDung;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ThongTinNguoiDungDAO {

    private ThongTinNguoiDung readFromResultSet(ResultSet rs) throws SQLException {
        ThongTinNguoiDung model = new ThongTinNguoiDung();
        model.setMaNguoiDung(rs.getString("maNguoiDung"));
        model.setTenNguoiDung(rs.getString("tenNguoiDung"));
        model.setGioiTinh(rs.getBoolean("gioiTinh"));
        model.setNgaySinh(rs.getDate("ngaySinh"));
        model.setSoDienThoai(rs.getString("SoDienThoai"));
        model.setEmail(rs.getString("Email"));
        model.setAnhDaiDien(rs.getString("anhDaiDien"));
        model.setTenDangNhap(rs.getString("tenDangNhap"));
        model.setAnhDaiDien(rs.getString("motaCaNhan"));
        return model;
    }

    private List<ThongTinNguoiDung> select(String sql, Object... args) {
        List<ThongTinNguoiDung> list = new ArrayList<>();
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
            throw new RuntimeException();
        }
        return list;
    }

    /**
     * Thêm mới thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi mới
     */
    public void insert(ThongTinNguoiDung entity) {
        String sql = "INSERT INTO NguoiDung (maNguoiDung, hoTen, gioiTinh, soDienThoai, email, anhDaiDien,tenDangNhap, moTaCaNhan) VALUES (?, ?, ?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql,
                entity.getMaNguoiDung(),
                entity.getTenNguoiDung(),
                entity.isGioiTinh(),
                entity.getSoDienThoai(),
                entity.getEmail(),
                entity.getAnhDaiDien(),
                entity.getTenDangNhap(),
                entity.getMoTaCaNhan());
    }

    /**
     * Cập nhật thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi cần cập nhật
     */
    public void update(ThongTinNguoiDung entity) {
        String sql = "UPDATE dbo.NguoiDung SET hoTen = ?, gioiTinh = ?, soDienThoai = ?, email = ?, anhDaiDien = ? , tenDangNhap=? , moTaCaNhan=? WHERE maNguoiDung = ?";
        JdbcHelper.executeUpdate(sql,
                entity.getTenNguoiDung(),
                entity.isGioiTinh(),
                entity.getSoDienThoai(),
                entity.getEmail(),
                entity.getAnhDaiDien(),
                entity.getTenDangNhap(),
                entity.getMoTaCaNhan(),
                entity.getMaNguoiDung());
        DialogHelper.alert(null, "Cập nhật thành công!");

    }

    /**
     * Xóa bản ghi khỏi CSDL
     *
     * @param id là mã của bản ghi cần xóa
     */
    public void delete(String id) {
        String sql = "DELETE FROM NguoiDung WHERE MaNguoiDung=?";
        JdbcHelper.executeUpdate(sql, id);
    }

    /**
     * Truy vấn tất cả các các thực thể
     *
     * @return list danh sách các thực thể
     */
    public List<ThongTinNguoiDung> selectAll() {
        String sql = "SELECT * FROM NguoiDung";
        return select(sql);
    }
    
    public List<ThongTinNguoiDung> selectAllNotACC() {
        String sql = "SELECT * FROM NguoiDung WHERE maNguoiDung NOT IN (SELECT maNguoiDung FROM TaiKhoan)";
        return select(sql);
    }

    /**
     * Truy vấn thực thể theo mã id
     *
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
    public ThongTinNguoiDung findById(String id) {
        String sql = "SELECT * FROM NguoiDung WHERE MaNguoiDung=?";
        List<ThongTinNguoiDung> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
}

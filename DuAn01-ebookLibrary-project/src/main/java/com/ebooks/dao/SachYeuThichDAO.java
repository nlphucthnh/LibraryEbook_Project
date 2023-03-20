
package com.ebooks.dao;

import com.ebooks.helper.JdbcHelper;
import com.ebooks.model.MuonSach;
import com.ebooks.model.SachYeuThich;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SachYeuThichDAO {
    private SachYeuThich readFromResultSet(ResultSet rs) throws SQLException {
        SachYeuThich model = new SachYeuThich();
        model.setMaSach(rs.getString("maSach"));
        model.setTenDangNhap(rs.getString("tenDangNhap"));
        return model;
    }

    private List<SachYeuThich> select(String sql, Object... args) {
        List<SachYeuThich> list = new ArrayList<>();
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
    public void insert(SachYeuThich entity) {
        String sql = "INSERT INTO SachYeuThich(maSach,tenDangNhap)VALUES(?,?)";
        JdbcHelper.executeUpdate(sql,
               entity.getMaSach(),
               entity.getTenDangNhap()
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
    public void delete(SachYeuThich entity) {
        String sql = "DELETE FROM SachYeuThich WHERE maSach=? AND tenDangNhap=?";
        JdbcHelper.executeUpdate(sql,
               entity.getMaSach(),
               entity.getTenDangNhap()
        );
    }

    /**
     * Truy vấn tất cả các các thực thể
     *
     * @return list danh sách các thực thể
     */
    
    public List<SachYeuThich> selectAll() {
        String sql = "SELECT * FROM SachYeuThich";
        return select(sql);
    }

    /**
     * Truy vấn thực thể theo mã id
     *
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
    public SachYeuThich findById(String id) {
        String sql = "SELECT * FROM SachYeuThich WHERE maSach=? AND tenDangNhap=?";
        List<SachYeuThich> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
}


package com.ebooks.dao;

import com.ebooks.helper.JdbcHelper;
import com.ebooks.model.MuonSach;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MuonSachDAO {
    private MuonSach readFromResultSet(ResultSet rs) throws SQLException {
        MuonSach model = new MuonSach();
        model.setMaMuonSach(rs.getString("maMuonSach"));
        model.setTenDangNhap(rs.getString("tenDangNhap"));
        model.setThoiGianMuon(rs.getTime("thoiGianMuon"));
        return model;
    }

    private List<MuonSach> select(String sql, Object... args) {
        List<MuonSach> list = new ArrayList<>();
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
    public void insert(MuonSach entity) {
        String sql = "INSERT INTO MuonSach(tenDangNhap,thoiGianMuon) VALUES(?,?)";
        JdbcHelper.executeUpdate(sql,
               entity.getTenDangNhap(),
               entity.getThoiGianMuon()
        );
    }

    /**
     * Cập nhật thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi cần cập nhật
     */
    public void update(MuonSach entity) {
        String sql = "UPDATE MuonSach SET tenDangNhap=?, thoiGianMuon=? WHERE maMuonSach=?";
        JdbcHelper.executeUpdate(sql,
                entity.getTenDangNhap(),
                entity.getThoiGianMuon()
        );
    }

    /**
     * Xóa bản ghi khỏi CSDL
     *
     * @param id là mã của bản ghi cần xóa
     */
    public void delete(String id) {
        String sql = "DELETE FROM MuonSach WHERE maMuonSach=?";
        JdbcHelper.executeUpdate(sql, id);
    }

    /**
     * Truy vấn tất cả các các thực thể
     *
     * @return list danh sách các thực thể
     */
    
    public List<MuonSach> selectAll() {
        String sql = "SELECT * FROM MuonSach";
        return select(sql);
    }

    /**
     * Truy vấn thực thể theo mã id
     *
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
    public MuonSach findById(String id) {
        String sql = "SELECT * FROM MuonSach WHERE maMuonSach=?";
        List<MuonSach> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
      
}

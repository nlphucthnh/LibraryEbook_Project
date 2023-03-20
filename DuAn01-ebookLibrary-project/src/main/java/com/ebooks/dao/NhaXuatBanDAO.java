package com.ebooks.dao;

import com.ebooks.helper.JdbcHelper;
import com.ebooks.model.MuonSach;
import com.ebooks.model.NhaXuatBan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhaXuatBanDAO {

    private NhaXuatBan readFromResultSet(ResultSet rs) throws SQLException {
        NhaXuatBan model = new NhaXuatBan();
        model.setMaNXB(rs.getString("maNXB"));
        model.setTenNXB(rs.getString("tenNXB"));
        model.setDiaChiNXB(rs.getString("diaChiNXB"));
        model.setMota(rs.getString("mota"));
        return model;
    }

    private List<NhaXuatBan> select(String sql, Object... args) {
        List<NhaXuatBan> list = new ArrayList<>();
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
    public void insert(NhaXuatBan entity) {
        String sql = "INSERT INTO NhaXuatBan(tenNXB,diaChiNXB,mota)VALUES(?,?,?)";
        JdbcHelper.executeUpdate(sql,
                entity.getTenNXB(),
                entity.getDiaChiNXB(),
                entity.getMota()
        );
    }

    /**
     * Cập nhật thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi cần cập nhật
     */
    public void update(NhaXuatBan entity) {
        String sql = "UPDATE NhaXuatBan SET tenNXB=?, diaChiNXB=?, mota=? WHERE maNXB=?";
        JdbcHelper.executeUpdate(sql,
                entity.getTenNXB(),
                entity.getDiaChiNXB(),
                entity.getMota(),
                entity.getMaNXB()
        );
    }

    /**
     * Xóa bản ghi khỏi CSDL
     *
     * @param id là mã của bản ghi cần xóa
     */
    public void delete(String id) {
        String sql = "DELETE FROM NhaXuatBan WHERE maNXB=?";
        JdbcHelper.executeUpdate(sql, id);
    }

    /**
     * Truy vấn tất cả các các thực thể
     *
     * @return list danh sách các thực thể
     */
    public List<NhaXuatBan> selectAll() {
        String sql = "SELECT * FROM NhaXuatBan";
        return select(sql);
    }

    /**
     * Truy vấn thực thể theo mã id
     *
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
    public NhaXuatBan findById(String id) {
        String sql = "SELECT * FROM NhaXuatBan WHERE maNXB=?";
        List<NhaXuatBan> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
}

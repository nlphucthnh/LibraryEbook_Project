
package com.ebooks.dao;

import com.ebooks.helper.JdbcHelper;
import com.ebooks.model.LichSuMuonSach;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LichSuMuonSachDAO {
    private LichSuMuonSach readFromResultSet(ResultSet rs) throws SQLException{
	LichSuMuonSach model=new LichSuMuonSach();
        model.setMaLichSuMuonSach(rs.getString("maLichSuMuonSach"));
        model.setMaSach(rs.getString("maSach"));
        model.setTenDangNhap(rs.getString("TenDangNhap"));
        model.setThoiGianMuon(rs.getTime("ThoiGianMuon"));
        model.setMaMuonSachChiTiet(rs.getString("maMuonSachChiTiet"));
        return model;
    }
    
    private List<LichSuMuonSach> select(String sql, Object...args){
        List<LichSuMuonSach> list=new ArrayList<>();
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
    public void insert(LichSuMuonSach entity) {
        String sql="INSERT INTO LichSuMuonSach(maSach,TenDangNhap,ThoiGianMuon,maMuonSachChiTiet) VALUES(?,?,?,?)";
        JdbcHelper.executeUpdate(sql,
                entity.getMaSach(),
                entity.getTenDangNhap(),
                entity.getThoiGianMuon(),
                entity.getMaMuonSachChiTiet()
        );
    }
    /**
     * Cập nhật thực thể vào CSDL
     * @param entity là thực thể chứa thông tin bản ghi cần cập nhật
     */
    public void update(LichSuMuonSach entity) {
        String sql="UPDATE LichSuMuonSach SET maSach=? , TenDangNhap=?, ThoiGianMuon=?, maMuonSachChiTiet=? WHERE maLichSuMuonSach=?";
        JdbcHelper.executeUpdate(sql,
                entity.getMaSach(),
                entity.getTenDangNhap(),
                entity.getThoiGianMuon(),
                entity.getMaMuonSachChiTiet(),
                entity.getMaLichSuMuonSach()
        );
    }
    
    /**
     * Xóa bản ghi khỏi CSDL
     * @param id là mã của bản ghi cần xóa
     */
    public void delete(String id) {
        String sql="DELETE FROM LichSuMuonSach WHERE maLichSuMuonSach=?";
        JdbcHelper.executeUpdate(sql, id);
    }
    
    /**
     * Truy vấn tất cả các các thực thể
     * @return list danh sách các thực thể
     */
    public List<LichSuMuonSach> selectAll() {
        String sql="SELECT * FROM LichSuMuonSach";
        return select(sql);
    }
    

   
    
    /**
     * Truy vấn thực thể theo mã id
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
    
    
    public LichSuMuonSach findById(String id) {
        String sql="SELECT * FROM LichSuMuonSach WHERE maLichSuMuonSach=?";
        List<LichSuMuonSach> list=select(sql,id);
        return list.size()>0?list.get(0):null;
    }

    
    
    
}

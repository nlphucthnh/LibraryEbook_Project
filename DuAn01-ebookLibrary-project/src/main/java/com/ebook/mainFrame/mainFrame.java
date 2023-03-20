/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ebook.mainFrame;

import com.ebooks.helper.MovingForm;
import com.ebooks.helper.ShareHelper;
import java.awt.Color;

/**
 *
 * @author Thinh
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        lblLogo.setBackground(new Color(0,0,0,0));
        init();
        MovingForm.initMoving(this,pnlHeader);
        
    }
    public void init() {
        //Set icon, show from
        setIconImage(ShareHelper.APP_ICON);
        new StartUpDiaLog(this, true).setVisible(true);
        new LogInDiaLog(this, true).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRadius1 = new com.ebooks.Compoment.PanelRadius();
        pnlHeader = new com.ebooks.Compoment.PanelRound();
        imageAvatar1 = new com.ebooks.Compoment.ImageAvatar();
        btnCaiDat = new com.ebooks.Compoment.MyButton();
        lblLogo = new com.ebooks.Compoment.LabelBoder();
        lblTime1 = new javax.swing.JLabel();
        panelRadius4 = new com.ebooks.Compoment.PanelRadius();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new com.ebooks.Compoment.Table();
        panelRound1 = new com.ebooks.Compoment.PanelRound();
        lblTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCaiDat = new javax.swing.JMenu();
        mnitemDangXuat = new javax.swing.JMenuItem();
        mnTaiKhoan = new javax.swing.JMenu();
        mnitemDoiMatKhau = new javax.swing.JMenuItem();
        mnitemQuenMatKhau = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnitemChuyenTaiKhoan = new javax.swing.JMenuItem();
        mnThongTinSach = new javax.swing.JMenu();
        mnitemNXB = new javax.swing.JMenuItem();
        mnitemTheLoai = new javax.swing.JMenuItem();
        mnitemTacGia = new javax.swing.JMenuItem();
        mnQuanLySach = new javax.swing.JMenu();
        mnitemSach = new javax.swing.JMenuItem();
        mnitemDauSach = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnitemMuonSach = new javax.swing.JMenuItem();
        mnMuonSach = new javax.swing.JMenu();
        mnitemLichSuMS = new javax.swing.JMenuItem();
        mnitemTroGiup = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1280, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRadius1.setBackground(new java.awt.Color(250, 250, 250));
        panelRadius1.setRadius(20);
        panelRadius1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(205, 245, 217));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/41b92ec3eab97e4c24b3f6e8fe75ddec.png"))); // NOI18N
        imageAvatar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAvatar1MouseClicked(evt);
            }
        });
        pnlHeader.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 60, 60));

        btnCaiDat.setBackground(new java.awt.Color(149, 219, 170));
        btnCaiDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Icon/power.png"))); // NOI18N
        btnCaiDat.setBoderColor(new java.awt.Color(205, 239, 215));
        btnCaiDat.setColorClick(new java.awt.Color(255, 102, 102));
        btnCaiDat.setColorOver(new java.awt.Color(255, 102, 102));
        btnCaiDat.setRadius(10);
        btnCaiDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaiDatActionPerformed(evt);
            }
        });
        pnlHeader.add(btnCaiDat, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 40, 40));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/nerds-removebg-preview.png"))); // NOI18N
        lblLogo.setRadius(20);
        pnlHeader.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, 50));

        lblTime1.setFont(new java.awt.Font("Inter Medium", 0, 18)); // NOI18N
        lblTime1.setText("22 : 30 CH");
        pnlHeader.add(lblTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, -1));

        panelRadius1.add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 80));

        panelRadius4.setBackground(new java.awt.Color(205, 239, 215));
        panelRadius4.setRadius(20);
        panelRadius4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Inter SemiBold", 0, 36)); // NOI18N
        jLabel34.setText("NERDS");
        panelRadius4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel35.setFont(new java.awt.Font("Inter Medium", 0, 18)); // NOI18N
        jLabel35.setText("Học tập là ánh mắt của tri thức ");
        panelRadius4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/13.png"))); // NOI18N
        panelRadius4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 300, 150));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/181-removebg-preview.png"))); // NOI18N
        panelRadius4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        panelRadius1.add(panelRadius4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1080, 170));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Bảng Mượn Sách");
        panelRadius1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table1);

        panelRadius1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 1070, 210));

        panelRound1.setBackground(new java.awt.Color(205, 245, 217));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTime.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        lblTime.setText("sat 17/03/2023");
        panelRound1.add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel2.setText("Hệ thống quản lý thư viện online");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        panelRadius1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1120, 40));

        getContentPane().add(panelRadius1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 630));

        mnCaiDat.setText("Cài đặt");

        mnitemDangXuat.setText("Đăng xuất");
        mnitemDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitemDangXuatActionPerformed(evt);
            }
        });
        mnCaiDat.add(mnitemDangXuat);

        jMenuBar1.add(mnCaiDat);

        mnTaiKhoan.setText("Tài khoản");

        mnitemDoiMatKhau.setText("Đổi mật khẩu");
        mnTaiKhoan.add(mnitemDoiMatKhau);

        mnitemQuenMatKhau.setText("Quên mật khẩu");
        mnTaiKhoan.add(mnitemQuenMatKhau);
        mnTaiKhoan.add(jSeparator1);

        mnitemChuyenTaiKhoan.setText("Chuyển tài khoản");
        mnTaiKhoan.add(mnitemChuyenTaiKhoan);

        jMenuBar1.add(mnTaiKhoan);

        mnThongTinSach.setText("Thông tin sách");

        mnitemNXB.setText("Quản lý nhà xuất bản");
        mnThongTinSach.add(mnitemNXB);

        mnitemTheLoai.setText("Quản lý thể loại ");
        mnThongTinSach.add(mnitemTheLoai);

        mnitemTacGia.setText("Quản lý tác giả");
        mnThongTinSach.add(mnitemTacGia);

        jMenuBar1.add(mnThongTinSach);

        mnQuanLySach.setText("Quản lý Sách");

        mnitemSach.setText("Quản lý sách");
        mnQuanLySach.add(mnitemSach);

        mnitemDauSach.setText("Quản lý đầu sách");
        mnQuanLySach.add(mnitemDauSach);
        mnQuanLySach.add(jSeparator2);

        mnitemMuonSach.setText("Quản lý mượn sách");
        mnQuanLySach.add(mnitemMuonSach);

        jMenuBar1.add(mnQuanLySach);

        mnMuonSach.setText("Lịch sử và trợ giúp");

        mnitemLichSuMS.setText("Lịch sử mượn sách");
        mnMuonSach.add(mnitemLichSuMS);

        mnitemTroGiup.setText("Trợ giúp");
        mnMuonSach.add(mnitemTroGiup);

        jMenuBar1.add(mnMuonSach);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCaiDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaiDatActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnCaiDatActionPerformed

    private void imageAvatar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseClicked

    }//GEN-LAST:event_imageAvatar1MouseClicked

    private void mnitemDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitemDangXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnitemDangXuatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ebooks.Compoment.MyButton btnCaiDat;
    private com.ebooks.Compoment.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private com.ebooks.Compoment.LabelBoder lblLogo;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTime1;
    private javax.swing.JMenu mnCaiDat;
    private javax.swing.JMenu mnMuonSach;
    private javax.swing.JMenu mnQuanLySach;
    private javax.swing.JMenu mnTaiKhoan;
    private javax.swing.JMenu mnThongTinSach;
    private javax.swing.JMenuItem mnitemChuyenTaiKhoan;
    private javax.swing.JMenuItem mnitemDangXuat;
    private javax.swing.JMenuItem mnitemDauSach;
    private javax.swing.JMenuItem mnitemDoiMatKhau;
    private javax.swing.JMenuItem mnitemLichSuMS;
    private javax.swing.JMenuItem mnitemMuonSach;
    private javax.swing.JMenuItem mnitemNXB;
    private javax.swing.JMenuItem mnitemQuenMatKhau;
    private javax.swing.JMenuItem mnitemSach;
    private javax.swing.JMenuItem mnitemTacGia;
    private javax.swing.JMenuItem mnitemTheLoai;
    private javax.swing.JMenuItem mnitemTroGiup;
    private com.ebooks.Compoment.PanelRadius panelRadius1;
    private com.ebooks.Compoment.PanelRadius panelRadius4;
    private com.ebooks.Compoment.PanelRound panelRound1;
    private com.ebooks.Compoment.PanelRound pnlHeader;
    private com.ebooks.Compoment.Table table1;
    // End of variables declaration//GEN-END:variables
}

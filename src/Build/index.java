/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Build;

import Manegement.panelData.ChuDeQuiz;
import Manegement.panelData.Learn;
import Manegement.panelData.dataTV1;
import Manegement.panelData.home;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import user.Connect;

/**
 *
 * @author HP
 */
public class index extends javax.swing.JFrame {

    private JPanel childPanel;
    private JFrame frame;

    DefaultTableModel tbn = new DefaultTableModel();
    Connect a = new Connect();
    Connection con = a.getConnection();
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String fPath = null;
    byte[] img_DATA;

    private String username;

    public index(String username) {
        initComponents();
        this.username = username;
        lblusername.setText(username);
        this.setTitle("Phần Mềm Hỗ Trợ Bé Học Tiếng Anh");
        this.setLocationRelativeTo(null);
        childPanel = new home();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();

        btnHome.setBackground(new Color(255, 255, 102));
        btnHome.setForeground(Color.black);
        LabelLogo();
    }

    private index() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void LabelLogo() {
        ImageIcon MyImage = new ImageIcon("C:\\Java-JSP\\duan9\\src\\img\\Colorful Kids Learning Center Logo.png");
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(408, 348, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        lblLogo.setIcon(image);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        Build = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        panelQuanLy = new javax.swing.JPanel();
        btnQuanLy = new Build.ButtonHome();
        panelHuongDan = new javax.swing.JPanel();
        btnHD = new Build.ButtonHome();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblusername = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelLeft = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Top = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        option = new javax.swing.JPanel();
        btnHome = new Build.ButtonHome();
        btnLearn = new Build.ButtonHome();
        btnQuiz = new Build.ButtonHome();
        home = new javax.swing.JPanel();
        home1 = new javax.swing.JPanel();
        home2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        panelCenter = new javax.swing.JPanel();

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Build.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray)));
        Build.setPreferredSize(new java.awt.Dimension(1700, 930));
        Build.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1700, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(204, 216, 224));
        jPanel9.setPreferredSize(new java.awt.Dimension(1490, 50));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelQuanLy.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white)));
        panelQuanLy.setLayout(new java.awt.BorderLayout());

        btnQuanLy.setText("Quản lý");
        btnQuanLy.setAutoscrolls(true);
        btnQuanLy.setBorderPainted(false);
        btnQuanLy.setFocusPainted(false);
        btnQuanLy.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnQuanLy.setRadius(15);
        btnQuanLy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyMouseClicked(evt);
            }
        });
        panelQuanLy.add(btnQuanLy, java.awt.BorderLayout.CENTER);

        jPanel9.add(panelQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        panelHuongDan.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white)));
        panelHuongDan.setPreferredSize(new java.awt.Dimension(170, 50));
        panelHuongDan.setLayout(new java.awt.BorderLayout());

        btnHD.setText("Hướng dẫn");
        btnHD.setAutoscrolls(true);
        btnHD.setBorderPainted(false);
        btnHD.setFocusPainted(false);
        btnHD.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnHD.setRadius(15);
        btnHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHDMouseClicked(evt);
            }
        });
        panelHuongDan.add(btnHD, java.awt.BorderLayout.CENTER);

        jPanel9.add(panelHuongDan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 50));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel7.setLayout(new java.awt.BorderLayout());

        lblusername.setBackground(new java.awt.Color(204, 216, 224));
        lblusername.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusername.setText("admin");
        lblusername.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 10));
        lblusername.setOpaque(true);
        jPanel7.add(lblusername, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel6.setBackground(new java.awt.Color(204, 216, 224));
        jPanel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel6.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel6.setLayout(new java.awt.BorderLayout());

        lblLogin.setBackground(new java.awt.Color(225, 232, 237));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        lblLogin.setAutoscrolls(true);
        lblLogin.setOpaque(true);
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });
        jPanel6.add(lblLogin, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 0, -1, -1));

        Build.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(204, 216, 224));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1700, 880));
        jPanel1.setLayout(new java.awt.BorderLayout());

        panelLeft.setBackground(new java.awt.Color(204, 216, 224));
        panelLeft.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelLeft.setPreferredSize(new java.awt.Dimension(300, 50));
        panelLeft.setLayout(new java.awt.BorderLayout(20, 20));

        jPanel3.setBackground(new java.awt.Color(248, 247, 244));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(627, 100));
        jPanel3.setLayout(new java.awt.BorderLayout());

        Top.setBackground(new java.awt.Color(255, 255, 255));
        Top.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Top.setPreferredSize(new java.awt.Dimension(100, 240));
        Top.setLayout(new java.awt.BorderLayout());

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Top.add(lblLogo, java.awt.BorderLayout.CENTER);

        jPanel3.add(Top, java.awt.BorderLayout.PAGE_START);

        option.setBackground(new java.awt.Color(248, 247, 244));
        option.setPreferredSize(new java.awt.Dimension(300, 480));
        option.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setBackground(new java.awt.Color(12, 79, 46));
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4960719_home_mobile_ui_ux_web_icon.png"))); // NOI18N
        btnHome.setText("Trang chủ");
        btnHome.setAutoscrolls(true);
        btnHome.setBorderPainted(false);
        btnHome.setFocusPainted(false);
        btnHome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setIconTextGap(30);
        btnHome.setMargin(new java.awt.Insets(0, 30, 0, 0));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        option.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 290, 56));

        btnLearn.setBackground(new java.awt.Color(12, 79, 46));
        btnLearn.setForeground(new java.awt.Color(255, 255, 255));
        btnLearn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2064483_book_education_learn_student_study_icon.png"))); // NOI18N
        btnLearn.setText("Học từ vựng");
        btnLearn.setAutoscrolls(true);
        btnLearn.setBorderPainted(false);
        btnLearn.setFocusPainted(false);
        btnLearn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLearn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnLearn.setIconTextGap(30);
        btnLearn.setMargin(new java.awt.Insets(0, 30, 0, 0));
        btnLearn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLearnMouseClicked(evt);
            }
        });
        option.add(btnLearn, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 71, 290, 56));

        btnQuiz.setBackground(new java.awt.Color(12, 79, 46));
        btnQuiz.setForeground(new java.awt.Color(255, 255, 255));
        btnQuiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2064476_education_learn_pencil_student_study_icon.png"))); // NOI18N
        btnQuiz.setText("Kiểm tra");
        btnQuiz.setAutoscrolls(true);
        btnQuiz.setBorderPainted(false);
        btnQuiz.setFocusPainted(false);
        btnQuiz.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnQuiz.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnQuiz.setIconTextGap(30);
        btnQuiz.setMargin(new java.awt.Insets(0, 30, 0, 0));
        btnQuiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuizMouseClicked(evt);
            }
        });
        option.add(btnQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 137, 290, 56));

        home.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        home.setOpaque(false);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        option.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 300, 66));

        home1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        home1.setOpaque(false);
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout home1Layout = new javax.swing.GroupLayout(home1);
        home1.setLayout(home1Layout);
        home1Layout.setHorizontalGroup(
            home1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        home1Layout.setVerticalGroup(
            home1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        option.add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, 300, 66));

        home2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        home2.setOpaque(false);
        home2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout home2Layout = new javax.swing.GroupLayout(home2);
        home2.setLayout(home2Layout);
        home2Layout.setHorizontalGroup(
            home2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        home2Layout.setVerticalGroup(
            home2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        option.add(home2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 300, 66));

        jPanel3.add(option, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(248, 247, 244));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel5.setPreferredSize(new java.awt.Dimension(300, 350));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        panelLeft.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelLeft, java.awt.BorderLayout.WEST);

        panelCenter.setBackground(new java.awt.Color(204, 216, 224));
        panelCenter.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        panelCenter.setOpaque(false);
        panelCenter.setPreferredSize(new java.awt.Dimension(1400, 48));
        panelCenter.setLayout(new java.awt.BorderLayout());
        jPanel1.add(panelCenter, java.awt.BorderLayout.CENTER);

        Build.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Build, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Build, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        frame = new login();
        frame.setVisible(true);
    }//GEN-LAST:event_lblLoginMouseClicked
    
    private void btnQuanLyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyMouseClicked
        childPanel = new dataTV1();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();

        btnQuanLy.setBackground(new Color(34, 31, 31));
        btnQuanLy.setForeground(Color.white);
        btnQuanLy.setFont(new Font("Dialog", Font.BOLD, 16));
        
        btnHD.setBackground(new Color(245,248,250));
        btnHD.setForeground(Color.BLACK);
        btnHD.setFont(new Font("Dialog", Font.PLAIN, 18));
    }//GEN-LAST:event_btnQuanLyMouseClicked

    private void btnHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHDMouseClicked
        childPanel = new dataTV1();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();

        btnQuanLy.setBackground(new Color(245,248,250));
        btnQuanLy.setForeground(Color.BLACK);
        btnQuanLy.setFont(new Font("Dialog", Font.PLAIN, 18));
        
        btnHD.setBackground(new Color(34, 31, 31));
        btnHD.setForeground(Color.WHITE);
        btnHD.setFont(new Font("Dialog", Font.BOLD, 16));
    }//GEN-LAST:event_btnHDMouseClicked

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        childPanel = new home();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
        
        btnHome.setBackground(new Color(255, 255, 102));
        btnHome.setForeground(Color.black);
        
        btnLearn.setBackground(new Color(12,79,46));
        btnLearn.setForeground(Color.white);
        
        btnQuiz.setBackground(new Color(12,79,46));
        btnQuiz.setForeground(Color.white);
        
        home.setBorder(BorderFactory.createLineBorder(Color.yellow));
        home1.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        home2.setBorder(BorderFactory.createLineBorder(Color.darkGray));
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnLearnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLearnMouseClicked
        childPanel = new Learn(username);
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
        
        btnHome.setBackground(new Color(12,79,46));
        btnHome.setForeground(Color.white);
        
        btnLearn.setBackground(new Color(255, 255, 102));
        btnLearn.setForeground(Color.black);
        
        btnQuiz.setBackground(new Color(12,79,46));
        btnQuiz.setForeground(Color.white);
        
        home.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        home1.setBorder(BorderFactory.createLineBorder(Color.yellow));
        home2.setBorder(BorderFactory.createLineBorder(Color.darkGray));
    }//GEN-LAST:event_btnLearnMouseClicked

    private void btnQuizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuizMouseClicked
        childPanel = new ChuDeQuiz(username);
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
        
        btnHome.setBackground(new Color(12,79,46));
        btnHome.setForeground(Color.white);
        
        btnLearn.setBackground(new Color(12,79,46));
        btnLearn.setForeground(Color.white);
        
        btnQuiz.setBackground(new Color(255, 255, 102));
        btnQuiz.setForeground(Color.black);
        
        home.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        home1.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        home2.setBorder(BorderFactory.createLineBorder(Color.yellow));
    }//GEN-LAST:event_btnQuizMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        
    }//GEN-LAST:event_homeMouseClicked

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked
    }//GEN-LAST:event_home1MouseClicked

    private void home2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home2MouseClicked
    }//GEN-LAST:event_home2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Build;
    private javax.swing.JPanel Top;
    private Build.ButtonHome btnHD;
    private Build.ButtonHome btnHome;
    private Build.ButtonHome btnLearn;
    private Build.ButtonHome btnQuanLy;
    private Build.ButtonHome btnQuiz;
    private javax.swing.JPanel home;
    private javax.swing.JPanel home1;
    private javax.swing.JPanel home2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblusername;
    private javax.swing.JPanel option;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelHuongDan;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelQuanLy;
    // End of variables declaration//GEN-END:variables
}

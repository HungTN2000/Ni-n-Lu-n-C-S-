/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Build;

import data_class.frmReg;
import java.awt.Button;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.DatabaseConnection;

/**
 *
 * @author HP
 */
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTaiKhoan = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        lblPwd = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        iconUser = new javax.swing.JLabel();
        iconPassword = new javax.swing.JLabel();
        btnLogin = new Build.ButtonLogin();
        buttonReturnLogin3 = new Build.ButtonReturnLogin();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        buttonReturnLogin2 = new Build.ButtonReturnLogin();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);

        panelLogin.setBackground(new java.awt.Color(204, 216, 224));
        panelLogin.setPreferredSize(new java.awt.Dimension(500, 600));
        panelLogin.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(null);
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng nhập");
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 80));
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAutoscrolls(true);
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparator1.setEnabled(false);
        jSeparator1.setOpaque(true);
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 65, 180, 5));

        panelLogin.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 10, 20));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 460));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 40, 10, 40));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 200));

        lblTaiKhoan.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(51, 51, 51));
        lblTaiKhoan.setText("Tài Khoản");
        lblTaiKhoan.setPreferredSize(new java.awt.Dimension(60, 17));

        txtTaiKhoan.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtTaiKhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 204)));
        txtTaiKhoan.setDisabledTextColor(new java.awt.Color(204, 216, 224));
        txtTaiKhoan.setName(""); // NOI18N
        txtTaiKhoan.setOpaque(true);
        txtTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTaiKhoanMouseEntered(evt);
            }
        });

        lblPwd.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblPwd.setForeground(new java.awt.Color(51, 51, 51));
        lblPwd.setText("Mật Khẩu");

        txtMatKhau.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 204)));
        txtMatKhau.setDisabledTextColor(new java.awt.Color(204, 216, 224));
        txtMatKhau.setOpaque(true);

        jCheckBox1.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("Hiện mật khẩu");
        jCheckBox1.setAutoscrolls(true);
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.setRequestFocusEnabled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        iconUser.setBackground(new java.awt.Color(204, 204, 204));
        iconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5402435_account_profile_user_avatar_man_icon.png"))); // NOI18N
        iconUser.setAutoscrolls(true);
        iconUser.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        iconUser.setDisabledIcon(null);
        iconUser.setOpaque(true);

        iconPassword.setBackground(new java.awt.Color(204, 204, 204));
        iconPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/7491947_ui_key_password_lock_security_icon.png"))); // NOI18N
        iconPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        iconPassword.setOpaque(true);

        btnLogin.setText("Đăng nhập");
        btnLogin.setAutoscrolls(true);
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        btnLogin.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        btnLogin.setRadius(50);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        buttonReturnLogin3.setForeground(new java.awt.Color(51, 51, 51));
        buttonReturnLogin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/7225775_arrow_login_icon.png"))); // NOI18N
        buttonReturnLogin3.setText("Quên mật khẩu ?");
        buttonReturnLogin3.setBorderPainted(false);
        buttonReturnLogin3.setFocusPainted(false);
        buttonReturnLogin3.setFont(new java.awt.Font("sansserif", 3, 16)); // NOI18N
        buttonReturnLogin3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        buttonReturnLogin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonReturnLogin3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(iconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(txtTaiKhoan))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txtMatKhau))
                            .addComponent(iconPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(buttonReturnLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(buttonReturnLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        panelLogin.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, -5, 5);
        flowLayout1.setAlignOnBaseline(true);
        jPanel1.setLayout(flowLayout1);

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Bạn chưa có tài khoản ? Đăng ký");
        jPanel1.add(jLabel4);

        buttonReturnLogin2.setForeground(new java.awt.Color(0, 0, 153));
        buttonReturnLogin2.setText("Tại đây");
        buttonReturnLogin2.setBorderPainted(false);
        buttonReturnLogin2.setFocusPainted(false);
        buttonReturnLogin2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        buttonReturnLogin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonReturnLogin2MouseClicked(evt);
            }
        });
        jPanel1.add(buttonReturnLogin2);

        panelLogin.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(panelLogin, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            txtMatKhau.setEchoChar((char) 0);
        } else {
            txtMatKhau.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtTaiKhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTaiKhoanMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanMouseEntered

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        frmReg register = new frmReg();
        DatabaseConnection database = new DatabaseConnection();
        if (txtTaiKhoan.getText().equals("") && txtMatKhau.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tài khoản và mật khẩu không được để trống!");
        }
        try {
            ResultSet rs = database.getStatement().executeQuery("Select * from NguoiDung WHERE TaiKhoan='" + txtTaiKhoan.getText() + "' and MatKhau='" + txtMatKhau.getText() + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(register, "Đăng nhập thành công!.");
                index g = new index(txtTaiKhoan.getText());
                g.setVisible(true);
                setVisible(false);
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void buttonReturnLogin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReturnLogin2MouseClicked
        Reg r = new Reg();
        r.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_buttonReturnLogin2MouseClicked

    private void buttonReturnLogin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReturnLogin3MouseClicked
        GetPassword gp = new GetPassword();
        gp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_buttonReturnLogin3MouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        btnLogin.setBackground(Color.red);
    }//GEN-LAST:event_btnLoginMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Build.ButtonLogin btnLogin;
    private Build.ButtonReturnLogin buttonReturnLogin2;
    private Build.ButtonReturnLogin buttonReturnLogin3;
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel iconUser;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
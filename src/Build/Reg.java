/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Build;

import data_class.frmReg;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.DatabaseConnection;

/**
 *
 * @author HP
 */
public class Reg extends javax.swing.JFrame {

    public Reg() {
        initComponents();
        setLocationRelativeTo(null);
        //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelLogin = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblTaiKhoan = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        iconUser = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        lblPwd1 = new javax.swing.JLabel();
        lblPwd4 = new javax.swing.JLabel();
        iconPassword4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JPasswordField();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        txtDate = new com.toedter.calendar.JDateChooser();
        iconUser2 = new javax.swing.JLabel();
        lblPwd3 = new javax.swing.JLabel();
        iconPassword3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JPasswordField();
        lblPwd5 = new javax.swing.JLabel();
        iconPassword5 = new javax.swing.JLabel();
        txtAdress = new javax.swing.JPasswordField();
        lblTaiKhoan1 = new javax.swing.JLabel();
        iconUser1 = new javax.swing.JLabel();
        txtTaiKhoan1 = new javax.swing.JTextField();
        lblPwd2 = new javax.swing.JLabel();
        iconPassword2 = new javax.swing.JLabel();
        txtPwd = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        myButton1 = new Build.ButtonLogin();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        buttonReturnLogin2 = new Build.ButtonReturnLogin();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(204, 216, 224));
        panelLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panelLogin.setPreferredSize(new java.awt.Dimension(650, 750));
        panelLogin.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(null);
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(10, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng ký tài khoản");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 51, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAutoscrolls(true);
        jSeparator1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparator1.setEnabled(false);
        jSeparator1.setOpaque(true);
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 290, 5));

        panelLogin.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 20, 0));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(10, 620));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 70, 10, 70));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(400, 10));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTaiKhoan.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTaiKhoan.setForeground(new java.awt.Color(51, 51, 51));
        lblTaiKhoan.setText("Họ và tên");
        lblTaiKhoan.setPreferredSize(new java.awt.Dimension(60, 17));
        jPanel6.add(lblTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 16, 120, 40));

        txtName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 204)), javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(153, 153, 153)))));
        txtName.setDisabledTextColor(new java.awt.Color(204, 216, 224));
        txtName.setName(""); // NOI18N
        txtName.setOpaque(true);
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNameMouseEntered(evt);
            }
        });
        jPanel6.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 16, 316, 40));

        iconUser.setBackground(new java.awt.Color(204, 204, 204));
        iconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5402435_account_profile_user_avatar_man_icon.png"))); // NOI18N
        iconUser.setAutoscrolls(true);
        iconUser.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        iconUser.setDisabledIcon(null);
        iconUser.setOpaque(true);
        jPanel6.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 16, 40, 40));

        lblPwd.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblPwd.setForeground(new java.awt.Color(51, 51, 51));
        lblPwd.setText("Giới tính");
        jPanel6.add(lblPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 68, 120, 40));

        lblPwd1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblPwd1.setForeground(new java.awt.Color(51, 51, 51));
        lblPwd1.setText("Ngày sinh");
        jPanel6.add(lblPwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 40));

        lblPwd4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblPwd4.setForeground(new java.awt.Color(51, 51, 51));
        lblPwd4.setText("Số điện thoại");
        jPanel6.add(lblPwd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 224, 120, 40));

        iconPassword4.setBackground(new java.awt.Color(204, 204, 204));
        iconPassword4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPassword4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2205195_mobile_phone_screen_smart_icon.png"))); // NOI18N
        iconPassword4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        iconPassword4.setOpaque(true);
        jPanel6.add(iconPassword4, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 224, 40, 40));

        txtPhone.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtPhone.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 204)), javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(153, 153, 153)))));
        txtPhone.setDisabledTextColor(new java.awt.Color(204, 216, 224));
        txtPhone.setOpaque(true);
        jPanel6.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 224, 316, 40));

        buttonGroup1.add(rdbMale);
        rdbMale.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        rdbMale.setForeground(new java.awt.Color(51, 51, 51));
        rdbMale.setText("NAM");
        rdbMale.setAutoscrolls(true);
        rdbMale.setContentAreaFilled(false);
        rdbMale.setFocusPainted(false);
        jPanel6.add(rdbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 68, -1, 40));

        buttonGroup1.add(rdbFemale);
        rdbFemale.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        rdbFemale.setForeground(new java.awt.Color(51, 51, 51));
        rdbFemale.setText("NỮ");
        rdbFemale.setAutoscrolls(true);
        rdbFemale.setContentAreaFilled(false);
        rdbFemale.setFocusPainted(false);
        jPanel6.add(rdbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 68, -1, 40));

        txtDate.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 204)), javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(153, 153, 153)))));
        txtDate.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jPanel6.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 120, 316, 40));

        iconUser2.setBackground(new java.awt.Color(204, 204, 204));
        iconUser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/115762_calendar_date_event_month_icon.png"))); // NOI18N
        iconUser2.setAutoscrolls(true);
        iconUser2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        iconUser2.setOpaque(true);
        jPanel6.add(iconUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 120, 40, 40));

        lblPwd3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblPwd3.setForeground(new java.awt.Color(51, 51, 51));
        lblPwd3.setText("Email");
        jPanel6.add(lblPwd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 172, 120, 40));

        iconPassword3.setBackground(new java.awt.Color(204, 204, 204));
        iconPassword3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPassword3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/3669350_email_ic_icon.png"))); // NOI18N
        iconPassword3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        iconPassword3.setOpaque(true);
        jPanel6.add(iconPassword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 172, 40, 40));

        txtEmail.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 204)), javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(153, 153, 153)))));
        txtEmail.setDisabledTextColor(new java.awt.Color(204, 216, 224));
        txtEmail.setOpaque(true);
        jPanel6.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 172, 316, 40));

        lblPwd5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblPwd5.setForeground(new java.awt.Color(51, 51, 51));
        lblPwd5.setText("Địa chỉ");
        jPanel6.add(lblPwd5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 276, 120, 40));

        iconPassword5.setBackground(new java.awt.Color(204, 204, 204));
        iconPassword5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPassword5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1564524_adress_gps_location_pin_position_icon.png"))); // NOI18N
        iconPassword5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        iconPassword5.setOpaque(true);
        jPanel6.add(iconPassword5, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 276, 40, 40));

        txtAdress.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtAdress.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 204)), javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(153, 153, 153)))));
        txtAdress.setDisabledTextColor(new java.awt.Color(204, 216, 224));
        txtAdress.setOpaque(true);
        jPanel6.add(txtAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 276, 316, 40));

        lblTaiKhoan1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblTaiKhoan1.setForeground(new java.awt.Color(51, 51, 51));
        lblTaiKhoan1.setText("Tài khoản");
        lblTaiKhoan1.setPreferredSize(new java.awt.Dimension(60, 17));
        jPanel6.add(lblTaiKhoan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 328, 120, 40));

        iconUser1.setBackground(new java.awt.Color(204, 204, 204));
        iconUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5402435_account_profile_user_avatar_man_icon.png"))); // NOI18N
        iconUser1.setAutoscrolls(true);
        iconUser1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        iconUser1.setDisabledIcon(null);
        iconUser1.setOpaque(true);
        jPanel6.add(iconUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 328, 40, 40));

        txtTaiKhoan1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtTaiKhoan1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 204)), javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(153, 153, 153)))));
        txtTaiKhoan1.setDisabledTextColor(new java.awt.Color(204, 216, 224));
        txtTaiKhoan1.setName(""); // NOI18N
        txtTaiKhoan1.setOpaque(true);
        txtTaiKhoan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTaiKhoan1MouseEntered(evt);
            }
        });
        jPanel6.add(txtTaiKhoan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 328, 316, 40));

        lblPwd2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        lblPwd2.setForeground(new java.awt.Color(51, 51, 51));
        lblPwd2.setText("Mật khẩu");
        jPanel6.add(lblPwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 120, 40));

        iconPassword2.setBackground(new java.awt.Color(204, 204, 204));
        iconPassword2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPassword2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/7491947_ui_key_password_lock_security_icon.png"))); // NOI18N
        iconPassword2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        iconPassword2.setOpaque(true);
        jPanel6.add(iconPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 380, 40, 40));

        txtPwd.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtPwd.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 153, 204)), javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(153, 153, 153)))));
        txtPwd.setDisabledTextColor(new java.awt.Color(204, 216, 224));
        txtPwd.setOpaque(true);
        jPanel6.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 380, 316, 40));

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 40, 10, 40));
        jPanel5.setMinimumSize(new java.awt.Dimension(100, 90));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(90, 80));

        myButton1.setText("Đăng ký");
        myButton1.setAutoscrolls(true);
        myButton1.setBorderPainted(false);
        myButton1.setFocusPainted(false);
        myButton1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        myButton1.setRadius(50);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 466, 530, 78));

        jPanel1.add(jPanel6, java.awt.BorderLayout.CENTER);

        panelLogin.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(10, 50));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, -5, 5));

        jLabel4.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Bạn đã có tài khoản quay lại Đăng nhập !");
        jPanel2.add(jLabel4);

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
        jPanel2.add(buttonReturnLogin2);

        panelLogin.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameMouseEntered

    private void txtTaiKhoan1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTaiKhoan1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoan1MouseEntered

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        frmReg register = new frmReg();
        DatabaseConnection database = new DatabaseConnection();
        try {
            ResultSet rs = database.getStatement().executeQuery("Select * from NguoiDung WHERE TaiKhoan='" + txtName.getText() + "' and MatKhau='" + txtPwd.getText() + "'");
            if (rs.next()) {
                //                if (selectedItem.equals("student")) {
                    JOptionPane.showMessageDialog(register, "Login successful.");
                    index g = new index(txtName.getText());
                    g.setVisible(true);
                    setVisible(false);
                    //                }
            } else {
                JOptionPane.showMessageDialog(register, "Incorrect username or password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_myButton1ActionPerformed

    private void buttonReturnLogin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonReturnLogin2MouseClicked
        login l = new login();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_buttonReturnLogin2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private Build.ButtonReturnLogin buttonReturnLogin2;
    private javax.swing.JLabel iconPassword2;
    private javax.swing.JLabel iconPassword3;
    private javax.swing.JLabel iconPassword4;
    private javax.swing.JLabel iconPassword5;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel iconUser1;
    private javax.swing.JLabel iconUser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblPwd1;
    private javax.swing.JLabel lblPwd2;
    private javax.swing.JLabel lblPwd3;
    private javax.swing.JLabel lblPwd4;
    private javax.swing.JLabel lblPwd5;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblTaiKhoan1;
    private Build.ButtonLogin myButton1;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JPasswordField txtAdress;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JPasswordField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPhone;
    private javax.swing.JPasswordField txtPwd;
    private javax.swing.JTextField txtTaiKhoan1;
    // End of variables declaration//GEN-END:variables
}

package Manegement.Quiz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Manegement.panelData.Hoc;
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import user.Connect;

/**
 *
 * @author HP
 */
public class testV1 extends javax.swing.JFrame {

    public static final String SONG1 = "C:\\Java-JSP\\duan9\\src\\music\\correct.mp3";
    public static final String SONG2 = "C:\\Java-JSP\\duan9\\src\\music\\wrong.mp3";
    public static final String SONG3 = "C:\\Java-JSP\\duan9\\src\\music\\congratulations.mp3";
    MP3Player mp3player1 = new MP3Player(new File(SONG1));
    MP3Player mp3player2 = new MP3Player(new File(SONG2));
    MP3Player mp3player3 = new MP3Player(new File(SONG3));

    DefaultTableModel tbn = new DefaultTableModel();
    Connect a = new Connect();
    Connection con = a.getConnection();
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String fPath = null;
    byte[] img_DATA;

    Timer timer;
//    int minute = 0, second = 0, cong = 0; //Tăng
    int minute = 1, second = 30; //Giảm
    DecimalFormat dFormat = new DecimalFormat("00");
    String ddMinute, ddSecond;

    int point = 0;
    int count = 0, cnt = 0;

    private String MaND = "";
    private String MaBKT = "";
    private String username;
    private String TenCapDo;
    private String TenChuDe;
    private String HinhThuc;
    int flag = 1;
    boolean dung = true;

    public testV1(String username, String TenCapDo, String TenChuDe, String HinhThuc) {
        initComponents();
        getSumRow();
        this.username = username;
        this.TenCapDo = TenCapDo;
        this.TenChuDe = TenChuDe;
        this.HinhThuc = HinhThuc;
        getMaND();
        SinhMaBKT();
        getConnection();
        sumQuiz(); //Tổng số câu kiểm tra
        loadDataSQL();
        txtTime.setText("Thời gian: 00:00");
        runTime();
        this.setResizable(false);
        btnSubmit.setEnabled(false);
    }

    private testV1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=duan1;user=sa;password=sa2008");
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("Select TOP 10 * from CauHoiTN where TenChuDe = '" + TenChuDe + "' ORDER BY NEWID()");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Top = new javax.swing.JPanel();
        txtMaBKT = new javax.swing.JLabel();
        btnReturn = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        txtNumber = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        Question = new javax.swing.JPanel();
        lblMaCHTN = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        Answer = new javax.swing.JPanel();
        OptionA = new javax.swing.JPanel();
        rdbOption1 = new javax.swing.JRadioButton();
        OptionB = new javax.swing.JPanel();
        rdbOption2 = new javax.swing.JRadioButton();
        OptionC = new javax.swing.JPanel();
        rdbOption3 = new javax.swing.JRadioButton();
        OptionD = new javax.swing.JPanel();
        rdbOption4 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 191, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Top.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Top.setOpaque(false);
        Top.setPreferredSize(new java.awt.Dimension(1100, 80));
        Top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMaBKT.setBackground(new java.awt.Color(255, 255, 255));
        txtMaBKT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMaBKT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMaBKT.setOpaque(true);
        txtMaBKT.setPreferredSize(new java.awt.Dimension(135, 35));
        Top.add(txtMaBKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 210, 35));

        btnReturn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4295560_reply_answear_query_replies_respond_icon.png"))); // NOI18N
        btnReturn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        btnReturn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReturn.setOpaque(true);
        btnReturn.setPreferredSize(new java.awt.Dimension(36, 35));
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });
        Top.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 35));

        txtTime.setBackground(new java.awt.Color(255, 255, 255));
        txtTime.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTime.setOpaque(true);
        txtTime.setPreferredSize(new java.awt.Dimension(135, 35));
        Top.add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 160, 35));

        txtNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtNumber.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNumber.setOpaque(true);
        txtNumber.setPreferredSize(new java.awt.Dimension(135, 35));
        Top.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 200, 35));

        jPanel1.add(Top, java.awt.BorderLayout.PAGE_START);

        Main.setOpaque(false);
        Main.setLayout(new java.awt.BorderLayout());

        Left.setBackground(new java.awt.Color(245, 245, 220));
        Left.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(30, 50, 30, 50)));
        Left.setPreferredSize(new java.awt.Dimension(600, 500));
        Left.setLayout(new java.awt.BorderLayout());

        Question.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Question.setLayout(new java.awt.BorderLayout());

        lblMaCHTN.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblMaCHTN.setAutoscrolls(true);
        lblMaCHTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0)));
        lblMaCHTN.setPreferredSize(new java.awt.Dimension(0, 50));
        Question.add(lblMaCHTN, java.awt.BorderLayout.PAGE_START);

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Question.add(lblImg, java.awt.BorderLayout.CENTER);

        Left.add(Question, java.awt.BorderLayout.CENTER);

        Main.add(Left, java.awt.BorderLayout.CENTER);

        Right.setOpaque(false);
        Right.setPreferredSize(new java.awt.Dimension(400, 100));
        Right.setLayout(new java.awt.BorderLayout(10, 10));

        Answer.setLayout(new java.awt.GridLayout(4, 1, 20, 20));

        OptionA.setBackground(new java.awt.Color(255, 255, 255));
        OptionA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OptionA.setLayout(new java.awt.BorderLayout());

        rdbOption1.setBackground(new java.awt.Color(255, 255, 255));
        rdbOption1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        rdbOption1.setBorderPainted(true);
        rdbOption1.setFocusPainted(false);
        rdbOption1.setIconTextGap(30);
        rdbOption1.setMargin(new java.awt.Insets(2, 50, 2, 2));
        rdbOption1.setOpaque(true);
        rdbOption1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbOption1MouseClicked(evt);
            }
        });
        OptionA.add(rdbOption1, java.awt.BorderLayout.CENTER);

        Answer.add(OptionA);

        OptionB.setBackground(new java.awt.Color(255, 255, 255));
        OptionB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OptionB.setLayout(new java.awt.BorderLayout());

        rdbOption2.setBackground(new java.awt.Color(255, 255, 255));
        rdbOption2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        rdbOption2.setBorderPainted(true);
        rdbOption2.setFocusPainted(false);
        rdbOption2.setIconTextGap(30);
        rdbOption2.setMargin(new java.awt.Insets(2, 50, 2, 2));
        rdbOption2.setOpaque(true);
        rdbOption2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbOption2MouseClicked(evt);
            }
        });
        OptionB.add(rdbOption2, java.awt.BorderLayout.CENTER);

        Answer.add(OptionB);

        OptionC.setBackground(new java.awt.Color(255, 255, 255));
        OptionC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OptionC.setLayout(new java.awt.BorderLayout());

        rdbOption3.setBackground(new java.awt.Color(255, 255, 255));
        rdbOption3.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        rdbOption3.setBorderPainted(true);
        rdbOption3.setFocusPainted(false);
        rdbOption3.setIconTextGap(30);
        rdbOption3.setMargin(new java.awt.Insets(2, 50, 2, 2));
        rdbOption3.setOpaque(true);
        rdbOption3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbOption3MouseClicked(evt);
            }
        });
        OptionC.add(rdbOption3, java.awt.BorderLayout.CENTER);

        Answer.add(OptionC);

        OptionD.setBackground(new java.awt.Color(255, 255, 255));
        OptionD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OptionD.setLayout(new java.awt.BorderLayout());

        rdbOption4.setBackground(new java.awt.Color(255, 255, 255));
        rdbOption4.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        rdbOption4.setBorderPainted(true);
        rdbOption4.setFocusPainted(false);
        rdbOption4.setIconTextGap(30);
        rdbOption4.setMargin(new java.awt.Insets(2, 50, 2, 2));
        rdbOption4.setOpaque(true);
        rdbOption4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbOption4MouseClicked(evt);
            }
        });
        OptionD.add(rdbOption4, java.awt.BorderLayout.CENTER);

        Answer.add(OptionD);

        Right.add(Answer, java.awt.BorderLayout.CENTER);

        jPanel7.setBackground(new java.awt.Color(255, 250, 250));
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 200));

        btnNext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNext.setText("Next");
        btnNext.setMultiClickThreshhold(5L);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setMultiClickThreshhold(5L);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        Right.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        Main.add(Right, java.awt.BorderLayout.EAST);

        jPanel1.add(Main, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        mp3player3.play();
        resultUpdateTest();
        setVisible(false);
    }//GEN-LAST:event_btnSubmitActionPerformed

    public void resultUpdateTest() {
        try {
            double rate = point * (10.0 / count);
            double a = (double) Math.round(rate * 100) / 100;
            String url = "UPDATE BaiKiemTra\n"
                    + "SET Diem = '" + a + "'\n"
                    + "WHERE MaBKT='" + MaBKT + "' and MaND='" + MaND + "'";
            pst = con.prepareStatement(url);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Số câu đúng: " + point + "\n" + "Tổng điểm: " + a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (rdbOption1.isSelected() == false && rdbOption2.isSelected() == false
                && rdbOption3.isSelected() == false && rdbOption4.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Vui lòng lựa chọn đáp án.");
        } else {
            try {
                if (!rs.isLast()) {
                    rs.next();
                    lblMaCHTN.setText(rs.getString("CauHoi"));
                    rdbOption1.setText(rs.getString("DapAnA"));
                    rdbOption2.setText(rs.getString("DapAnB"));
                    rdbOption3.setText(rs.getString("DapAnC"));
                    rdbOption4.setText(rs.getString("DapAnD"));
                    byte[] img = rs.getBytes(7);
                    ImageIcon imgIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_SMOOTH));
                    lblImg.setIcon(imgIcon);
                    img_DATA = img;
                    rdbOption1.setSelected(false);
                    rdbOption2.setSelected(false);
                    rdbOption3.setSelected(false);
                    rdbOption4.setSelected(false);

                    rdbOption1.setEnabled(true);
                    rdbOption2.setEnabled(true);
                    rdbOption3.setEnabled(true);
                    rdbOption4.setEnabled(true);

                    OptionA.setBackground(Color.white);
                    OptionB.setBackground(Color.white);
                    OptionC.setBackground(Color.white);
                    OptionD.setBackground(Color.white);
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        dung = false;
        Hoc g = new Hoc(username);
        g.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnReturnMouseClicked

    private void rdbOption1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbOption1MouseClicked
        if (rdbOption1.isSelected() == true) {
            try {
                String answer = rs.getString("CauTraLoi");
                String option1 = rs.getString("DapAnA");

                if (option1.trim().equals(answer)) {
                    OptionA.setBackground(Color.green);
                    point += 1;
                    mp3player1.play();
                } else {
                    OptionA.setBackground(Color.red);
                    mp3player2.play();
                    JOptionPane.showMessageDialog(this, "Câu trả lời : " + answer);
                }
                cnt += 1;
            } catch (Exception e) {
            }
            rdbOption2.setEnabled(false);
            rdbOption3.setEnabled(false);
            rdbOption4.setEnabled(false);

            String t = Integer.toString(cnt);
            txtNumber.setText("Số câu đã làm: " + t + " / " + count);

            if (cnt == count) {
                JOptionPane.showMessageDialog(this, "Đã hoàn thành số câu hỏi kiểm tra.");
                btnNext.setEnabled(false);
                btnSubmit.setEnabled(true);
            }
        }
    }//GEN-LAST:event_rdbOption1MouseClicked

    private void rdbOption2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbOption2MouseClicked
        if (rdbOption2.isSelected() == true) {
            try {
                String answer = rs.getString("CauTraLoi");
                String option2 = rs.getString("DapAnB");
                if (option2.trim().equals(answer)) {
                    OptionB.setBackground(Color.green);
                    point += 1;
                    mp3player1.play();
                } else {
                    OptionB.setBackground(Color.red);
                    mp3player2.play();
                    JOptionPane.showMessageDialog(this, "Câu trả lời : " + answer);
                }
                cnt += 1;
            } catch (Exception e) {
            }
            rdbOption1.setEnabled(false);
            rdbOption3.setEnabled(false);
            rdbOption4.setEnabled(false);

            String t = Integer.toString(cnt);
            txtNumber.setText("Số câu đã làm: " + t + " / " + count);

            if (cnt == count) {
                JOptionPane.showMessageDialog(this, "Đã hoàn thành số câu hỏi kiểm tra.");
                btnNext.setEnabled(false);
                btnSubmit.setEnabled(true);
            }
        }
    }//GEN-LAST:event_rdbOption2MouseClicked

    private void rdbOption3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbOption3MouseClicked
        if (rdbOption3.isSelected() == true) {
            try {
                String answer = rs.getString("CauTraLoi");
                String option3 = rs.getString("DapAnC");
                if (option3.trim().equals(answer)) {
                    OptionC.setBackground(Color.green);
                    point += 1;
                    mp3player1.play();
                } else {
                    OptionB.setBackground(Color.red);
                    mp3player2.play();
                    JOptionPane.showMessageDialog(this, "Câu trả lời : " + answer);
                }
                cnt += 1;
            } catch (Exception e) {
            }
            rdbOption1.setEnabled(false);
            rdbOption2.setEnabled(false);
            rdbOption4.setEnabled(false);

            String t = Integer.toString(cnt);
            txtNumber.setText("Số câu đã làm: " + t + " / " + count);

            if (cnt == count) {
                JOptionPane.showMessageDialog(this, "Đã hoàn thành số câu hỏi kiểm tra.");
                btnNext.setEnabled(false);
                btnSubmit.setEnabled(true);
            }
        }
    }//GEN-LAST:event_rdbOption3MouseClicked

    private void rdbOption4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbOption4MouseClicked
        if (rdbOption4.isSelected() == true) {
            try {
                String answer = rs.getString("CauTraLoi");
                String option4 = rs.getString("DapAnD");
                if (option4.trim().equals(answer)) {
                    OptionD.setBackground(Color.green);
                    point += 1;
                    mp3player1.play();
                } else {
                    OptionD.setBackground(Color.red);
                    mp3player2.play();
                    JOptionPane.showMessageDialog(this, "Câu trả lời : " + answer);
                }
                cnt += 1;
            } catch (Exception e) {
            }
            rdbOption1.setEnabled(false);
            rdbOption2.setEnabled(false);
            rdbOption3.setEnabled(false);

            String t = Integer.toString(cnt);
            txtNumber.setText("Số câu đã làm: " + t + " / " + count);

            if (cnt == count) {
                JOptionPane.showMessageDialog(this, "Đã hoàn thành số câu hỏi kiểm tra.");
                btnNext.setEnabled(false);
                btnSubmit.setEnabled(true);
            }
        }
    }//GEN-LAST:event_rdbOption4MouseClicked

    public void loadDataSQL() {
        try {
            rs.first();
            lblMaCHTN.setText(rs.getString("CauHoi"));
            rdbOption1.setText(rs.getString("DapAnA"));
            rdbOption2.setText(rs.getString("DapAnB"));
            rdbOption3.setText(rs.getString("DapAnC"));
            rdbOption4.setText(rs.getString("DapAnD"));
            byte[] img = rs.getBytes("HinhAnh");
            ImageIcon imgIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_SMOOTH));
            lblImg.setIcon(imgIcon);
            img_DATA = img;
            txtNumber.setText("Số câu đã làm: 0 / " + count);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    //Lấy mã người dùng
    public void getMaND() {
        try {
            pst = con.prepareStatement("Select * from NguoiDung where TaiKhoan = '" + username + "'");
            rs = pst.executeQuery();

            while (rs.next()) {
                //jLabel3.setText(rs.getString("HoTen"));
                MaND = rs.getString("MaND");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi tải dữ liệu MaND!");
        }
    }

    //Đếm số lượng dòng bài kiểm tra
    public void getSumRow() {
        try {
            pst = con.prepareStatement("Select * from BaiKiemTra");
            rs = pst.executeQuery();

            while (rs.next()) {
                flag++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi tải dữ liệu MaBKT!");
        }
    }

    //Sinh mã bài kiểm tra
    public void SinhMaBKT() {
        try {
            pst = con.prepareStatement("Select * from BaiKiemTra");
            rs = pst.executeQuery();

            int i = 1;
            while (rs.next()) {
                String checkMaBKT = rs.getString("MaBKT");

                String temp = "";
                if (i < 10) {
                    temp = "BKT0" + i;
                } else {
                    temp = "BKT" + i;
                }

                if (i < flag - 1 && !checkMaBKT.trim().equals(temp)) {
                    if (i < 10) {
                        MaBKT = "BKT0" + i;
                    } else {
                        MaBKT = "BKT" + i;
                    }
                    break;
                }
                i += 1;
                if (i == flag) {
                    if (i < 10) {
                        MaBKT = "BKT0" + i;
                    } else {
                        MaBKT = "BKT" + i;
                    }
                }
            }
            if (MaBKT.isEmpty()) {
                MaBKT = "BKT0" + 1;
            }
            txtMaBKT.setText("Mã bài kiểm tra: " + MaBKT);
            addMaBKT();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi tải dữ liệu MaBKT!");
        }
    }

    //Thêm dữ liệu tự động 
    public void addMaBKT() {
        try {
            LocalDate ld = LocalDate.now();
            String url = "Insert into BaiKiemTra  (MaBKT, MaND, TenCapDo,TenChuDe,HinhThuc,Diem,NgayKiem)\n"
                    + "values ('" + MaBKT + "', '" + MaND + "', N'" + TenCapDo + "', '" + TenChuDe + "', N'" + HinhThuc + "', 0.0, '" + ld + "')";
            pst = con.prepareStatement(url);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Tổng số câu kiểm tra
    public void sumQuiz() {
        try {
            while (!rs.isLast()) {
                rs.next();
                count += 1;
            }
        } catch (Exception e) {
        }
    }

//    //Thời gian + format + tăng
//    public void runTime() {
//        timer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                second++;
//                ddSecond = dFormat.format(second);
//                ddMinute = dFormat.format(minute);
//
//                txtTime.setText("Thời gian: " + ddMinute + ":" + ddSecond);
//
//                if (second == 60) {
//                    second = 0;
//                    minute++;
//                    ddSecond = dFormat.format(second);
//                    ddMinute = dFormat.format(minute);
//                    txtTime.setText("Thời gian: " + ddMinute + ":" + ddSecond);
//                }
//            }
//        });
//        timer.start();
//    }
    //Thời gian + format + giảm
    public void runTime() {
        if (dung == true) {
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    second--;
                    ddSecond = dFormat.format(second);
                    ddMinute = dFormat.format(minute);

                    txtTime.setText("Thời gian: " + ddMinute + ":" + ddSecond);

                    if (second == -1) {
                        second = 59;
                        minute--;
                        ddSecond = dFormat.format(second);
                        ddMinute = dFormat.format(minute);
                        txtTime.setText("Thời gian: " + ddMinute + ":" + ddSecond);
                    }
                    if (minute == 0 && second == 0) {
                        timer.stop();
                        mp3player3.play();
                        resultUpdateTest();
                        setVisible(false);
                    }

                    if (dung == false) {
                        timer.stop();
                    }

                    if (cnt == count) {
                        timer.stop();
                    }
                }
            });
            timer.start();
        }
    }

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(testV1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testV1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testV1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testV1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testV1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Answer;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel OptionA;
    private javax.swing.JPanel OptionB;
    private javax.swing.JPanel OptionC;
    private javax.swing.JPanel OptionD;
    private javax.swing.JPanel Question;
    private javax.swing.JPanel Right;
    private javax.swing.JPanel Top;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel btnReturn;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblMaCHTN;
    private javax.swing.JRadioButton rdbOption1;
    private javax.swing.JRadioButton rdbOption2;
    private javax.swing.JRadioButton rdbOption3;
    private javax.swing.JRadioButton rdbOption4;
    private javax.swing.JLabel txtMaBKT;
    private javax.swing.JLabel txtNumber;
    private javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables
}

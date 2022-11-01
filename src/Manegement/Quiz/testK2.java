package Manegement.Quiz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Manegement.classData.listBKT;
import Build.index;
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
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import user.Connect;

/**
 *
 * @author HP
 */
public class testK2 extends javax.swing.JFrame {

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

    ButtonGroup bg = new ButtonGroup();

    Timer t, time;
    int cong;

    int counter = 0;
    Boolean isIT = false;

    int point = 0;
    int count = 1;

    public testK2() {
        initComponents();
        getConnection();
        loadData();
        loadTest();
        loadchay();
        this.setResizable(false);
        btnSubmit.setEnabled(false);
    }

    public void getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=duan1;user=sa;password=sa2008");
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("Select TOP 20 * from CauHoiTN where TenChuDe = 'Bugs and insects' ORDER BY NEWID()");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    public void loadchay() {
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cong++;
                ProgressBar1.setValue(cong);
                if (cong == 100) {
                    t.stop();
                    resultTest();
                }
            }
        });
        t.start();
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
        ProgressBar1 = new javax.swing.JProgressBar();
        lblSumPoitn = new javax.swing.JLabel();
        lblSumTime = new javax.swing.JLabel();
        lblSumQuiz = new javax.swing.JLabel();
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

        Top.setOpaque(false);
        Top.setPreferredSize(new java.awt.Dimension(1100, 100));

        ProgressBar1.setForeground(new java.awt.Color(0, 255, 127));
        ProgressBar1.setValue(10);

        lblSumPoitn.setBackground(new java.awt.Color(255, 255, 255));
        lblSumPoitn.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblSumPoitn.setOpaque(true);
        lblSumPoitn.setPreferredSize(new java.awt.Dimension(120, 35));

        lblSumTime.setBackground(new java.awt.Color(255, 255, 255));
        lblSumTime.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblSumTime.setOpaque(true);
        lblSumTime.setPreferredSize(new java.awt.Dimension(120, 35));

        lblSumQuiz.setBackground(new java.awt.Color(255, 255, 255));
        lblSumQuiz.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblSumQuiz.setOpaque(true);
        lblSumQuiz.setPreferredSize(new java.awt.Dimension(135, 35));

        javax.swing.GroupLayout TopLayout = new javax.swing.GroupLayout(Top);
        Top.setLayout(TopLayout);
        TopLayout.setHorizontalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSumQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSumTime, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSumPoitn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(681, Short.MAX_VALUE))
        );
        TopLayout.setVerticalGroup(
            TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(TopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSumQuiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSumPoitn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSumTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Top, java.awt.BorderLayout.PAGE_START);

        Main.setOpaque(false);
        Main.setLayout(new java.awt.BorderLayout());

        Left.setBackground(new java.awt.Color(245, 245, 220));
        Left.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 50, 30, 50));
        Left.setPreferredSize(new java.awt.Dimension(600, 500));
        Left.setLayout(new java.awt.BorderLayout());

        Question.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Question.setLayout(new java.awt.BorderLayout());

        lblMaCHTN.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblMaCHTN.setText("Câu TN001:");
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
        rdbOption1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rdbOption1.setBorderPainted(true);
        rdbOption1.setFocusPainted(false);
        rdbOption1.setIconTextGap(30);
        rdbOption1.setMargin(new java.awt.Insets(2, 50, 2, 2));
        rdbOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOption1ActionPerformed(evt);
            }
        });
        OptionA.add(rdbOption1, java.awt.BorderLayout.CENTER);

        Answer.add(OptionA);

        OptionB.setBackground(new java.awt.Color(255, 255, 255));
        OptionB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OptionB.setLayout(new java.awt.BorderLayout());

        rdbOption2.setBackground(new java.awt.Color(255, 255, 255));
        rdbOption2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rdbOption2.setBorderPainted(true);
        rdbOption2.setFocusPainted(false);
        rdbOption2.setIconTextGap(30);
        rdbOption2.setMargin(new java.awt.Insets(2, 50, 2, 2));
        rdbOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOption2ActionPerformed(evt);
            }
        });
        OptionB.add(rdbOption2, java.awt.BorderLayout.CENTER);

        Answer.add(OptionB);

        OptionC.setBackground(new java.awt.Color(255, 255, 255));
        OptionC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OptionC.setLayout(new java.awt.BorderLayout());

        rdbOption3.setBackground(new java.awt.Color(255, 255, 255));
        rdbOption3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rdbOption3.setBorderPainted(true);
        rdbOption3.setFocusPainted(false);
        rdbOption3.setIconTextGap(30);
        rdbOption3.setMargin(new java.awt.Insets(2, 50, 2, 2));
        rdbOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOption3ActionPerformed(evt);
            }
        });
        OptionC.add(rdbOption3, java.awt.BorderLayout.CENTER);

        Answer.add(OptionC);

        OptionD.setBackground(new java.awt.Color(255, 255, 255));
        OptionD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OptionD.setLayout(new java.awt.BorderLayout());

        rdbOption4.setBackground(new java.awt.Color(255, 255, 255));
        rdbOption4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rdbOption4.setBorderPainted(true);
        rdbOption4.setFocusPainted(false);
        rdbOption4.setIconTextGap(30);
        rdbOption4.setMargin(new java.awt.Insets(2, 50, 2, 2));
        rdbOption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOption4ActionPerformed(evt);
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
        resultTest();
    }//GEN-LAST:event_btnSubmitActionPerformed

    public void resultTest() {
        try {
            String url = "UPDATE BaiKiemTra\n"
                    + "SET Diem = '" + point * (10 / count) + "'\n"
                    + "WHERE MaBKT='BKT01'";
            pst = con.prepareStatement(url);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Lưu dữ liệu thành công.");
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(this, "Số câu đúng: " + point + "\n" + "Tổng điểm: " + point * (10.0 / count));
        this.setVisible(false);
    }

    private void rdbOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOption1ActionPerformed
        if (rdbOption1.isSelected() == true) {
            try {
                //String MaCH = rs.getString("MaCH")
                String answer = rs.getString("CauTraLoi");
                String option1 = rs.getString("DapAnA");

                if (option1.trim().equals(answer)) {
                    mp3player1.play();
                    OptionA.setBackground(Color.green);
                    point += 1;
                } else {
                    OptionA.setBackground(Color.red);
                    mp3player2.play();
                    JOptionPane.showMessageDialog(this, answer);
                }
            } catch (Exception e) {
            }
            rdbOption2.setEnabled(false);
            rdbOption3.setEnabled(false);
            rdbOption4.setEnabled(false);
        }
    }//GEN-LAST:event_rdbOption1ActionPerformed

    private void rdbOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOption2ActionPerformed
        if (rdbOption2.isSelected() == true) {
            try {
                String answer = rs.getString("CauTraLoi");
                String option2 = rs.getString("DapAnB");
                if (option2.trim().equals(answer)) {
                    mp3player1.play();
                    OptionB.setBackground(Color.green);
                    point += 1;
                } else {
                    OptionB.setBackground(Color.red);
                    mp3player2.play();
                    JOptionPane.showMessageDialog(this, answer);
                }
            } catch (Exception e) {
            }
            rdbOption1.setEnabled(false);
            rdbOption3.setEnabled(false);
            rdbOption4.setEnabled(false);
        }
    }//GEN-LAST:event_rdbOption2ActionPerformed

    private void rdbOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOption3ActionPerformed
        if (rdbOption3.isSelected() == true) {
            try {
                String answer = rs.getString("CauTraLoi");
                String option3 = rs.getString("DapAnC");
                if (option3.trim().equals(answer)) {
                    mp3player1.play();
                    OptionC.setBackground(Color.green);
                    point += 1;
                } else {
                    OptionB.setBackground(Color.red);
                    mp3player2.play();
                    JOptionPane.showMessageDialog(this, answer);
                }
            } catch (Exception e) {
            }
            rdbOption1.setEnabled(false);
            rdbOption2.setEnabled(false);
            rdbOption4.setEnabled(false);
        }
    }//GEN-LAST:event_rdbOption3ActionPerformed

    private void rdbOption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOption4ActionPerformed
        if (rdbOption4.isSelected() == true) {
            try {
                String answer = rs.getString("CauTraLoi");
                String option4 = rs.getString("DapAnD");
                if (option4.trim().equals(answer)) {
                    mp3player1.play();
                    OptionD.setBackground(Color.green);
                    point += 1;
                } else {
                    OptionD.setBackground(Color.red);
                    mp3player2.play();
                    JOptionPane.showMessageDialog(this, answer);
                }
            } catch (Exception e) {
            }
            rdbOption1.setEnabled(false);
            rdbOption2.setEnabled(false);
            rdbOption3.setEnabled(false);
        }
    }//GEN-LAST:event_rdbOption4ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if (rs.isLast()) {
                JOptionPane.showMessageDialog(this, "Đã hoàn thành số câu hỏi kiểm tra.");
                btnSubmit.setEnabled(true);
            }
        } catch (Exception e) {
        }
        if (rdbOption1.isSelected() == false && rdbOption2.isSelected() == false
                && rdbOption3.isSelected() == false && rdbOption4.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Vui lòng lựa chọn đáp án.");
        } else {
            try {
                if (!rs.isLast()) {
                    rs.next();
                    count += 1;
                    lblMaCHTN.setText("Câu " + rs.getString("MaCHTN") + ":");
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

    public void loadTest() {
        try {
            rs.first();
            lblMaCHTN.setText("Câu " + rs.getString("MaCHTN") + ":");
            rdbOption1.setText(rs.getString("DapAnA"));
            rdbOption2.setText(rs.getString("DapAnB"));
            rdbOption3.setText(rs.getString("DapAnC"));
            rdbOption4.setText(rs.getString("DapAnD"));
            byte[] img = rs.getBytes("HinhAnh");
            ImageIcon imgIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_SMOOTH));
            lblImg.setIcon(imgIcon);
            img_DATA = img;
            if (rdbOption1.equals(rs.getString(8))) {
                rdbOption1.setBackground(Color.green);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void loadData() {
        sumQuiz();
    }

    public void sumQuiz() {
        try {
            int temp = 0;
            while (!rs.isLast()) {
                rs.next();
                temp += 1;
            }
            String sum = Integer.toString(temp);
            lblSumQuiz.setText("Tổng số câu: " + sum);
        } catch (Exception e) {
        }
    }

    public void test() {
        try {
            String url = "Select * from BaiKiemTra where MaND='EFK01', TenCapDo = 'De', TenChuDe = 'Animal'";
            pst = con.prepareStatement(url);

            while (rs.next()) {

            }
        } catch (Exception e) {
            System.out.println(e.toString());
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
            java.util.logging.Logger.getLogger(testK2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testK2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testK2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testK2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testK2().setVisible(true);
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
    private javax.swing.JProgressBar ProgressBar1;
    private javax.swing.JPanel Question;
    private javax.swing.JPanel Right;
    private javax.swing.JPanel Top;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblMaCHTN;
    private javax.swing.JLabel lblSumPoitn;
    private javax.swing.JLabel lblSumQuiz;
    private javax.swing.JLabel lblSumTime;
    private javax.swing.JRadioButton rdbOption1;
    private javax.swing.JRadioButton rdbOption2;
    private javax.swing.JRadioButton rdbOption3;
    private javax.swing.JRadioButton rdbOption4;
    // End of variables declaration//GEN-END:variables
}

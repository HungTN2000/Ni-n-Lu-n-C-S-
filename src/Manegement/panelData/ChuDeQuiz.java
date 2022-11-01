/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manegement.panelData;

import Manegement.Quiz.testD1;
import Manegement.Quiz.testD2;
import Manegement.Quiz.testK1;
import Manegement.Quiz.testK2;
import Manegement.Quiz.testM1;
import Manegement.Quiz.testM2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class ChuDeQuiz extends javax.swing.JPanel {

    private JPanel childPanel;
    private JFrame frame;

    private String username;

    public ChuDeQuiz(String username) {
        initComponents();
        this.username = username;
        loadListTopic();
        lession1.setEnabled(false);
        lession2.setEnabled(false);
        lession3.setEnabled(false);
        cbxCHTN.setEnabled(false);
        cbxCHDT.setEnabled(false);
        cbxAnimals.setEnabled(false);
        cbxBugsAndInsects.setEnabled(false);
        cbxColors.setEnabled(false);
        checkboxTopic();
        LoadBG();
    }

    public void loadListTopic() {
        Topic1();
        Topic2();
        Topic3();
    }

    public void Topic1() {
        ImageIcon MyImage = new ImageIcon("C:\\Java-JSP\\duan9\\src\\img\\Vocabulary\\Animals\\Hamster.jpg");
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(170, 100, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        lblImgTopic1.setIcon(image);
    }

    public void Topic2() {
        ImageIcon MyImage = new ImageIcon("C:\\Java-JSP\\duan9\\src\\img\\Vocabulary\\Bugs and insects\\Grasshopper.jpg");
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(170, 100, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        lblImgTopic2.setIcon(image);
    }

    public void Topic3() {
        ImageIcon MyImage = new ImageIcon("C:\\Java-JSP\\duan9\\src\\img\\Vocabulary\\Colors\\Yellow.jpg");
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(170, 100, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        lblImgTopic3.setIcon(image);
    }

    public void LoadBG() {
        ImageIcon MyImage = new ImageIcon("C:\\Java-JSP\\duan9\\src\\img\\Background\\18.jpg");
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(1292, 500, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        lblBg.setIcon(image);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        cbxDe = new javax.swing.JCheckBox();
        cbxTB = new javax.swing.JCheckBox();
        cbxKho = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        testAll = new javax.swing.JPanel();
        cbxCHTN = new javax.swing.JCheckBox();
        cbxCHDT = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        cbxAnimals = new javax.swing.JCheckBox();
        cbxBugsAndInsects = new javax.swing.JCheckBox();
        cbxColors = new javax.swing.JCheckBox();
        cbxAnimals1 = new javax.swing.JCheckBox();
        ListTopic = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        AnimalTopic = new javax.swing.JPanel();
        lession1 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lblImgTopic1 = new javax.swing.JLabel();
        lession2 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        lblImgTopic2 = new javax.swing.JLabel();
        lession3 = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        lblImgTopic3 = new javax.swing.JLabel();
        lession4 = new javax.swing.JPanel();
        lbl4 = new javax.swing.JLabel();
        lblImgTopic4 = new javax.swing.JLabel();
        lession5 = new javax.swing.JPanel();
        lbl5 = new javax.swing.JLabel();
        lblImgTopic5 = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 102)));
        setPreferredSize(new java.awt.Dimension(1392, 872));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setPreferredSize(new java.awt.Dimension(1392, 100));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("KIỂM TRA TỪ VỰNG THEO CHỦ ĐỀ");
        Header.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1386, 100));

        jSeparator2.setBackground(new java.awt.Color(0, 120, 255));
        jSeparator2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparator2.setOpaque(true);
        Header.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 70, 250, 5));

        jPanel1.add(Header, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(204, 216, 224));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(1392, 152));

        cbxDe.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(cbxDe);
        cbxDe.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxDe.setText("Cấp độ dễ");
        cbxDe.setAutoscrolls(true);
        cbxDe.setBorderPainted(true);
        cbxDe.setFocusPainted(false);
        cbxDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDeActionPerformed(evt);
            }
        });

        cbxTB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(cbxTB);
        cbxTB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxTB.setText("Cấp độ trung bình");
        cbxTB.setAutoscrolls(true);
        cbxTB.setBorderPainted(true);
        cbxTB.setFocusPainted(false);
        cbxTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTBActionPerformed(evt);
            }
        });

        cbxKho.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(cbxKho);
        cbxKho.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxKho.setForeground(new java.awt.Color(51, 51, 51));
        cbxKho.setText("Cấp độ khó");
        cbxKho.setAutoscrolls(true);
        cbxKho.setBorderPainted(true);
        cbxKho.setFocusPainted(false);
        cbxKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKhoActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 204));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Chọn cấp độ bài kiểm tra");

        testAll.setBackground(new java.awt.Color(204, 216, 224));
        testAll.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 0, 0, new java.awt.Color(0, 0, 0)));
        testAll.setPreferredSize(new java.awt.Dimension(863, 152));

        cbxCHTN.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(cbxCHTN);
        cbxCHTN.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxCHTN.setText("Câu hỏi trắc nghiệm");
        cbxCHTN.setAutoscrolls(true);
        cbxCHTN.setBorderPainted(true);
        cbxCHTN.setFocusPainted(false);
        cbxCHTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCHTNActionPerformed(evt);
            }
        });

        cbxCHDT.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(cbxCHDT);
        cbxCHDT.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxCHDT.setText("Câu hỏi điền từ");
        cbxCHDT.setAutoscrolls(true);
        cbxCHDT.setBorderPainted(true);
        cbxCHDT.setFocusPainted(false);
        cbxCHDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCHDTActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cbxAnimals.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(cbxAnimals);
        cbxAnimals.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxAnimals.setText("Động vật");
        cbxAnimals.setAutoscrolls(true);
        cbxAnimals.setBorderPainted(true);
        cbxAnimals.setFocusPainted(false);
        cbxAnimals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxAnimalsMouseClicked(evt);
            }
        });

        cbxBugsAndInsects.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(cbxBugsAndInsects);
        cbxBugsAndInsects.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxBugsAndInsects.setText("Bọ và côn trùng");
        cbxBugsAndInsects.setAutoscrolls(true);
        cbxBugsAndInsects.setBorderPainted(true);
        cbxBugsAndInsects.setFocusPainted(false);
        cbxBugsAndInsects.setPreferredSize(new java.awt.Dimension(160, 21));
        cbxBugsAndInsects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxBugsAndInsectsMouseClicked(evt);
            }
        });

        cbxColors.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(cbxColors);
        cbxColors.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxColors.setText("Màu sắc");
        cbxColors.setAutoscrolls(true);
        cbxColors.setBorderPainted(true);
        cbxColors.setFocusPainted(false);
        cbxColors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxColorsMouseClicked(evt);
            }
        });

        cbxAnimals1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(cbxAnimals1);
        cbxAnimals1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbxAnimals1.setText("Trái cây");
        cbxAnimals1.setAutoscrolls(true);
        cbxAnimals1.setBorderPainted(true);
        cbxAnimals1.setFocusPainted(false);
        cbxAnimals1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxAnimals1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout testAllLayout = new javax.swing.GroupLayout(testAll);
        testAll.setLayout(testAllLayout);
        testAllLayout.setHorizontalGroup(
            testAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testAllLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(testAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxCHTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxCHDT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(testAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxBugsAndInsects, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxColors, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(testAllLayout.createSequentialGroup()
                        .addComponent(cbxAnimals, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxAnimals1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153))
        );
        testAllLayout.setVerticalGroup(
            testAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(testAllLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(testAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(testAllLayout.createSequentialGroup()
                        .addComponent(cbxCHTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxCHDT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(testAllLayout.createSequentialGroup()
                        .addGroup(testAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxAnimals, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAnimals1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxBugsAndInsects, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxColors, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbxDe)
                        .addGap(18, 18, 18)
                        .addComponent(cbxTB)
                        .addGap(18, 18, 18)
                        .addComponent(cbxKho))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(testAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxDe)
                    .addComponent(cbxTB)
                    .addComponent(cbxKho))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(testAll, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        ListTopic.setBackground(new java.awt.Color(255, 255, 255));
        ListTopic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ListTopic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ListTopic.setPreferredSize(new java.awt.Dimension(1392, 575));
        ListTopic.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 30, 30, 30));
        jPanel3.setPreferredSize(new java.awt.Dimension(1392, 575));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AnimalTopic.setBackground(new java.awt.Color(240, 248, 255));
        AnimalTopic.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "DANH SÁCH BÀI KIỂM TRA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 20), new java.awt.Color(0, 0, 0)))); // NOI18N
        AnimalTopic.setAutoscrolls(true);
        AnimalTopic.setOpaque(false);
        AnimalTopic.setPreferredSize(new java.awt.Dimension(1392, 275));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 30);
        flowLayout1.setAlignOnBaseline(true);
        AnimalTopic.setLayout(flowLayout1);

        lession1.setBackground(new java.awt.Color(255, 255, 255));
        lession1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lession1.setPreferredSize(new java.awt.Dimension(340, 200));
        lession1.setLayout(new java.awt.BorderLayout());

        lbl1.setBackground(new java.awt.Color(20, 17, 109));
        lbl1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Chủ đề 1: Động vật");
        lbl1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lbl1.setOpaque(true);
        lbl1.setPreferredSize(new java.awt.Dimension(274, 50));
        lession1.add(lbl1, java.awt.BorderLayout.PAGE_START);

        lblImgTopic1.setBackground(new java.awt.Color(255, 255, 255));
        lblImgTopic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgTopic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgTopic1MouseClicked(evt);
            }
        });
        lession1.add(lblImgTopic1, java.awt.BorderLayout.CENTER);

        AnimalTopic.add(lession1);

        lession2.setBackground(new java.awt.Color(255, 255, 255));
        lession2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lession2.setPreferredSize(new java.awt.Dimension(340, 200));
        lession2.setLayout(new java.awt.BorderLayout());

        lbl2.setBackground(new java.awt.Color(20, 17, 109));
        lbl2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("Chủ đề 2: Bọ và côn trùng");
        lbl2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lbl2.setOpaque(true);
        lbl2.setPreferredSize(new java.awt.Dimension(274, 50));
        lession2.add(lbl2, java.awt.BorderLayout.PAGE_START);

        lblImgTopic2.setBackground(new java.awt.Color(255, 255, 255));
        lblImgTopic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgTopic2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgTopic2MouseClicked(evt);
            }
        });
        lession2.add(lblImgTopic2, java.awt.BorderLayout.CENTER);

        AnimalTopic.add(lession2);

        lession3.setBackground(new java.awt.Color(255, 255, 255));
        lession3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lession3.setPreferredSize(new java.awt.Dimension(340, 200));
        lession3.setLayout(new java.awt.BorderLayout());

        lbl3.setBackground(new java.awt.Color(20, 17, 109));
        lbl3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("Chủ đề 3: Màu sắc");
        lbl3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lbl3.setOpaque(true);
        lbl3.setPreferredSize(new java.awt.Dimension(274, 50));
        lession3.add(lbl3, java.awt.BorderLayout.PAGE_START);

        lblImgTopic3.setBackground(new java.awt.Color(255, 255, 255));
        lblImgTopic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgTopic3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgTopic3MouseClicked(evt);
            }
        });
        lession3.add(lblImgTopic3, java.awt.BorderLayout.CENTER);

        AnimalTopic.add(lession3);

        lession4.setBackground(new java.awt.Color(255, 255, 255));
        lession4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lession4.setPreferredSize(new java.awt.Dimension(340, 200));
        lession4.setLayout(new java.awt.BorderLayout());

        lbl4.setBackground(new java.awt.Color(20, 17, 109));
        lbl4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("Chủ đề 4: Trái cây");
        lbl4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lbl4.setOpaque(true);
        lbl4.setPreferredSize(new java.awt.Dimension(274, 50));
        lession4.add(lbl4, java.awt.BorderLayout.PAGE_START);

        lblImgTopic4.setBackground(new java.awt.Color(255, 255, 255));
        lblImgTopic4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgTopic4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgTopic4MouseClicked(evt);
            }
        });
        lession4.add(lblImgTopic4, java.awt.BorderLayout.CENTER);

        AnimalTopic.add(lession4);

        lession5.setBackground(new java.awt.Color(255, 255, 255));
        lession5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lession5.setPreferredSize(new java.awt.Dimension(340, 200));
        lession5.setLayout(new java.awt.BorderLayout());

        lbl5.setBackground(new java.awt.Color(20, 17, 109));
        lbl5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setText("Chủ đề 4: Trái cây");
        lbl5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        lbl5.setOpaque(true);
        lbl5.setPreferredSize(new java.awt.Dimension(274, 50));
        lession5.add(lbl5, java.awt.BorderLayout.PAGE_START);

        lblImgTopic5.setBackground(new java.awt.Color(255, 255, 255));
        lblImgTopic5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgTopic5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImgTopic5MouseClicked(evt);
            }
        });
        lession5.add(lblImgTopic5, java.awt.BorderLayout.CENTER);

        AnimalTopic.add(lession5);

        jPanel3.add(AnimalTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1292, 530));
        jPanel3.add(lblBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1292, 500));

        ListTopic.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(ListTopic, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void checkboxQuestion() {
        if (cbxDe.isSelected() == true || cbxTB.isSelected() == true || cbxKho.isSelected() == true) {
            cbxCHTN.setEnabled(true);
            cbxCHDT.setEnabled(true);
        }
    }

    public void checkboxTopic() {
        if (cbxCHTN.isSelected() == true || cbxCHDT.isSelected() == true) {
            cbxAnimals.setEnabled(true);
            cbxBugsAndInsects.setEnabled(true);
            cbxColors.setEnabled(true);
        }
    }

    private void cbxDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDeActionPerformed
        checkboxQuestion();
    }//GEN-LAST:event_cbxDeActionPerformed

    private void cbxTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTBActionPerformed
        checkboxQuestion();
    }//GEN-LAST:event_cbxTBActionPerformed

    private void cbxKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxKhoActionPerformed
        checkboxQuestion();
    }//GEN-LAST:event_cbxKhoActionPerformed

    private void cbxCHTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCHTNActionPerformed
        checkboxTopic();
    }//GEN-LAST:event_cbxCHTNActionPerformed

    private void cbxCHDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCHDTActionPerformed
        checkboxTopic();
    }//GEN-LAST:event_cbxCHDTActionPerformed

    private void lblImgTopic1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgTopic1MouseClicked
        if (cbxDe.isSelected() == false && cbxKho.isSelected() == false && cbxTB.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Xin hãy chọn cấp độ!");
        } else if (cbxDe.isSelected() == true || cbxKho.isSelected() == true || cbxTB.isSelected() == true) {
            if (cbxCHTN.isSelected() == false && cbxCHDT.isSelected() == false) {
                JOptionPane.showMessageDialog(this, "Xin hãy chọn loại câu hỏi!");
            } else if (cbxCHTN.isSelected() == true || cbxCHDT.isSelected() == true) {
                if (cbxAnimals.isSelected() == false && cbxBugsAndInsects.isSelected() == false && cbxColors.isSelected() == false) {
                    JOptionPane.showMessageDialog(this, "Xin hãy chọn chủ đề!");
                } else {
                    if (cbxDe.isSelected() == true && cbxCHTN.isSelected() == true && cbxAnimals.isSelected() == true) {
                        lbl1.setBackground(Color.orange);
                        testD1 q = new testD1(username);
                        q.setVisible(true);
                    } else if (cbxTB.isSelected() == true && cbxCHTN.isSelected() == true && cbxAnimals.isSelected() == true) {
                        testM1 q = new testM1();
                        q.setVisible(true);
                    } else if (cbxKho.isSelected() == true && cbxCHTN.isSelected() == true && cbxAnimals.isSelected() == true) {
                        testK1 q = new testK1();
                        q.setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_lblImgTopic1MouseClicked

    private void lblImgTopic2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgTopic2MouseClicked
        if (cbxDe.isSelected() == false && cbxKho.isSelected() == false && cbxTB.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Xin hãy chọn cấp độ!");
        } else if (cbxDe.isSelected() == true || cbxKho.isSelected() == true || cbxTB.isSelected() == true) {
            if (cbxCHTN.isSelected() == false && cbxCHDT.isSelected() == false) {
                JOptionPane.showMessageDialog(this, "Xin hãy chọn loại câu hỏi!");
            } else if (cbxCHTN.isSelected() == true || cbxCHDT.isSelected() == true) {
                if (cbxBugsAndInsects.isSelected() == false && cbxBugsAndInsects.isSelected() == false && cbxColors.isSelected() == false) {
                    JOptionPane.showMessageDialog(this, "Xin hãy chọn chủ đề!");
                } else {
                    if (cbxDe.isSelected() == true && cbxCHTN.isSelected() == true && cbxBugsAndInsects.isSelected() == true) {
                        try {
                            lbl1.setBackground(Color.orange);
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ChuDeQuiz.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        testD2 q = new testD2();
                        q.setVisible(true);
                    } else if (cbxTB.isSelected() == true && cbxCHTN.isSelected() == true && cbxBugsAndInsects.isSelected() == true) {
                        testM2 q = new testM2();
                        q.setVisible(true);
                    } else if (cbxKho.isSelected() == true && cbxCHTN.isSelected() == true && cbxBugsAndInsects.isSelected() == true) {
                        testK2 q = new testK2();
                        q.setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_lblImgTopic2MouseClicked

    private void lblImgTopic3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgTopic3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImgTopic3MouseClicked

    private void lblImgTopic4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgTopic4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImgTopic4MouseClicked

    private void lblImgTopic5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgTopic5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImgTopic5MouseClicked

    private void cbxAnimalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxAnimalsMouseClicked
        lbl1.setBackground(Color.orange);
        lbl2.setBackground(new Color(20,17,109));
        lbl3.setBackground(new Color(20,17,109));
        lbl4.setBackground(new Color(20,17,109));
        
        lbl1.setForeground(Color.black);
        lbl2.setForeground(Color.white);
        lbl3.setForeground(Color.white);
        lbl4.setForeground(Color.white);
        
        lbl1.setFont(new Font("Dialog", Font.BOLD, 16));
        lbl2.setFont(new Font("Dialog", Font.BOLD, 18));
        lbl3.setFont(new Font("Dialog", Font.BOLD, 18));
        lbl4.setFont(new Font("Dialog", Font.BOLD, 18));
    }//GEN-LAST:event_cbxAnimalsMouseClicked

    private void cbxBugsAndInsectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxBugsAndInsectsMouseClicked
        lbl1.setBackground(new Color(20,17,109));
        lbl2.setBackground(Color.orange);
        lbl3.setBackground(new Color(20,17,109));
        lbl4.setBackground(new Color(20,17,109));
        
        lbl1.setForeground(Color.white);
        lbl2.setForeground(Color.black);
        lbl3.setForeground(Color.white);
        lbl4.setForeground(Color.white);
        
        lbl1.setFont(new Font("Dialog", Font.BOLD, 18));
        lbl2.setFont(new Font("Dialog", Font.BOLD, 16));
        lbl3.setFont(new Font("Dialog", Font.BOLD, 18));
        lbl4.setFont(new Font("Dialog", Font.BOLD, 18));
    }//GEN-LAST:event_cbxBugsAndInsectsMouseClicked

    private void cbxColorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxColorsMouseClicked
        lbl1.setBackground(new Color(20,17,109));
        lbl2.setBackground(new Color(20,17,109));
        lbl3.setBackground(Color.orange);
        lbl4.setBackground(new Color(20,17,109));
        
        lbl1.setForeground(Color.white);
        lbl2.setForeground(Color.white);
        lbl3.setForeground(Color.black);
        lbl4.setForeground(Color.white);
        
        lbl1.setFont(new Font("Dialog", Font.BOLD, 18));
        lbl2.setFont(new Font("Dialog", Font.BOLD, 18));
        lbl3.setFont(new Font("Dialog", Font.BOLD, 16));
        lbl4.setFont(new Font("Dialog", Font.BOLD, 18));
    }//GEN-LAST:event_cbxColorsMouseClicked

    private void cbxAnimals1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxAnimals1MouseClicked
        lbl1.setBackground(new Color(20,17,109));
        lbl2.setBackground(new Color(20,17,109));
        lbl3.setBackground(new Color(20,17,109));
        lbl4.setBackground(Color.orange);
        
        lbl1.setForeground(Color.white);
        lbl2.setForeground(Color.white);
        lbl3.setForeground(Color.white);
        lbl4.setForeground(Color.black);
        
        lbl1.setFont(new Font("Dialog", Font.BOLD, 18));
        lbl2.setFont(new Font("Dialog", Font.BOLD, 18));
        lbl3.setFont(new Font("Dialog", Font.BOLD, 18));
        lbl4.setFont(new Font("Dialog", Font.BOLD, 16));
    }//GEN-LAST:event_cbxAnimals1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AnimalTopic;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel ListTopic;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cbxAnimals;
    private javax.swing.JCheckBox cbxAnimals1;
    private javax.swing.JCheckBox cbxBugsAndInsects;
    private javax.swing.JCheckBox cbxCHDT;
    private javax.swing.JCheckBox cbxCHTN;
    private javax.swing.JCheckBox cbxColors;
    private javax.swing.JCheckBox cbxDe;
    private javax.swing.JCheckBox cbxKho;
    private javax.swing.JCheckBox cbxTB;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblImgTopic1;
    private javax.swing.JLabel lblImgTopic2;
    private javax.swing.JLabel lblImgTopic3;
    private javax.swing.JLabel lblImgTopic4;
    private javax.swing.JLabel lblImgTopic5;
    private javax.swing.JPanel lession1;
    private javax.swing.JPanel lession2;
    private javax.swing.JPanel lession3;
    private javax.swing.JPanel lession4;
    private javax.swing.JPanel lession5;
    private javax.swing.JPanel testAll;
    // End of variables declaration//GEN-END:variables
}
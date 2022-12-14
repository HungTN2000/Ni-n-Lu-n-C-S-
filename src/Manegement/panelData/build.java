/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manegement.panelData;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class build extends javax.swing.JPanel {

    private JPanel childPanel;
    private JFrame frame;

    public build() {
        initComponents();
        childPanel = new vocabulary();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();

        btnVocabulary.setBackground(new Color(0, 153, 204));
        btnVocabulary.setForeground(Color.white);
        btnVocabulary.setFont(new Font("Dialog", Font.BOLD, 16));
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
        panelTV = new javax.swing.JPanel();
        btnVocabulary = new BODY.Button.ButtonOption1();
        panelCHTN = new javax.swing.JPanel();
        btnCHTN = new BODY.Button.ButtonOption1();
        panelCHDT = new javax.swing.JPanel();
        btnCHĐT = new BODY.Button.ButtonOption1();
        panelBKT = new javax.swing.JPanel();
        btnBKT = new BODY.Button.ButtonOption1();
        panelND = new javax.swing.JPanel();
        btnND = new BODY.Button.ButtonOption1();
        panelCD = new javax.swing.JPanel();
        btnCD = new BODY.Button.ButtonOption1();
        panelCenter = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1400, 880));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 216, 224));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTV.setBorder(null);
        panelTV.setPreferredSize(new java.awt.Dimension(170, 50));
        panelTV.setLayout(new java.awt.BorderLayout());

        btnVocabulary.setText("Từ vựng");
        btnVocabulary.setBorderPainted(false);
        btnVocabulary.setFocusPainted(false);
        btnVocabulary.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVocabulary.setRadius(20);
        btnVocabulary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVocabularyMouseClicked(evt);
            }
        });
        panelTV.add(btnVocabulary, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, -1, -1));

        panelCHTN.setBorder(null);
        panelCHTN.setPreferredSize(new java.awt.Dimension(220, 50));
        panelCHTN.setLayout(new java.awt.BorderLayout());

        btnCHTN.setText("Câu hỏi trắc nghiệm");
        btnCHTN.setBorderPainted(false);
        btnCHTN.setFocusPainted(false);
        btnCHTN.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCHTN.setRadius(20);
        btnCHTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCHTNMouseClicked(evt);
            }
        });
        panelCHTN.add(btnCHTN, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelCHTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 5, -1, -1));

        panelCHDT.setBorder(null);
        panelCHDT.setPreferredSize(new java.awt.Dimension(190, 50));
        panelCHDT.setLayout(new java.awt.BorderLayout());

        btnCHĐT.setText("Câu hỏi điền từ");
        btnCHĐT.setBorderPainted(false);
        btnCHĐT.setFocusPainted(false);
        btnCHĐT.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCHĐT.setRadius(20);
        btnCHĐT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCHĐTMouseClicked(evt);
            }
        });
        panelCHDT.add(btnCHĐT, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelCHDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 5, -1, -1));

        panelBKT.setBorder(null);
        panelBKT.setPreferredSize(new java.awt.Dimension(180, 50));
        panelBKT.setLayout(new java.awt.BorderLayout());

        btnBKT.setText("Bài kiểm tra");
        btnBKT.setBorderPainted(false);
        btnBKT.setFocusPainted(false);
        btnBKT.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBKT.setRadius(20);
        btnBKT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBKTMouseClicked(evt);
            }
        });
        panelBKT.add(btnBKT, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelBKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 5, -1, -1));

        panelND.setBorder(null);
        panelND.setPreferredSize(new java.awt.Dimension(180, 50));
        panelND.setLayout(new java.awt.BorderLayout());

        btnND.setText("Người dùng");
        btnND.setBorderPainted(false);
        btnND.setFocusPainted(false);
        btnND.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnND.setRadius(20);
        btnND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNDMouseClicked(evt);
            }
        });
        panelND.add(btnND, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelND, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 5, -1, -1));

        panelCD.setBorder(null);
        panelCD.setPreferredSize(new java.awt.Dimension(180, 50));
        panelCD.setLayout(new java.awt.BorderLayout());

        btnCD.setText("Khác");
        btnCD.setBorderPainted(false);
        btnCD.setFocusPainted(false);
        btnCD.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCD.setRadius(20);
        btnCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCDMouseClicked(evt);
            }
        });
        panelCD.add(btnCD, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 5, -1, -1));

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        panelCenter.setBackground(new java.awt.Color(204, 216, 224));
        panelCenter.setPreferredSize(new java.awt.Dimension(1200, 730));
        panelCenter.setLayout(new java.awt.BorderLayout());
        add(panelCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVocabularyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVocabularyMouseClicked
        btnVocabulary.setBackground(new Color(0, 153, 204));
        btnVocabulary.setForeground(Color.white);
        btnVocabulary.setFont(new Font("Dialog", Font.BOLD, 16));

        btnCHTN.setBackground(Color.white);
        btnCHTN.setForeground(Color.black);
        btnCHTN.setFont(new Font("Dialog", Font.BOLD, 18));

        btnCHĐT.setBackground(Color.white);
        btnCHĐT.setForeground(Color.black);
        btnCHĐT.setFont(new Font("Dialog", Font.BOLD, 18));

        btnBKT.setBackground(Color.white);
        btnBKT.setForeground(Color.black);
        btnBKT.setFont(new Font("Dialog", Font.BOLD, 18));

        btnND.setBackground(Color.white);
        btnND.setForeground(Color.black);
        btnND.setFont(new Font("Dialog", Font.BOLD, 18));
        
        btnCD.setBackground(Color.white);
        btnCD.setForeground(Color.black);
        btnCD.setFont(new Font("Dialog", Font.BOLD, 18));

        childPanel = new vocabulary();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_btnVocabularyMouseClicked

    private void btnCHĐTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCHĐTMouseClicked
        btnVocabulary.setBackground(Color.white);
        btnVocabulary.setForeground(Color.black);
        btnVocabulary.setFont(new Font("Dialog", Font.BOLD, 18));

        btnCHTN.setBackground(Color.white);
        btnCHTN.setForeground(Color.black);
        btnCHTN.setFont(new Font("Dialog", Font.BOLD, 18));

        btnCHĐT.setBackground(new Color(0, 153, 204));
        btnCHĐT.setForeground(Color.white);
        btnCHĐT.setFont(new Font("Dialog", Font.BOLD, 16));

        btnBKT.setBackground(Color.white);
        btnBKT.setForeground(Color.black);
        btnBKT.setFont(new Font("Dialog", Font.BOLD, 18));

        btnND.setBackground(Color.white);
        btnND.setForeground(Color.black);
        btnND.setFont(new Font("Dialog", Font.BOLD, 18));
        
        btnCD.setBackground(Color.white);
        btnCD.setForeground(Color.black);
        btnCD.setFont(new Font("Dialog", Font.BOLD, 18));

        childPanel = new addQDT();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_btnCHĐTMouseClicked

    private void btnBKTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBKTMouseClicked
        btnVocabulary.setBackground(Color.white);
        btnVocabulary.setForeground(Color.black);
        btnVocabulary.setFont(new Font("Dialog", Font.BOLD, 18));

        btnCHTN.setBackground(Color.white);
        btnCHTN.setForeground(Color.black);
        btnCHTN.setFont(new Font("Dialog", Font.BOLD, 18));

        btnCHĐT.setBackground(Color.white);
        btnCHĐT.setForeground(Color.black);
        btnCHĐT.setFont(new Font("Dialog", Font.BOLD, 18));

        btnBKT.setBackground(new Color(0, 153, 204));
        btnBKT.setForeground(Color.white);
        btnBKT.setFont(new Font("Dialog", Font.BOLD, 16));

        btnND.setBackground(Color.white);
        btnND.setForeground(Color.black);
        btnND.setFont(new Font("Dialog", Font.BOLD, 18));
        
        btnCD.setBackground(Color.white);
        btnCD.setForeground(Color.black);
        btnCD.setFont(new Font("Dialog", Font.BOLD, 18));

        childPanel = new BKT();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_btnBKTMouseClicked

    private void btnNDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNDMouseClicked
        btnVocabulary.setBackground(Color.white);
        btnVocabulary.setForeground(Color.black);
        btnVocabulary.setFont(new Font("Dialog", Font.BOLD, 18));

        btnCHTN.setBackground(Color.white);
        btnCHTN.setForeground(Color.black);
        btnCHTN.setFont(new Font("Dialog", Font.BOLD, 18));

        btnCHĐT.setBackground(Color.white);
        btnCHĐT.setForeground(Color.black);
        btnCHĐT.setFont(new Font("Dialog", Font.BOLD, 18));

        btnBKT.setBackground(Color.white);
        btnBKT.setForeground(Color.black);
        btnBKT.setFont(new Font("Dialog", Font.BOLD, 18));

        btnND.setBackground(new Color(0, 153, 204));
        btnND.setForeground(Color.white);
        btnND.setFont(new Font("Dialog", Font.BOLD, 16));
        
        btnCD.setBackground(Color.white);
        btnCD.setForeground(Color.black);
        btnCD.setFont(new Font("Dialog", Font.BOLD, 18));

        childPanel = new profile();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_btnNDMouseClicked

    private void btnCHTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCHTNMouseClicked
        btnVocabulary.setBackground(Color.white);
        btnVocabulary.setForeground(Color.black);
        btnVocabulary.setFont(new Font("Dialog", Font.BOLD, 18));

        btnCHTN.setBackground(new Color(0, 153, 204));
        btnCHTN.setForeground(Color.white);
        btnCHTN.setFont(new Font("Dialog", Font.BOLD, 16));

        btnCHĐT.setBackground(Color.white);
        btnCHĐT.setForeground(Color.black);
        btnCHĐT.setFont(new Font("Dialog", Font.BOLD, 18));

        btnBKT.setBackground(Color.white);
        btnBKT.setForeground(Color.black);
        btnBKT.setFont(new Font("Dialog", Font.BOLD, 18));

        btnND.setBackground(Color.white);
        btnND.setForeground(Color.black);
        btnND.setFont(new Font("Dialog", Font.BOLD, 18));
        
        btnCD.setBackground(Color.white);
        btnCD.setForeground(Color.black);
        btnCD.setFont(new Font("Dialog", Font.BOLD, 18));

        childPanel = new addQTN();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_btnCHTNMouseClicked

    private void btnCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCDMouseClicked
        btnVocabulary.setBackground(Color.white);
        btnVocabulary.setForeground(Color.black);
        btnVocabulary.setFont(new Font("Dialog", Font.BOLD, 18));

        btnCHTN.setBackground(Color.white);
        btnCHTN.setForeground(Color.black);
        btnCHTN.setFont(new Font("Dialog", Font.BOLD, 18));

        btnCHĐT.setBackground(Color.white);
        btnCHĐT.setForeground(Color.black);
        btnCHĐT.setFont(new Font("Dialog", Font.BOLD, 18));

        btnBKT.setBackground(Color.white);
        btnBKT.setForeground(Color.black);
        btnBKT.setFont(new Font("Dialog", Font.BOLD, 18));

        btnND.setBackground(Color.white);
        btnND.setForeground(Color.black);
        btnND.setFont(new Font("Dialog", Font.BOLD, 18));

        btnCD.setBackground(new Color(0, 153, 204));
        btnCD.setForeground(Color.white);
        btnCD.setFont(new Font("Dialog", Font.BOLD, 16));

        childPanel = new Khac();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_btnCDMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BODY.Button.ButtonOption1 btnBKT;
    private BODY.Button.ButtonOption1 btnCD;
    private BODY.Button.ButtonOption1 btnCHTN;
    private BODY.Button.ButtonOption1 btnCHĐT;
    private BODY.Button.ButtonOption1 btnND;
    private BODY.Button.ButtonOption1 btnVocabulary;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBKT;
    private javax.swing.JPanel panelCD;
    private javax.swing.JPanel panelCHDT;
    private javax.swing.JPanel panelCHTN;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelND;
    private javax.swing.JPanel panelTV;
    // End of variables declaration//GEN-END:variables
}

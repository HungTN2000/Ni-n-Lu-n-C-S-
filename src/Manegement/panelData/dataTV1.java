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
public class dataTV1 extends javax.swing.JPanel {

    private JPanel childPanel;
    private JFrame frame;

    public dataTV1() {
        initComponents();
        childPanel = new vocabulary();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();

        btnVocabulary.setBackground(new Color(34, 31, 31));
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
        btnVocabulary = new Build.ButtonOption1();
        panelCHTN = new javax.swing.JPanel();
        btnCHTN = new Build.ButtonOption1();
        panelCHDT = new javax.swing.JPanel();
        btnCHĐT = new Build.ButtonOption1();
        panelND = new javax.swing.JPanel();
        btnBKT = new Build.ButtonOption1();
        panelBKT = new javax.swing.JPanel();
        btnND = new Build.ButtonOption1();
        panelCenter = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1392, 872));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 216, 224));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTV.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255))));
        panelTV.setPreferredSize(new java.awt.Dimension(170, 50));
        panelTV.setLayout(new java.awt.BorderLayout());

        btnVocabulary.setBackground(new java.awt.Color(245, 248, 250));
        btnVocabulary.setText("Từ vựng");
        btnVocabulary.setBorderPainted(false);
        btnVocabulary.setFocusPainted(false);
        btnVocabulary.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVocabulary.setRadius(15);
        btnVocabulary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVocabularyMouseClicked(evt);
            }
        });
        panelTV.add(btnVocabulary, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        panelCHTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255))));
        panelCHTN.setPreferredSize(new java.awt.Dimension(220, 50));
        panelCHTN.setLayout(new java.awt.BorderLayout());

        btnCHTN.setBackground(new java.awt.Color(245, 248, 250));
        btnCHTN.setText("Câu hỏi trắc nghiệm");
        btnCHTN.setBorderPainted(false);
        btnCHTN.setFocusPainted(false);
        btnCHTN.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCHTN.setRadius(15);
        btnCHTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCHTNMouseClicked(evt);
            }
        });
        panelCHTN.add(btnCHTN, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelCHTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 5, -1, -1));

        panelCHDT.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255))));
        panelCHDT.setPreferredSize(new java.awt.Dimension(190, 50));
        panelCHDT.setLayout(new java.awt.BorderLayout());

        btnCHĐT.setBackground(new java.awt.Color(245, 248, 250));
        btnCHĐT.setText("Câu hỏi điền từ");
        btnCHĐT.setBorderPainted(false);
        btnCHĐT.setFocusPainted(false);
        btnCHĐT.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCHĐT.setRadius(15);
        btnCHĐT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCHĐTMouseClicked(evt);
            }
        });
        panelCHDT.add(btnCHĐT, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelCHDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 5, -1, -1));

        panelND.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255))));
        panelND.setPreferredSize(new java.awt.Dimension(180, 50));
        panelND.setLayout(new java.awt.BorderLayout());

        btnBKT.setBackground(new java.awt.Color(245, 248, 250));
        btnBKT.setText("Bài kiểm tra");
        btnBKT.setBorderPainted(false);
        btnBKT.setFocusPainted(false);
        btnBKT.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBKT.setRadius(15);
        btnBKT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBKTMouseClicked(evt);
            }
        });
        panelND.add(btnBKT, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelND, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 5, -1, -1));

        panelBKT.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255))));
        panelBKT.setPreferredSize(new java.awt.Dimension(180, 50));
        panelBKT.setLayout(new java.awt.BorderLayout());

        btnND.setBackground(new java.awt.Color(245, 248, 250));
        btnND.setText("Người dùng");
        btnND.setBorderPainted(false);
        btnND.setFocusPainted(false);
        btnND.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnND.setRadius(15);
        btnND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNDMouseClicked(evt);
            }
        });
        panelBKT.add(btnND, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelBKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 5, -1, -1));

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
        btnCHTN.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnCHĐT.setBackground(Color.white);
        btnCHĐT.setForeground(Color.black);
        btnCHĐT.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnBKT.setBackground(Color.white);
        btnBKT.setForeground(Color.black);
        btnBKT.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnND.setBackground(Color.white);
        btnND.setForeground(Color.black);
        btnND.setFont(new Font("Dialog", Font.PLAIN, 18));

        childPanel = new vocabulary();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_btnVocabularyMouseClicked

    private void btnCHĐTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCHĐTMouseClicked
        btnVocabulary.setBackground(Color.white);
        btnVocabulary.setForeground(Color.black);
        btnVocabulary.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnCHTN.setBackground(Color.white);
        btnCHTN.setForeground(Color.black);
        btnCHTN.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnCHĐT.setBackground(new Color(0, 153, 204));
        btnCHĐT.setForeground(Color.white);
        btnCHĐT.setFont(new Font("Dialog", Font.BOLD, 16));

        btnBKT.setBackground(Color.white);
        btnBKT.setForeground(Color.black);
        btnBKT.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnND.setBackground(Color.white);
        btnND.setForeground(Color.black);
        btnND.setFont(new Font("Dialog", Font.PLAIN, 18));

        childPanel = new addQDT();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_btnCHĐTMouseClicked

    private void btnBKTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBKTMouseClicked
        btnVocabulary.setBackground(Color.white);
        btnVocabulary.setForeground(Color.black);
        btnVocabulary.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnCHTN.setBackground(Color.white);
        btnCHTN.setForeground(Color.black);
        btnCHTN.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnCHĐT.setBackground(Color.white);
        btnCHĐT.setForeground(Color.black);
        btnCHĐT.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnBKT.setBackground(new Color(0, 153, 204));
        btnBKT.setForeground(Color.white);
        btnBKT.setFont(new Font("Dialog", Font.BOLD, 16));

        btnND.setBackground(Color.white);
        btnND.setForeground(Color.black);
        btnND.setFont(new Font("Dialog", Font.PLAIN, 18));

        childPanel = new BKT();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_btnBKTMouseClicked

    private void btnNDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNDMouseClicked
        btnVocabulary.setBackground(Color.white);
        btnVocabulary.setForeground(Color.black);
        btnVocabulary.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnCHTN.setBackground(Color.white);
        btnCHTN.setForeground(Color.black);
        btnCHTN.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnCHĐT.setBackground(Color.white);
        btnCHĐT.setForeground(Color.black);
        btnCHĐT.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnBKT.setBackground(Color.white);
        btnBKT.setForeground(Color.black);
        btnBKT.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnND.setBackground(new Color(0, 153, 204));
        btnND.setForeground(Color.white);
        btnND.setFont(new Font("Dialog", Font.BOLD, 16));

        childPanel = new profile();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_btnNDMouseClicked

    private void btnCHTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCHTNMouseClicked
        btnVocabulary.setBackground(Color.white);
        btnVocabulary.setForeground(Color.black);
        btnVocabulary.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnCHTN.setBackground(new Color(0, 153, 204));
        btnCHTN.setForeground(Color.white);
        btnCHTN.setFont(new Font("Dialog", Font.BOLD, 16));

        btnCHĐT.setBackground(Color.white);
        btnCHĐT.setForeground(Color.black);
        btnCHĐT.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnBKT.setBackground(Color.white);
        btnBKT.setForeground(Color.black);
        btnBKT.setFont(new Font("Dialog", Font.PLAIN, 18));

        btnND.setBackground(Color.white);
        btnND.setForeground(Color.black);
        btnND.setFont(new Font("Dialog", Font.PLAIN, 18));

        childPanel = new addQTN();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_btnCHTNMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Build.ButtonOption1 btnBKT;
    private Build.ButtonOption1 btnCHTN;
    private Build.ButtonOption1 btnCHĐT;
    private Build.ButtonOption1 btnND;
    private Build.ButtonOption1 btnVocabulary;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBKT;
    private javax.swing.JPanel panelCHDT;
    private javax.swing.JPanel panelCHTN;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelND;
    private javax.swing.JPanel panelTV;
    // End of variables declaration//GEN-END:variables
}
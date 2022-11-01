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
public class dataTV extends javax.swing.JPanel {

    private JPanel childPanel;
    private JFrame frame;

    public dataTV() {
        initComponents();
        childPanel = new vocabulary();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();

        panelTV.setBackground(new Color(0,153,204));
        lblTV.setForeground(Color.white);
        lblTV.setFont(new Font("Verdana", Font.BOLD, 18));
    }
    
    class jPanelGradient extends JPanel {

        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = 1200;
            int height = 830;

            Color color1 = new Color(0,153,204);
            Color color2 = new Color(255, 255, 255);
            GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
            g2d.setPaint(gp);
            g2d.fill3DRect(0, 0, width, height, true);
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
        panelTV = new javax.swing.JPanel();
        lblTV = new javax.swing.JLabel();
        panelCHTN = new javax.swing.JPanel();
        lblCHTN = new javax.swing.JLabel();
        panelCHDT = new javax.swing.JPanel();
        lblCHDT = new javax.swing.JLabel();
        panelND = new javax.swing.JPanel();
        lblND = new javax.swing.JLabel();
        panelBKT = new javax.swing.JPanel();
        lblBKT = new javax.swing.JLabel();
        panelCenter = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1392, 872));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(253, 245, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.green, java.awt.Color.green), javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0)));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTV.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        panelTV.setPreferredSize(new java.awt.Dimension(180, 50));
        panelTV.setLayout(new java.awt.BorderLayout());

        lblTV.setBackground(new java.awt.Color(255, 255, 255));
        lblTV.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblTV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTV.setText("Từ vựng");
        lblTV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTVMouseEntered(evt);
            }
        });
        panelTV.add(lblTV, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        panelCHTN.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        panelCHTN.setPreferredSize(new java.awt.Dimension(210, 50));
        panelCHTN.setLayout(new java.awt.BorderLayout());

        lblCHTN.setBackground(new java.awt.Color(255, 255, 255));
        lblCHTN.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblCHTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCHTN.setText("Câu hỏi trắc nghiệm");
        lblCHTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblCHTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCHTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCHTNMouseEntered(evt);
            }
        });
        panelCHTN.add(lblCHTN, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelCHTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 5, -1, -1));

        panelCHDT.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        panelCHDT.setPreferredSize(new java.awt.Dimension(190, 50));
        panelCHDT.setLayout(new java.awt.BorderLayout());

        lblCHDT.setBackground(new java.awt.Color(255, 255, 255));
        lblCHDT.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblCHDT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCHDT.setText("Câu hỏi điền từ");
        lblCHDT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblCHDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCHDTMouseClicked(evt);
            }
        });
        panelCHDT.add(lblCHDT, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelCHDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 5, -1, -1));

        panelND.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        panelND.setPreferredSize(new java.awt.Dimension(180, 50));
        panelND.setLayout(new java.awt.BorderLayout());

        lblND.setBackground(new java.awt.Color(255, 255, 255));
        lblND.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblND.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblND.setText("Người dùng");
        lblND.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNDMouseClicked(evt);
            }
        });
        panelND.add(lblND, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelND, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 5, -1, -1));

        panelBKT.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        panelBKT.setPreferredSize(new java.awt.Dimension(180, 50));
        panelBKT.setLayout(new java.awt.BorderLayout());

        lblBKT.setBackground(new java.awt.Color(255, 255, 255));
        lblBKT.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblBKT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBKT.setText("Bài kiểm tra");
        lblBKT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblBKT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBKTMouseClicked(evt);
            }
        });
        panelBKT.add(lblBKT, java.awt.BorderLayout.CENTER);

        jPanel1.add(panelBKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(765, 5, -1, -1));

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        panelCenter.setBackground(new java.awt.Color(255, 251, 209));
        panelCenter.setPreferredSize(new java.awt.Dimension(1200, 730));
        panelCenter.setLayout(new java.awt.BorderLayout());
        add(panelCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lblTVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTVMouseClicked
        panelTV.setBackground(new Color(0,153,204));
        lblTV.setForeground(Color.white);
        lblTV.setFont(new Font("Verdana", Font.BOLD, 16));
        
        panelCHTN.setBackground(Color.white);
        lblCHTN.setForeground(Color.black);
        lblCHTN.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelCHDT.setBackground(Color.white);
        lblCHDT.setForeground(Color.black);
        lblCHDT.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelND.setBackground(Color.white);
        lblND.setForeground(Color.black);
        lblND.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelBKT.setBackground(Color.white);
        lblBKT.setForeground(Color.black);
        lblBKT.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        childPanel = new vocabulary();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_lblTVMouseClicked

    private void lblCHTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCHTNMouseClicked
        panelTV.setBackground(Color.white);
        lblTV.setForeground(Color.black);
        lblTV.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelCHTN.setBackground(new Color(0,153,204));
        lblCHTN.setForeground(Color.white);
        lblCHTN.setFont(new Font("Verdana", Font.BOLD, 16));
        
        panelCHDT.setBackground(Color.white);
        lblCHDT.setForeground(Color.black);
        lblCHDT.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelND.setBackground(Color.white);
        lblND.setForeground(Color.black);
        lblND.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelBKT.setBackground(Color.white);
        lblBKT.setForeground(Color.black);
        lblBKT.setFont(new Font("Verdana", Font.PLAIN, 18));

        childPanel = new addQTN();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_lblCHTNMouseClicked

    private void lblCHDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCHDTMouseClicked
        panelTV.setBackground(Color.white);
        lblTV.setForeground(Color.black);
        lblTV.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelCHTN.setBackground(Color.white);
        lblCHTN.setForeground(Color.black);
        lblCHTN.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelCHDT.setBackground(new Color(0,153,204));
        lblCHDT.setForeground(Color.white);
        lblCHDT.setFont(new Font("Verdana", Font.BOLD, 16));
        
        panelND.setBackground(Color.white);
        lblND.setForeground(Color.black);
        lblND.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelBKT.setBackground(Color.white);
        lblBKT.setForeground(Color.black);
        lblBKT.setFont(new Font("Verdana", Font.PLAIN, 18));

        childPanel = new addQDT();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_lblCHDTMouseClicked

    private void lblNDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNDMouseClicked
        panelTV.setBackground(Color.white);
        lblTV.setForeground(Color.black);
        lblTV.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelCHTN.setBackground(Color.white);
        lblCHTN.setForeground(Color.black);
        lblCHTN.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelCHDT.setBackground(Color.white);
        lblCHDT.setForeground(Color.black);
        lblCHDT.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelND.setBackground(new Color(0,153,204));
        lblND.setForeground(Color.white);
        lblND.setFont(new Font("Verdana", Font.BOLD, 16));
        
        panelBKT.setBackground(Color.white);
        lblBKT.setForeground(Color.black);
        lblBKT.setFont(new Font("Verdana", Font.PLAIN, 18));

        childPanel = new profile();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_lblNDMouseClicked

    private void lblBKTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBKTMouseClicked
        panelTV.setBackground(Color.white);
        lblTV.setForeground(Color.black);
        lblTV.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelCHTN.setBackground(Color.white);
        lblCHTN.setForeground(Color.black);
        lblCHTN.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelCHDT.setBackground(Color.white);
        lblCHDT.setForeground(Color.black);
        lblCHDT.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelND.setBackground(Color.white);
        lblND.setForeground(Color.black);
        lblND.setFont(new Font("Verdana", Font.PLAIN, 18));
        
        panelBKT.setBackground(new Color(0,153,204));
        lblBKT.setForeground(Color.white);
        lblBKT.setFont(new Font("Verdana", Font.BOLD, 16));

        childPanel = new BKT();
        panelCenter.removeAll();
        panelCenter.add(childPanel);
        panelCenter.validate();
    }//GEN-LAST:event_lblBKTMouseClicked

    private void lblTVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTVMouseEntered
        setBackground(Color.red);
    }//GEN-LAST:event_lblTVMouseEntered

    private void lblCHTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCHTNMouseEntered
        setBackground(Color.red);
    }//GEN-LAST:event_lblCHTNMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBKT;
    private javax.swing.JLabel lblCHDT;
    private javax.swing.JLabel lblCHTN;
    private javax.swing.JLabel lblND;
    private javax.swing.JLabel lblTV;
    private javax.swing.JPanel panelBKT;
    private javax.swing.JPanel panelCHDT;
    private javax.swing.JPanel panelCHTN;
    private javax.swing.JPanel panelCenter;
    private javax.swing.JPanel panelND;
    private javax.swing.JPanel panelTV;
    // End of variables declaration//GEN-END:variables
}
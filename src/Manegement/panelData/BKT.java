/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manegement.panelData;

import Manegement.classData.listBKT;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import user.Connect;

/**
 *
 * @author HP
 */
public class BKT extends javax.swing.JPanel {

//    final String col[] = {"MÃ BKT", "MÃ ND", "TÊN CẤP ĐỘ", "TÊN CHỦ ĐỀ", "ĐIỂM"};
//    final DefaultTableModel tbn = new DefaultTableModel(col, 0);
    ArrayList<listBKT> list = new ArrayList<listBKT>();
    int current = 0;

    DefaultTableModel tbn = new DefaultTableModel();
    Connect a = new Connect();
    Connection con = a.getConnection();
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String fPath = null;
    byte[] img_DATA;

    private DefaultListModel mode;

    public BKT() {
        initComponents();
        dataEnabledButton(); //ẩn các nút
        loadDataCBBMaND(); //lấy mã người dùng trong sql
        loadDataCBBLevel(); //lấy tên cấp độ trong sql
        loadDataCBBTopic(); //lấy tên chủ đề trong sql
        load_dataClass(); //tải dữ liệu danh sách mảng
        load_dataBKT(); //tải lên bảng
    }

    public void getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=duan1;user=sa;password=sa2008");
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery("select * from BaiKiemTra");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    public void load_dataClass() {
        try {
            String url = "SELECT MaBKT, MaND, TenCapDo, TenChuDe, Diem, NgayKiem = CONVERT(varchar, NgayKiem, 103)\n"
                    + "FROM BaiKiemTra";
            st = con.createStatement();
            rs = st.executeQuery(url);
            list.clear();
            listBKT data;
            while (rs.next()) {
                data = new listBKT(rs.getString("MaBKT"), rs.getString("MaND"), rs.getString("TenCapDo"), rs.getString("TenChuDe"), rs.getFloat("Diem"), rs.getString("NgayKiem"));
                list.add(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void load_dataBKT() {
        tbn = (DefaultTableModel) tblBKT.getModel();
        tbn.setRowCount(0);
        for (listBKT i : list) {
            tbn.addRow(new Object[]{i.getMaBKT(), i.getMaND(), i.getTenCapDo(), i.getTenChuDe(), i.getDiem(), i.getNgayKiem()});
        }
        JTableHeader Theader = tblBKT.getTableHeader();

        Theader.setBackground(new Color(18, 16, 14));
        Theader.setForeground(Color.black);

        Theader.setFont(new Font("Roboto", Font.BOLD, 17));
        Theader.setForeground(Color.white);
        ((DefaultTableCellRenderer) Theader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);

        tblBKT.setFont(new Font("Roboto", Font.PLAIN, 17));
        tblBKT.setSelectionBackground(new Color(59, 89, 152));
        tblBKT.setSelectionForeground(Color.white);
    }

    public void loadDataCBBMaND() {
        try {
            pst = con.prepareStatement("Select * from NguoiDung");
            rs = pst.executeQuery();

            //Tạo 1 DefaultComboboxModel
            DefaultComboBoxModel dataCBBTopic = (DefaultComboBoxModel) cbbMaND.getModel();
            dataCBBTopic.removeAllElements(); //Xóa hết dữ liệu trong combobox
            while (rs.next()) {
                cbbMaND.addItem(rs.getString("MaND"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi tải dữ liệu MaND!");
        }
    }

    public void loadDataCBBLevel() {
        try {
            pst = con.prepareStatement("Select * from CapDo");
            rs = pst.executeQuery();

            //Tạo 1 DefaultComboboxModel
            DefaultComboBoxModel dataCBBTopic = (DefaultComboBoxModel) cbbTenCapDo.getModel();
            dataCBBTopic.removeAllElements(); //Xóa hết dữ liệu trong combobox
            while (rs.next()) {
                cbbTenCapDo.addItem(rs.getString("TenCapDo"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi tải dữ liệu TenCapDo!");
        }
    }

    public void loadDataCBBTopic() {
        try {
            pst = con.prepareStatement("Select * from ChuDe");
            rs = pst.executeQuery();

            //Tạo 1 DefaultComboboxModel
            DefaultComboBoxModel dataCBBTopic = (DefaultComboBoxModel) cbbTenChuDe.getModel();
            dataCBBTopic.removeAllElements(); //Xóa hết dữ liệu trong combobox
            while (rs.next()) {
                cbbTenChuDe.addItem(rs.getString("TenChuDe"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi tải dữ liệu TenChuDe!");
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

        Hearder = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Main = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBKT = new javax.swing.JTable();
        Right = new javax.swing.JPanel();
        RightTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaBKT = new javax.swing.JTextField();
        cbbMaND = new javax.swing.JComboBox<>();
        cbbTenCapDo = new javax.swing.JComboBox<>();
        cbbTenChuDe = new javax.swing.JComboBox<>();
        txtDiem = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        RightLast = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 216, 224));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        setPreferredSize(new java.awt.Dimension(1392, 812));
        setLayout(new java.awt.BorderLayout());

        Hearder.setBackground(new java.awt.Color(255, 255, 255));
        Hearder.setPreferredSize(new java.awt.Dimension(0, 200));
        Hearder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel7.setPreferredSize(new java.awt.Dimension(430, 80));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/3844432_magnifier_search_zoom_icon.png"))); // NOI18N
        btnSearch.setPreferredSize(new java.awt.Dimension(65, 35));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtSearch.setPreferredSize(new java.awt.Dimension(6, 35));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setText("Tìm kiếm");
        jLabel8.setPreferredSize(new java.awt.Dimension(120, 35));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(970, 970, 970)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Hearder.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1388, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DỮ LIỆU BÀI KIỂM TRA");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jLabel7.setPreferredSize(new java.awt.Dimension(250, 50));
        Hearder.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1388, 100));

        jSeparator1.setBackground(new java.awt.Color(0, 120, 255));
        jSeparator1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparator1.setOpaque(true);
        Hearder.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 70, 200, 5));

        add(Hearder, java.awt.BorderLayout.PAGE_START);

        Main.setBackground(new java.awt.Color(204, 216, 224));
        Main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Main.setPreferredSize(new java.awt.Dimension(1052, 452));
        Main.setLayout(new java.awt.BorderLayout());

        Left.setBackground(new java.awt.Color(204, 216, 224));
        Left.setPreferredSize(new java.awt.Dimension(500, 420));
        Left.setLayout(new java.awt.BorderLayout());

        tblBKT.setAutoCreateRowSorter(true);
        tblBKT.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        tblBKT.setForeground(new java.awt.Color(0, 0, 0));
        tblBKT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ BKT", "MÃ ND", "TÊN CẤP ĐỘ", "TÊN CHỦ ĐỀ", "ĐIỂM", "NGÀY KIỂM"
            }
        ));
        tblBKT.setGridColor(new java.awt.Color(0, 0, 0));
        tblBKT.setRowHeight(40);
        tblBKT.setRowMargin(5);
        tblBKT.setShowHorizontalLines(true);
        tblBKT.setShowVerticalLines(true);
        tblBKT.setSurrendersFocusOnKeystroke(true);
        tblBKT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBKTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBKT);

        Left.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        Main.add(Left, java.awt.BorderLayout.CENTER);

        Right.setBackground(new java.awt.Color(204, 216, 224));
        Right.setPreferredSize(new java.awt.Dimension(550, 100));
        Right.setLayout(new java.awt.BorderLayout());

        RightTop.setBackground(new java.awt.Color(252, 204, 99));
        RightTop.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        RightTop.setPreferredSize(new java.awt.Dimension(500, 310));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setText("Mã BKT");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setText("Mã ND");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel3.setText("Tên cấp độ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setText("Tên chủ đề");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel5.setText("Điểm");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel6.setText("Ngày KT");

        txtMaBKT.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtMaBKT.setPreferredSize(new java.awt.Dimension(300, 35));

        cbbMaND.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        cbbMaND.setPreferredSize(new java.awt.Dimension(300, 35));

        cbbTenCapDo.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        cbbTenCapDo.setPreferredSize(new java.awt.Dimension(300, 35));

        cbbTenChuDe.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        cbbTenChuDe.setPreferredSize(new java.awt.Dimension(300, 35));

        txtDiem.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtDiem.setPreferredSize(new java.awt.Dimension(300, 35));

        txtDate.setPreferredSize(new java.awt.Dimension(300, 35));

        javax.swing.GroupLayout RightTopLayout = new javax.swing.GroupLayout(RightTop);
        RightTop.setLayout(RightTopLayout);
        RightTopLayout.setHorizontalGroup(
            RightTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightTopLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RightTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(RightTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbbTenChuDe, 0, 312, Short.MAX_VALUE)
                    .addComponent(cbbTenCapDo, 0, 1, Short.MAX_VALUE)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbMaND, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaBKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RightTopLayout.setVerticalGroup(
            RightTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightTopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(RightTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaBKT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RightTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMaND, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RightTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTenCapDo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RightTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTenChuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RightTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RightTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Right.add(RightTop, java.awt.BorderLayout.CENTER);

        RightLast.setBackground(new java.awt.Color(255, 250, 250));
        RightLast.setPreferredSize(new java.awt.Dimension(500, 200));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout1.setAlignOnBaseline(true);
        RightLast.setLayout(flowLayout1);

        btnAdd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/34237_+_add_plus_icon.png"))); // NOI18N
        btnAdd.setText("THÊM");
        btnAdd.setOpaque(true);
        btnAdd.setPreferredSize(new java.awt.Dimension(130, 40));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        RightLast.add(btnAdd);

        btnSave.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/285657_floppy_guardar_save_icon.png"))); // NOI18N
        btnSave.setText("LƯU");
        btnSave.setOpaque(true);
        btnSave.setPreferredSize(new java.awt.Dimension(130, 40));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        RightLast.add(btnSave);

        btnEdit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/17009_arrows_exchange_interact_refresh_reload_icon.png"))); // NOI18N
        btnEdit.setText("SỬA");
        btnEdit.setOpaque(true);
        btnEdit.setPreferredSize(new java.awt.Dimension(130, 40));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        RightLast.add(btnEdit);

        btnDelete.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/34218_add_cross_delete_exit_remove_icon.png"))); // NOI18N
        btnDelete.setText("XÓA");
        btnDelete.setOpaque(true);
        btnDelete.setPreferredSize(new java.awt.Dimension(130, 40));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        RightLast.add(btnDelete);

        btnReset.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/9855519_reset_reload_sync_update_icon.png"))); // NOI18N
        btnReset.setText("LÀM MỚI");
        btnReset.setOpaque(true);
        btnReset.setPreferredSize(new java.awt.Dimension(150, 40));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        RightLast.add(btnReset);

        Right.add(RightLast, java.awt.BorderLayout.PAGE_END);

        Main.add(Right, java.awt.BorderLayout.EAST);

        add(Main, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        btnAdd.setEnabled(false);
        dataNotEnabledButton();
        reset();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String url = "insert into BaiKiemTra values (?,?,?,?,?,?)";
            pst = con.prepareStatement(url);
            pst.setString(1, txtMaBKT.getText());
            pst.setString(2, cbbMaND.getSelectedItem().toString());
            pst.setString(3, cbbTenCapDo.getSelectedItem().toString());
            pst.setString(4, cbbTenChuDe.getSelectedItem().toString());
            pst.setString(5, txtDiem.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String date = sdf.format(txtDate.getDate());
            pst.setString(6, date);
            pst.executeUpdate();
            load_dataClass();
            load_dataBKT();
            JOptionPane.showMessageDialog(null, "Lưu dữ liệu thành công.");
            btnAdd.setEnabled(true);
            dataEnabledButton();
            reset();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtMaBKT.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập mã bài kiểm muốn xóa!");
            txtMaBKT.requestFocus();
            return;
        }
        try {
            int row = 0;
            pst = con.prepareStatement("Delete from BaiKiemTra where MaBKT=?");
            pst.setString(1, txtMaBKT.getText());
            if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                pst.executeUpdate();
                if (row > 0) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại");
                }
            }
            btnAdd.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi");
            System.out.print(e.toString());
        }

        load_dataClass();
        load_dataBKT();
        dataEnabledButton();
        reset();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            pst = con.prepareStatement("Update BaiKiemTra set MaND=?,TenCapDo=?,TenChuDe=?,Diem=?, NgayKiem=? where MaBKT=?");
            pst.setString(6, txtMaBKT.getText());
            pst.setString(1, cbbMaND.getSelectedItem().toString());
            pst.setString(2, cbbTenCapDo.getSelectedItem().toString());
            pst.setString(3, cbbTenChuDe.getSelectedItem().toString());
            pst.setString(4, txtDiem.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String date = sdf.format(txtDate.getDate());
            pst.setString(5, date);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công.");
            btnAdd.setEnabled(true);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        load_dataClass();
        load_dataBKT();
        dataEnabledButton();
        reset();
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblBKT.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(model);
        tblBKT.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            pst = con.prepareStatement("Select * from BaiKiemTra where MaBKT=?");
            pst.setString(1, txtSearch.getText());
            rs = pst.executeQuery();
            while (rs.next()) {
                txtMaBKT.setText(rs.getString("MaBKT"));
                cbbMaND.setSelectedItem(rs.getString("MaND"));
                cbbTenCapDo.setSelectedItem(rs.getString("TenCapDo"));
                cbbTenChuDe.setSelectedItem(rs.getString("TenChuDe"));
                txtDiem.setText(rs.getString("Diem"));
            }
            btnAdd.setEnabled(false);
            dataNotEnabledButton();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblBKTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBKTMouseClicked
        current = tblBKT.getSelectedRow();
        show_frame(current);

        dataNotEnabledButton();
    }//GEN-LAST:event_tblBKTMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    public void show_frame(int current) {
        listBKT p = list.get(current);

        txtMaBKT.setText(p.getMaBKT());
        cbbMaND.setSelectedItem(p.getMaND());
        cbbTenCapDo.setSelectedItem(p.getTenCapDo());
        cbbTenChuDe.setSelectedItem(p.getTenChuDe());
        String point = Float.toString(p.getDiem());
        txtDiem.setText(point);
        try {
            int srow = tblBKT.getSelectedRow();
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse((String) p.getNgayKiem());
            txtDate.setDate(date);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void dataEnabledButton() {
        btnAdd.setEnabled(true);
        btnSave.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnReset.setEnabled(false);
        txtMaBKT.setEnabled(false);
        cbbMaND.setEnabled(false);
        cbbTenCapDo.setEnabled(false);
        cbbTenChuDe.setEnabled(false);
        txtDiem.setEnabled(false);
        txtDate.setEnabled(false);
    }

    public void dataNotEnabledButton() {
        btnAdd.setEnabled(false);
        btnSave.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        btnReset.setEnabled(true);
        txtMaBKT.setEnabled(true);
        cbbMaND.setEnabled(true);
        cbbTenCapDo.setEnabled(true);
        cbbTenChuDe.setEnabled(true);
        txtDiem.setEnabled(true);
        txtDate.setEnabled(true);
    }

    public void reset() {
        txtMaBKT.setText("");
        cbbMaND.setSelectedItem(0);
        cbbTenCapDo.setSelectedItem(0);
        cbbTenChuDe.setSelectedItem(0);
        txtDiem.setText("");
        txtDate.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Hearder;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Right;
    private javax.swing.JPanel RightLast;
    private javax.swing.JPanel RightTop;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbbMaND;
    private javax.swing.JComboBox<String> cbbTenCapDo;
    private javax.swing.JComboBox<String> cbbTenChuDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblBKT;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtMaBKT;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}

package MAIN;

import GUI.Custom.ComboCellInsetsDemo;
import GUI.Custom.ResizeImage;
import Table.TableValue;
import static MAIN.Confirm_Create_Account.tbLst;
import static MAIN.Confirm_Create_Account.tbRequest;
import static MAIN.Confirm_Create_Account.tb_Register_A;
import MD5.CheckBoxHeader;
import Models.Device;
import SQL.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Borrow_Device extends javax.swing.JPanel implements TableModelListener, ActionListener {

    ConnectMySQL cn = new ConnectMySQL();
    public static DefaultTableModel tbBorrow, tbLst;
    private ResizeImage ri = new ResizeImage();
    private JPopupMenu menu = new JPopupMenu();
    private JMenuItem details = new JMenuItem("Chi tiết");
    private JMenuItem edit = new JMenuItem("Sửa");
    private JMenuItem delete = new JMenuItem("Xoá");
    private TableValue tv = new TableValue();
    
    Object[] result;

    public Borrow_Device() {
        initComponents();
        addMenu();
        tbBorrow = cn.getBorrow();
        tb_Borrow_D.setModel(tbBorrow);
        tbLst = tv.listModel(tbBorrow, 1);
        tb_List.setModel(tbLst);
        btn_Restore.setEnabled(false);
        btn_Edit.setEnabled(false);
        btn_Delete.setEnabled(false);
        btn_Details.setIcon(ri.ResizeImage("/Image/details.png", null, 25, 25));
        btn_Delete.setIcon(ri.ResizeImage("/Image/delete.png", null, 25, 25));
        btn_Save.setIcon(ri.ResizeImage("/Image/save.png", null, 25, 25));
        btn_Edit.setIcon(ri.ResizeImage("/Image/edit.png", null, 25, 25));
        btn_Restore.setIcon(ri.ResizeImage("/Image/Restore.png", null, 25, 25));
        btn_Reload.setIcon(ri.ResizeImage("/Image/Reload.png", null, 25, 25));
        lb_Ser.setIcon(ri.ResizeImage("/Image/search.png", null, 25, 25));
        setSizeColumn();
    }

    private void addMenu() {
        menu.add(details);
        menu.add(edit);
        menu.add(delete);
        edit.setEnabled(Boolean.FALSE);
        delete.setEnabled(Boolean.FALSE);
        details.addActionListener(this);
        edit.addActionListener(this);
        delete.addActionListener(this);
    }

    private void setSizeColumn() {
        TableColumn tc = tb_Borrow_D.getColumnModel().getColumn(0);
        tc.setCellEditor(tb_Borrow_D.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(tb_Borrow_D.getDefaultRenderer(Boolean.class));
        tc.setHeaderRenderer(new CheckBoxHeader(new MAIN.ItemListener(tb_Borrow_D), String.valueOf("Tất cả")));
        JTableHeader header = (JTableHeader) tb_Borrow_D.getTableHeader();
        header.setBackground(Color.WHITE);
    }

    @Override
    public void tableChanged(TableModelEvent e) {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Borrow = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Borrow_D = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_List = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txf_Ser = new javax.swing.JTextField();
        lb_Ser = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btn_Details = new javax.swing.JButton();
        btn_Save = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Restore = new javax.swing.JButton();
        btn_Reload = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 700));

        pnl_Borrow.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Borrow.setPreferredSize(new java.awt.Dimension(1000, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane2.setBorder(null);

        tb_Borrow_D.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tb_Borrow_D.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_Borrow_D.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tb_Borrow_D.setFillsViewportHeight(true);
        tb_Borrow_D.setRowHeight(50);
        tb_Borrow_D.setShowHorizontalLines(false);
        tb_Borrow_D.setShowVerticalLines(false);
        tb_Borrow_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_Borrow_DMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_Borrow_D);

        jPanel2.add(jScrollPane2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 616));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(248, 614));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane1.setBorder(null);

        tb_List.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tb_List.setFillsViewportHeight(true);
        tb_List.setRowHeight(50);
        tb_List.setShowHorizontalLines(false);
        tb_List.setShowVerticalLines(false);
        tb_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_List);

        jPanel3.add(jScrollPane1);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        txf_Ser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txf_Ser.setForeground(new java.awt.Color(153, 153, 153));
        txf_Ser.setText("Tìm theo tên thiết bị");
        txf_Ser.setBorder(null);
        txf_Ser.setPreferredSize(new java.awt.Dimension(250, 35));
        txf_Ser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txf_SerFocusGained(evt);
            }
        });
        txf_Ser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txf_SerKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_SerKeyReleased(evt);
            }
        });

        lb_Ser.setPreferredSize(new java.awt.Dimension(40, 41));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(txf_Ser, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Ser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lb_Ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txf_Ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
        );

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setPreferredSize(new java.awt.Dimension(1000, 45));

        btn_Details.setText("Chi tiết");
        btn_Details.setToolTipText("Xem thông tin chi tiết");
        btn_Details.setFocusable(false);
        btn_Details.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Details.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Details.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Details.setOpaque(false);
        btn_Details.setPreferredSize(new java.awt.Dimension(27, 45));
        btn_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DetailsActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Details);

        btn_Save.setText("Lưu");
        btn_Save.setToolTipText("Thêm thiết bị mới");
        btn_Save.setFocusable(false);
        btn_Save.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Save.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Save.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Save.setOpaque(false);
        btn_Save.setPreferredSize(new java.awt.Dimension(27, 45));
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Save);

        btn_Edit.setText("Sửa");
        btn_Edit.setToolTipText("");
        btn_Edit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Edit.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Edit.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Edit.setOpaque(false);
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Edit);

        btn_Delete.setText("Xoá");
        btn_Delete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Delete.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Delete.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Delete.setOpaque(false);
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Delete);

        btn_Restore.setText("Khôi phục");
        btn_Restore.setFocusable(false);
        btn_Restore.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Restore.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Restore.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Restore.setOpaque(false);
        btn_Restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RestoreActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Restore);

        btn_Reload.setText("Tải lại");
        btn_Reload.setFocusable(false);
        btn_Reload.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Reload.setMaximumSize(new java.awt.Dimension(80, 45));
        btn_Reload.setMinimumSize(new java.awt.Dimension(80, 45));
        btn_Reload.setOpaque(false);
        btn_Reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReloadActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_Reload);

        javax.swing.GroupLayout pnl_BorrowLayout = new javax.swing.GroupLayout(pnl_Borrow);
        pnl_Borrow.setLayout(pnl_BorrowLayout);
        pnl_BorrowLayout.setHorizontalGroup(
            pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BorrowLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        pnl_BorrowLayout.setVerticalGroup(
            pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BorrowLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_BorrowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_BorrowLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(pnl_BorrowLayout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Borrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Borrow, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tb_Borrow_DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_Borrow_DMouseClicked
        if (SwingUtilities.isRightMouseButton(evt)) {
            menu.show(tb_Borrow_D, evt.getX(), evt.getY());
        }
        if (tv.isSelectedRows(tb_Borrow_D, 0)) {
            btn_Delete.setEnabled(true);
            delete.setEnabled(true);
            edit.setEnabled(true);
            btn_Edit.setEnabled(true);
            btn_Restore.setEnabled(true);
        } else if (!tv.isSelectedRows(tb_Borrow_D, 0) || tb_Borrow_D.getRowCount() == 0) {
            btn_Delete.setEnabled(false);
            btn_Edit.setEnabled(false);
            delete.setEnabled(false);
            edit.setEnabled(false);
            btn_Restore.setEnabled(false);
        }
    }//GEN-LAST:event_tb_Borrow_DMouseClicked

    private void tb_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ListMouseClicked
        int r = tb_List.getSelectedRow();
        String query = tb_List.getValueAt(r, 0).toString().trim();
        tv.filterTool(query, tb_Borrow_D);
        if (query.equalsIgnoreCase("Tất cả")) {
            tv.filterTool("", tb_Borrow_D);
        }
    }//GEN-LAST:event_tb_ListMouseClicked

    private void txf_SerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txf_SerFocusGained
        txf_Ser.setCaretPosition(0);
    }//GEN-LAST:event_txf_SerFocusGained

    private void txf_SerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_SerKeyPressed
        if (txf_Ser.getText().isEmpty()
                || txf_Ser.getText().equalsIgnoreCase("Tìm theo ID mượn")) {
            txf_Ser.setForeground(Color.BLACK);
            txf_Ser.setText("");
        }
    }//GEN-LAST:event_txf_SerKeyPressed

    private void txf_SerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_SerKeyReleased
        String query = txf_Ser.getText().trim();
        tv.filterTool(query, tb_List);
    }//GEN-LAST:event_txf_SerKeyReleased

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) tb_Borrow_D.getModel();
//        ArrayList<Contact> list = new ArrayList<Contact>();
//        for (int i = 0; i < devices.size(); i++) {
//            System.err.println("" + devices.get(i).getDv_ID());
//        }
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DetailsActionPerformed
        try {
            int r = tb_Borrow_D.getSelectedRow();
            Object[] d = TableValue.getValueAt(tb_Borrow_D, r);
            new Details_Borrow_Request(pnl_Borrow, d, r);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Device_Management.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_DetailsActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        try {
            int r = tb_Borrow_D.getSelectedRow();
            Object[] d = TableValue.getValueAt(tb_Borrow_D, r);
            new Details_Borrow_Request(pnl_Borrow, d, r);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Device_Management.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        int cfm = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa đơm mượn này ?", "Xác nhận", JOptionPane.OK_CANCEL_OPTION);
        if (cfm == JOptionPane.OK_OPTION) {
            int r = tb_Borrow_D.getSelectedRow();
            tbBorrow.removeRow(r);
            tv.deleteRows(tb_Borrow_D, r);
            btn_Restore.setEnabled(true);
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_RestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RestoreActionPerformed
        tbBorrow = cn.getDevice();
        tb_Borrow_D.setModel(tbBorrow);
        setSizeColumn();
        btn_Restore.setEnabled(false);
    }//GEN-LAST:event_btn_RestoreActionPerformed

    private void btn_ReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReloadActionPerformed
        tbBorrow = cn.getBorrow();
        tb_Borrow_D.setModel(tbBorrow);
        tbLst = tv.listModel(tbBorrow, 1);
        tb_List.setModel(tbLst);
    }//GEN-LAST:event_btn_ReloadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Details;
    private javax.swing.JButton btn_Edit;
    public static javax.swing.JButton btn_Reload;
    private javax.swing.JButton btn_Restore;
    private javax.swing.JButton btn_Save;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_Ser;
    private javax.swing.JPanel pnl_Borrow;
    public static javax.swing.JTable tb_Borrow_D;
    private javax.swing.JTable tb_List;
    private javax.swing.JTextField txf_Ser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o == details) {
            btn_Details.doClick();
        }
        if (o == edit) {
            btn_Edit.doClick();
        }
        if (o == delete) {
            btn_Delete.doClick();
        }
    }

}

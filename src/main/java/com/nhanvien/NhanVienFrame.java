/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nhanvien;

import com.home.HomeFrame;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jacker
 */
public class NhanVienFrame extends javax.swing.JFrame {

    /**
     * Creates new form NhanVienFrame
     */
    public NhanVienFrame() {
        initComponents();
        loadTable();
    }
    
    public void loadAllDataIntoTable(List<NhanVienBeans> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for(NhanVienBeans bean : list) {
            Vector v = new Vector();
            v.add(bean.getIdnhanvien());
            v.add(bean.getFullName());
            v.add(bean.getChucVu());
            v.add(bean.getMucLuong());
            v.add(bean.getSDT());
            v.add(bean.getDiaChi());
            
            
            dtm.addRow(v);
        
        }
        
    
    }
    
    public void loadTable(){
        NhanVienBal bal = new NhanVienBal();
        List list = bal.loadData();
        loadAllDataIntoTable(list);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonQuayLai = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonCapNhat = new javax.swing.JButton();
        jTextFieldChucVu = new javax.swing.JTextField();
        jTextFieldFullName = new javax.swing.JTextField();
        jButtonXoaDon = new javax.swing.JButton();
        jTextFieldMucLuong = new javax.swing.JTextField();
        jTextFieldSDT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDiaChi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonCapNhat1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ NHẬP XUẤT QUẦN ÁO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 650, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1070, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điền thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 153, 153))); // NOI18N

        jButtonQuayLai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonQuayLai.setForeground(new java.awt.Color(0, 204, 204));
        jButtonQuayLai.setText("Quay lại");
        jButtonQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuayLaiActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Địa chỉ");

        jButtonCapNhat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCapNhat.setForeground(new java.awt.Color(0, 204, 204));
        jButtonCapNhat.setText("Cập nhật");
        jButtonCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCapNhatActionPerformed(evt);
            }
        });

        jTextFieldChucVu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldChucVuActionPerformed(evt);
            }
        });

        jTextFieldFullName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFullNameActionPerformed(evt);
            }
        });

        jButtonXoaDon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonXoaDon.setForeground(new java.awt.Color(0, 204, 204));
        jButtonXoaDon.setText("Xóa ");
        jButtonXoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaDonActionPerformed(evt);
            }
        });

        jTextFieldMucLuong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldMucLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMucLuongActionPerformed(evt);
            }
        });

        jTextFieldSDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSDTActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Chức vụ");

        jTextFieldDiaChi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiaChiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Tên nhân viên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("SDT");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Mức lương");

        jButtonCapNhat1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCapNhat1.setForeground(new java.awt.Color(0, 204, 204));
        jButtonCapNhat1.setText("Thêm ");
        jButtonCapNhat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCapNhat1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMucLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonQuayLai, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jButtonXoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCapNhat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldMucLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCapNhat)
                    .addComponent(jButtonXoaDon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonQuayLai)
                    .addComponent(jButtonCapNhat1))
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 450, 430));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Chức vụ", "Mức lương", "Số điện thoại", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 590, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuayLaiActionPerformed
        // TODO add your handling code here:
        HomeFrame home = new HomeFrame();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonQuayLaiActionPerformed
    int id = 0;
    private void jButtonCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCapNhatActionPerformed
        // TODO add your handling code here:
        try {
            String FullName = jTextFieldFullName.getText().trim();
            String ChucVu = jTextFieldChucVu.getText().trim();
            String MucLuongStr = jTextFieldMucLuong.getText().trim();
            String SDT = jTextFieldSDT.getText().trim();
            String DiaChi = jTextFieldDiaChi.getText().trim();

            // Kiểm tra không để trống
            if (FullName.isEmpty() || ChucVu.isEmpty() || MucLuongStr.isEmpty() || SDT.isEmpty() || DiaChi.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ tất cả các trường.", "Thiếu thông tin", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // FullName và ChucVu phải là chữ
            if (!FullName.matches("[\\p{L} ]+")) {
                JOptionPane.showMessageDialog(this, "Họ và tên chỉ được chứa chữ cái.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!ChucVu.matches("[\\p{L} ]+")) {
                JOptionPane.showMessageDialog(this, "Chức vụ chỉ được chứa chữ cái.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Mức lương phải là số hợp lệ
            float MucLuong;
            try {
                MucLuong = Float.parseFloat(MucLuongStr);
                if (MucLuong<0) {
                JOptionPane.showMessageDialog(this, "Mức lương cần lớn hơn 0", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Mức lương phải là số hợp lệ.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // SDT phải là số và đúng 10 chữ số
            if (!SDT.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(this, "Số điện thoại phải gồm đúng 10 chữ số.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // DiaChi chỉ được chứa chữ, số, khoảng trắng và một số dấu cơ bản
            if (!DiaChi.matches("[\\p{L}\\d\\s,.-/]+")) {
                JOptionPane.showMessageDialog(this, "Địa chỉ không được chứa ký tự đặc biệt.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Nếu mọi thứ hợp lệ thì cập nhật
            NhanVienBeans bean = new NhanVienBeans(id, FullName, ChucVu, MucLuong, SDT, DiaChi);
            NhanVienBal bal = new NhanVienBal();
            bal.updateData(bean);
            loadTable();
            JOptionPane.showMessageDialog(this, "Cập nhật nhân viên thành công!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + ex.getMessage(), "Lỗi hệ thống", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonCapNhatActionPerformed

    private void jTextFieldChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldChucVuActionPerformed

    private void jTextFieldFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFullNameActionPerformed

    private void jButtonXoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaDonActionPerformed
        // TODO add your handling code here:
        NhanVienBal bal = new NhanVienBal();
        bal.deleteData(id);
        loadTable();
    }//GEN-LAST:event_jButtonXoaDonActionPerformed

    private void jTextFieldMucLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMucLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMucLuongActionPerformed

    private void jTextFieldSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSDTActionPerformed

    private void jTextFieldDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiaChiActionPerformed

    private void jButtonCapNhat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCapNhat1ActionPerformed
        // TODO add your handling code here:
        try {
            String FullName = jTextFieldFullName.getText().trim();
            String ChucVu = jTextFieldChucVu.getText().trim();
            String MucLuongStr = jTextFieldMucLuong.getText().trim();
            String SDT = jTextFieldSDT.getText().trim();
            String DiaChi = jTextFieldDiaChi.getText().trim();
            
            // Kiểm tra rỗng
            if (FullName.isEmpty() || ChucVu.isEmpty() || MucLuongStr.isEmpty() || SDT.isEmpty() || DiaChi.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ tất cả các trường.", "Thiếu thông tin", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra tên và chức vụ chỉ được chứa chữ cái
            if (!FullName.matches("[\\p{L} ]+")) {
                JOptionPane.showMessageDialog(this, "Họ và tên chỉ được chứa chữ cái.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!ChucVu.matches("[\\p{L} ]+")) {
                JOptionPane.showMessageDialog(this, "Chức vụ chỉ được chứa chữ cái.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra mức lương là số
            float MucLuong;
            try {
                MucLuong = Float.parseFloat(MucLuongStr);
                if (MucLuong<0) {
                JOptionPane.showMessageDialog(this, "Mức Lương cần lớn hơn 0", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Mức lương phải là số hợp lệ.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra số điện thoại là số và có độ dài hợp lý (10 chữ số)
            if (!SDT.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(this, "Số điện thoại phải gồm đúng 10 chữ số.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Kiểm tra địa chỉ không chứa ký tự đặc biệt nguy hiểm (nới lỏng hơn)
            if (!DiaChi.matches("[\\p{L}\\d\\s,.-/]+")) {
                JOptionPane.showMessageDialog(this, "Địa chỉ không được chứa ký tự đặc biệt.", "Lỗi định dạng", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Nếu hợp lệ, thực hiện insert
            NhanVienBeans nhapBean = new NhanVienBeans(0, FullName, ChucVu, MucLuong, SDT, DiaChi);
            NhanVienBal nhapObj = new NhanVienBal();
            nhapObj.insert(nhapBean);
            loadTable();
//            JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + ex.getMessage(), "Lỗi hệ thống", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCapNhat1ActionPerformed
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if (row<0) {
            JOptionPane.showMessageDialog(null, "Chọn cột có dữ liệu");
            
        }else{
            id = (int) jTable1.getValueAt(row, 0);
            NhanVienBal bal= new NhanVienBal();
            NhanVienBeans bean = bal.returnAllDataToTextFields(id);
            jTextFieldFullName.setText(bean.getFullName());
            jTextFieldChucVu.setText(bean.getChucVu());
            jTextFieldMucLuong.setText(""+bean.getMucLuong());
            jTextFieldSDT.setText(bean.getSDT());
            jTextFieldDiaChi.setText(bean.getDiaChi());
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCapNhat;
    private javax.swing.JButton jButtonCapNhat1;
    private javax.swing.JButton jButtonQuayLai;
    private javax.swing.JButton jButtonXoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldChucVu;
    private javax.swing.JTextField jTextFieldDiaChi;
    private javax.swing.JTextField jTextFieldFullName;
    private javax.swing.JTextField jTextFieldMucLuong;
    private javax.swing.JTextField jTextFieldSDT;
    // End of variables declaration//GEN-END:variables
}

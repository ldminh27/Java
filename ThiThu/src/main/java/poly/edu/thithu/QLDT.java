/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.edu.thithu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LeMinh
 */
public class QLDT extends javax.swing.JFrame implements Runnable {

    private List<DienThoai> list = new ArrayList<>();
    DefaultTableModel tblModel;
    private List<DienThoai> listDienThoai;
//    int index = -1;

    /**
     * Creates new form QLDT
     */
    public QLDT() {
        initComponents();
        setLocationRelativeTo(null);
        initHang();
        FakeData();
    }

    public void initHang() {
        String[] brand = new String[]{"Samsung", "Xiaomi", "iPhone"};
        DefaultComboBoxModel<String> boxModel = new DefaultComboBoxModel<>(brand);
        cboHang.setModel(boxModel);
    }

    void FakeData() {
        list.add(new DienThoai("8 Plus", "iPhone", "", 1000));
        list.add(new DienThoai("Note 22", "Samsung", "", 900));
        list.add(new DienThoai("13 Pro Max", "iPhone", "", 3000));
        list.add(new DienThoai("Redmi Note 5", "Xiaomi", "", 2000));
    }

    public void initTable() {
        tblModel = (DefaultTableModel) tblDienThoai.getModel();
        String[] cols = new String[]{"Tên sản phẩm", "Hãng", "Giá", "Trạng thái"};
        tblModel.setColumnIdentifiers(cols);
    }

    public void fillToTable() {
        tblModel.setRowCount(0);
        for (DienThoai dt : list) {
            Object[] row = new Object[]{dt.getTenSP(), dt.getHang(), dt.getGiaSP(), dt.getTrangThai()};
            tblModel.addRow(row);
        }
    }

    public void showDelite() {
        int index = tblDienThoai.getSelectedRow();
        txtTen.setText(list.get(index).getTenSP());
        cboHang.setSelectedItem(list.get(index).getHang());
        txtGia.setText(String.valueOf(list.get(index).getGiaSP()));

    }

    public boolean validateFrom() {
        if (txtTen.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên");
            return false;
        }

        if (txtGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập giá");
            return false;
        }
        try {
            Integer.parseInt(txtGia.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Giá phải là số");
            return false;
        }
        return true;
    }

    public void addPhone() {
        if (validateFrom()) {
            int index = tblDienThoai.getSelectedRow();
            DienThoai dt = new DienThoai();
            dt.setTenSP(txtTen.getText());
            dt.setHang((String) cboHang.getSelectedItem());
            dt.setGiaSP(Double.parseDouble(txtGia.getText()));
            dt.setTrangThai("Đang hoạt động");
//            if (rdoMale.isSelected()) {
//                newPerson.setGender("Nam");
//            } else {
//                newPerson.setGender("Nu");
//            }
            list.add(dt);
            fillToTable();
            JOptionPane.showMessageDialog(this, "Đã thêm");
        }
    }

    public void GhiFile() {
        try {
            // TODO add your handling code here:
            FileOutputStream fos = new FileOutputStream("D:/ListDienThoai.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(list);
            fos.close();
            oos.close();
            JOptionPane.showMessageDialog(this, "Ghi dữ liệu thành công");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QLDT.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Không tìm thấy");

        } catch (IOException ex) {
            Logger.getLogger(QLDT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void MoFile() {
        try {
            // TODO add your handling code here:
            FileInputStream fis = new FileInputStream("D:/ListDienThoai.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<DienThoai>) ois.readObject();
            fillToTable();
            JOptionPane.showMessageDialog(this, "Đọc thành công");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QLDT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(QLDT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLDT.class.getName()).log(Level.SEVERE, null, ex);
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

        txtTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        cboHang = new javax.swing.JComboBox<>();
        txtGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnMo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDienThoai = new javax.swing.JTable();
        lblTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtTitle.setText("QUẢN LÝ ĐIỆN THOẠI");

        jLabel2.setText("Tên sản phẩm");

        jLabel3.setText("Hãng");

        jLabel4.setText("Giá");

        cboHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnMo.setText("Mở");
        btnMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoActionPerformed(evt);
            }
        });

        tblDienThoai.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDienThoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDienThoaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDienThoai);

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 51));
        lblTime.setText("00:00 AM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTen)
                                .addComponent(cboHang, 0, 174, Short.MAX_VALUE))
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMo)
                            .addComponent(btnThem)
                            .addComponent(btnGhi))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(txtTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(lblTime)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle)
                    .addComponent(lblTime))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGhi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMo))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDienThoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDienThoaiMouseClicked
        // TODO add your handling code here:
        showDelite();
    }//GEN-LAST:event_tblDienThoaiMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // ---------------------------------------------------
        ClockThread clockThread = new ClockThread(lblTime);
        Thread t1 = new Thread(clockThread);
        t1.start();
        //----------------------------------------------------
        initHang();
        initTable();
        fillToTable();
    }//GEN-LAST:event_formWindowOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        addPhone();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        GhiFile();
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoActionPerformed
        MoFile();
    }//GEN-LAST:event_btnMoActionPerformed

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
            java.util.logging.Logger.getLogger(QLDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDT().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnMo;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cboHang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tblDienThoai;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtTen;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        String title = txtTitle.getText();
        while (true) {
            String firstCh = title.substring(0, 1);
            title = title.substring(1).concat(firstCh);
            txtTitle.setText(title);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }
}

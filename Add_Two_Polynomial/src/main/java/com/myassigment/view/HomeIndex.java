package com.myassigment.view;

import com.myassigment.add_two_polynomial.ChucNang;

public class HomeIndex extends javax.swing.JFrame {

    public HomeIndex() {
        initComponents();
        lbDaThuc3.setVisible(false);
        txtDaThuc3.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbDaThuc1 = new javax.swing.JLabel();
        txtDaThuc1 = new javax.swing.JTextField();
        txtDaThuc2 = new javax.swing.JTextField();
        lbDaThuc2 = new javax.swing.JLabel();
        lbDaThuc3 = new javax.swing.JLabel();
        txtDaThuc3 = new javax.swing.JTextField();
        btnSub = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnLichSuTinh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setEnabled(false);

        lbDaThuc1.setText("Đa Thức 1: ");

        lbDaThuc2.setText("Đa Thức 2: ");

        lbDaThuc3.setText("Kết quả: ");
        lbDaThuc3.setEnabled(false);

        txtDaThuc3.setEnabled(false);

        btnSub.setText("subtract");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.setName("btnAdd"); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDaThuc1)
                    .addComponent(lbDaThuc2)
                    .addComponent(lbDaThuc3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtDaThuc1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDaThuc2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDaThuc3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSub)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDaThuc1)
                    .addComponent(txtDaThuc1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDaThuc2)
                    .addComponent(txtDaThuc2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDaThuc3)
                    .addComponent(txtDaThuc3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSub)
                    .addComponent(btnAdd)))
        );

        btnLichSuTinh.setText("History");
        btnLichSuTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichSuTinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnLichSuTinh)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLichSuTinh)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        lbDaThuc3.setVisible(true);
        txtDaThuc3.setVisible(true);

        ChucNang cn = new ChucNang();
        cn.nhapDaThucNhieuAn(txtDaThuc1.getText(), txtDaThuc2.getText());

        txtDaThuc3.setText(cn.showTong2DaThuc());


    }//GEN-LAST:event_btnAddActionPerformed

    private void btnLichSuTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichSuTinhActionPerformed
        LichSu ls = new LichSu();
        ls.setVisible(true);
    }//GEN-LAST:event_btnLichSuTinhActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        lbDaThuc3.setVisible(true);
        txtDaThuc3.setVisible(true);

        ChucNang cn = new ChucNang();

        cn.nhapDaThucNhieuAn(txtDaThuc1.getText(), txtDaThuc2.getText());
        

        txtDaThuc3.setText(cn.showHieu2DaThuc());
    }//GEN-LAST:event_btnSubActionPerformed

    public static void main(String args[]) {

    }

    public void showForm() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnLichSuTinh;
    private javax.swing.JButton btnSub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDaThuc1;
    private javax.swing.JLabel lbDaThuc2;
    private javax.swing.JLabel lbDaThuc3;
    private javax.swing.JTextField txtDaThuc1;
    private javax.swing.JTextField txtDaThuc2;
    private javax.swing.JTextField txtDaThuc3;
    // End of variables declaration//GEN-END:variables
}

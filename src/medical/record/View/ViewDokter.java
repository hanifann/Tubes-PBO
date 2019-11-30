/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record.View;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import medical.record.Controller.Conf;
import medical.record.Controller.Service;
import medical.record.Model.Dokter;

/**
 *
 * @author Acer
 */
public class ViewDokter extends javax.swing.JFrame {

    /**
     * Creates new form ViewDOkter
     */
    
    Service fc = new Service();
    String nama = "";
    
    public ViewDokter() {
        initComponents();
        tblDokter.setModel(fc.getModelDokter());
        fc.setTableDokter();
        fc.loadDokter();
        fc.readDokter();
    }

    ViewDokter(String nama) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.nama = nama;
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
        btnCari = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDokter = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Rekam Medis RS Medika");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1440, 1024));
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setLayout(null);

        btnCari.setBackground(new java.awt.Color(16, 120, 123));
        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Cari.png"))); // NOI18N
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        btnCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCariKeyPressed(evt);
            }
        });
        jPanel1.add(btnCari);
        btnCari.setBounds(990, 290, 267, 50);

        jPanel2.setBackground(new java.awt.Color(42, 147, 151));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/arrow-back.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Dokter.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 58, 547, 112);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 27.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1005, 58, 370, 110);

        tfCari.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tfCari.setText("cari id dokter..");
        tfCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCariActionPerformed(evt);
            }
        });
        jPanel1.add(tfCari);
        tfCari.setBounds(170, 290, 750, 50);

        tblDokter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblDokter.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tblDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIP", "Nama", "Spesialis", "Poliklinik", "Tanggal Mulai Kerja", "No Telepon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDokter.setAlignmentX(1.0F);
        tblDokter.setAlignmentY(1.0F);
        tblDokter.setRowHeight(30);
        tblDokter.setRowMargin(2);
        tblDokter.setSelectionBackground(new java.awt.Color(43, 193, 199));
        tblDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDokter);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(167, 390, 1090, 472);

        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 41.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 830, 127, 186);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 42.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1020, 780, 420, 210);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1440, 1024);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        ViewDashboard menu = new ViewDashboard(nama);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void cari(){
        try {
            int keword = Integer.parseInt(tfCari.getText());
            fc.CariDokter(keword); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "isian harus berupa angka");
        } 
    }
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_btnCariActionPerformed

    private void tfCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCariActionPerformed

    private void tblDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDokterMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "test");
    }//GEN-LAST:event_tblDokterMouseClicked

    private void btnCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCariKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cari();
        }
    }//GEN-LAST:event_btnCariKeyPressed

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
            java.util.logging.Logger.getLogger(ViewDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnCari;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDokter;
    private javax.swing.JTextField tfCari;
    // End of variables declaration//GEN-END:variables
}

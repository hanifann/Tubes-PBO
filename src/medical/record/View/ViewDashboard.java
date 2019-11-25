/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.record.View;

import javax.swing.JOptionPane;
import medical.record.Controller.Auth;
import medical.record.Controller.FunctionControl;
import medical.record.Model.Karyawan;

/**
 *
 * @author Acer
 */
public class ViewDashboard extends javax.swing.JFrame {

    /**
     * Creates new form ViewDashboard
     */
    
    Auth auth = new Auth();
    
    public ViewDashboard(Auth auth) {
        initComponents();
        this.setLocationRelativeTo(null);        
        this.auth = auth;
    }
    
    public ViewDashboard(Karyawan auth){
        initComponents();
        this.setLocationRelativeTo(null);
        this.auth = auth;
    }

    public ViewDashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnDokter = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        btnPoliklinik = new javax.swing.JLabel();
        btnRekamMedis = new javax.swing.JLabel();
        btnPasien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Rekam Medis RS Medika");
        setMaximumSize(new java.awt.Dimension(1440, 1024));
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMaximumSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 55.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, 0, 610, 340);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 41.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 820, 140, 190);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 42.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1030, 780, 420, 210);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Dr David");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(640, 240, 150, 50);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Selamat Datang");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(630, 190, 173, 50);

        btnDokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 26.png"))); // NOI18N
        btnDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDokterMouseClicked(evt);
            }
        });
        jPanel1.add(btnDokter);
        btnDokter.setBounds(200, 670, 481, 250);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 57.png"))); // NOI18N
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(1180, 40, 220, 90);

        btnPoliklinik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 25.png"))); // NOI18N
        btnPoliklinik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPoliklinikMouseClicked(evt);
            }
        });
        jPanel1.add(btnPoliklinik);
        btnPoliklinik.setBounds(760, 670, 481, 250);

        btnRekamMedis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 18.png"))); // NOI18N
        btnRekamMedis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRekamMedisMouseClicked(evt);
            }
        });
        jPanel1.add(btnRekamMedis);
        btnRekamMedis.setBounds(200, 380, 482, 250);

        btnPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/record/assets/rekam-medik-asset/Group 24.png"))); // NOI18N
        btnPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPasienMouseClicked(evt);
            }
        });
        jPanel1.add(btnPasien);
        btnPasien.setBounds(760, 380, 481, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1452, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
         ViewLogin menu = new ViewLogin();
         menu.setVisible(true);
         menu.setLocationRelativeTo(null);
         dispose();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnRekamMedisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRekamMedisMouseClicked
        // TODO add your handling code here:
         ViewRekamMedis menu = new ViewRekamMedis();
         menu.setVisible(true);
         menu.setLocationRelativeTo(null);
         dispose();
    }//GEN-LAST:event_btnRekamMedisMouseClicked

    private void btnPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPasienMouseClicked
        // TODO add your handling code here:
         ViewPasien menu = new ViewPasien();
         menu.setVisible(true);
         menu.setLocationRelativeTo(null);
         dispose();
    }//GEN-LAST:event_btnPasienMouseClicked

    private void btnDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDokterMouseClicked
        // TODO add your handling code here:
         ViewDokter menu = new ViewDokter();
         menu.setVisible(true);
         menu.setLocationRelativeTo(null);
         dispose();
    }//GEN-LAST:event_btnDokterMouseClicked

    private void btnPoliklinikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPoliklinikMouseClicked
        // TODO add your handling code here:
         ViewPoliklinik menu = new ViewPoliklinik();
         menu.setVisible(true);
         menu.setLocationRelativeTo(null);
         dispose();
    }//GEN-LAST:event_btnPoliklinikMouseClicked

    
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
            java.util.logging.Logger.getLogger(ViewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDokter;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnPasien;
    private javax.swing.JLabel btnPoliklinik;
    private javax.swing.JLabel btnRekamMedis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

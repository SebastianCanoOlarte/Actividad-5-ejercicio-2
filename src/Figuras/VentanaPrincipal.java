/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Figuras;

/**
 *
 * @author Knoknozo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonCilindro = new javax.swing.JButton();
        BotonEsfera = new javax.swing.JButton();
        BotonPiramide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Figuras");

        BotonCilindro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonCilindro.setText("Cilindro");
        BotonCilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCilindroActionPerformed(evt);
            }
        });

        BotonEsfera.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonEsfera.setText("Esfera");
        BotonEsfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEsferaActionPerformed(evt);
            }
        });

        BotonPiramide.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonPiramide.setText("Piramide");
        BotonPiramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPiramideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(BotonCilindro)
                .addGap(63, 63, 63)
                .addComponent(BotonEsfera)
                .addGap(61, 61, 61)
                .addComponent(BotonPiramide)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCilindro)
                    .addComponent(BotonEsfera)
                    .addComponent(BotonPiramide))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCilindroActionPerformed
        // TODO add your handling code here:
        VentanaCilindro Cilindro = new VentanaCilindro();
        Cilindro.setVisible(true);
        Cilindro.setResizable(false);
    }//GEN-LAST:event_BotonCilindroActionPerformed

    private void BotonEsferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEsferaActionPerformed
        // TODO add your handling code here:
        VentanaEsfera Esfera = new VentanaEsfera();
        Esfera.setVisible(true);
        Esfera.setResizable(false);
    }//GEN-LAST:event_BotonEsferaActionPerformed

    private void BotonPiramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPiramideActionPerformed
        // TODO add your handling code here:
        VentanaPiramide Piramide = new VentanaPiramide();
        Piramide.setVisible(true);
        Piramide.setResizable(false);
    }//GEN-LAST:event_BotonPiramideActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCilindro;
    private javax.swing.JButton BotonEsfera;
    private javax.swing.JButton BotonPiramide;
    // End of variables declaration//GEN-END:variables
}

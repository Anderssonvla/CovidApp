/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

/**
 *
 * @author Anderson
 */
public class landingPage extends javax.swing.JFrame {

    /**
     * Creates new form landingPage
     */
    public landingPage() {
        initComponents();
        setLocationRelativeTo(null);
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
        landingLogo = new javax.swing.JLabel();
        textoPrincipal = new javax.swing.JLabel();
        addPaciente = new javax.swing.JButton();
        addHospital = new javax.swing.JButton();
        viewReport = new javax.swing.JButton();
        updatePatience = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        welcomeMessage1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CovidApp - Menú Principal - Usuario");
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        landingLogo.setForeground(new java.awt.Color(153, 0, 255));
        landingLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        textoPrincipal.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        textoPrincipal.setForeground(new java.awt.Color(204, 0, 0));
        textoPrincipal.setText("¿Qué quieres hacer?");

        addPaciente.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        addPaciente.setForeground(new java.awt.Color(204, 0, 0));
        addPaciente.setText("Registrar nuevo paciente");
        addPaciente.setBorderPainted(false);
        addPaciente.setFocusPainted(false);

        addHospital.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        addHospital.setForeground(new java.awt.Color(204, 0, 0));
        addHospital.setText("Registrar nuevo hospital");
        addHospital.setBorderPainted(false);
        addHospital.setFocusPainted(false);

        viewReport.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        viewReport.setForeground(new java.awt.Color(204, 0, 0));
        viewReport.setText("Ver reporte");
        viewReport.setBorderPainted(false);
        viewReport.setFocusPainted(false);

        updatePatience.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        updatePatience.setForeground(new java.awt.Color(204, 0, 0));
        updatePatience.setText("Actualizar pacientes");
        updatePatience.setBorderPainted(false);
        updatePatience.setFocusable(false);

        logout.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(204, 0, 0));
        logout.setText("Salir");
        logout.setBorderPainted(false);
        logout.setFocusPainted(false);

        welcomeMessage1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        welcomeMessage1.setForeground(new java.awt.Color(204, 0, 0));
        welcomeMessage1.setText("Bienvenido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(landingLogo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(welcomeMessage1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(textoPrincipal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(addPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updatePatience, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(viewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addHospital)))
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(landingLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeMessage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoPrincipal)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPaciente)
                    .addComponent(updatePatience)
                    .addComponent(viewReport)
                    .addComponent(addHospital))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(landingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new landingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHospital;
    private javax.swing.JButton addPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel landingLogo;
    private javax.swing.JButton logout;
    private javax.swing.JLabel textoPrincipal;
    private javax.swing.JButton updatePatience;
    private javax.swing.JButton viewReport;
    private javax.swing.JLabel welcomeMessage1;
    // End of variables declaration//GEN-END:variables
}

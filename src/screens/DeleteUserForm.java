/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

/**
 *
 * @author Ezequiel
 */
public class DeleteUserForm extends javax.swing.JFrame {

    /**
     * Creates new form AddUserForm
     */
    public DeleteUserForm() {
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

        jLabel1 = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        RoleLabel = new javax.swing.JLabel();
        RolDropdown = new java.awt.Choice();
        FirstNameLabel = new javax.swing.JLabel();
        FirstLastNameLabel = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        FirstLastName = new javax.swing.JTextField();
        UserNameLabel = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        DeleteButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CovidApp - Eliminar  usuario");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        TitleLabel.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(204, 0, 0));
        TitleLabel.setText("Eliminar Usuario                             ");

        RoleLabel.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        RoleLabel.setForeground(new java.awt.Color(204, 0, 0));
        RoleLabel.setText("Rol");

        FirstNameLabel.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        FirstNameLabel.setForeground(new java.awt.Color(204, 0, 0));
        FirstNameLabel.setText("Primer nombre");

        FirstLastNameLabel.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        FirstLastNameLabel.setForeground(new java.awt.Color(204, 0, 0));
        FirstLastNameLabel.setText("Primer apellido");

        UserNameLabel.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        UserNameLabel.setForeground(new java.awt.Color(204, 0, 0));
        UserNameLabel.setText("Nombre de usuario");

        PasswordLabel.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(204, 0, 0));
        PasswordLabel.setText("Contraseña");

        DeleteButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(204, 0, 0));
        DeleteButton.setText("Eliminar");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(204, 0, 0));
        CancelButton.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserName)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(UserNameLabel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FirstLastNameLabel)
                            .addComponent(FirstNameLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RoleLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RolDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FirstName)
                            .addComponent(FirstLastName)))
                    .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RolDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FirstNameLabel)
                .addGap(5, 5, 5)
                .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstLastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DeleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelButton)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField FirstLastName;
    private javax.swing.JLabel FirstLastNameLabel;
    private javax.swing.JTextField FirstName;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PasswordLabel;
    private java.awt.Choice RolDropdown;
    private javax.swing.JLabel RoleLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

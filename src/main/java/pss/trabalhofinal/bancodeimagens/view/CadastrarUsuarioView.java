package pss.trabalhofinal.bancodeimagens.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CadastrarUsuarioView extends javax.swing.JInternalFrame {

    public CadastrarUsuarioView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        checkAdministrador = new javax.swing.JCheckBox();
        btnRegister = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        checkShowPassword = new javax.swing.JCheckBox();
        txtPassword = new javax.swing.JPasswordField();
        btnExcluir = new javax.swing.JButton();

        setTitle("Cadastrar Usuário");

        jLabel1.setText("E-mail");

        jLabel2.setText("Nome de Usuário");

        lblPassword.setText("Senha");

        checkAdministrador.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        checkAdministrador.setText("Administrador");

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegister.setText("Cadastrar");

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClose.setText("Cancelar");

        jLabel4.setText("Nome Completo:");

        checkShowPassword.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        checkShowPassword.setText("Mostrar Senha");

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setText("Excluir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegister)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(checkAdministrador)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(checkShowPassword))
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAdministrador)
                    .addComponent(checkShowPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnExcluir)
                    .addComponent(btnRegister))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox checkAdministrador;
    private javax.swing.JCheckBox checkShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnClose() {
        return btnClose;
    }

    public JButton getBtnRegister() {
        return btnRegister;
    }

    public JCheckBox getCheckAdministrador() {
        return checkAdministrador;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public JCheckBox getCheckShowPassword() {
        return checkShowPassword;
    }

    public JLabel getLblPassword() {
        return lblPassword;
    }

    public JButton getBtnExcluir() {
        return btnExcluir;
    }

}

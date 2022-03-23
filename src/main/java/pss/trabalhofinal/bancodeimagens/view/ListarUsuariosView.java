package pss.trabalhofinal.bancodeimagens.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ListarUsuariosView extends javax.swing.JInternalFrame {

    public ListarUsuariosView() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnRemoveUser = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearchUser = new javax.swing.JButton();
        boxSearchFor = new javax.swing.JComboBox<>();
        btnPermissoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Listar Usuários");

        tblUsuarios.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createCompoundBorder()));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        btnRemoveUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemoveUser.setText("Remover");

        btnView.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnView.setText("Visualizar");

        btnAddUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddUser.setText("Novo");

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClose.setText("Voltar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        txtSearch.setToolTipText("Busca por id, nome, usuário ou email");

        btnSearchUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSearchUser.setText("Buscar Usuário");

        boxSearchFor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nome", "Nome de Usuário" }));

        btnPermissoes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPermissoes.setText("Permissões");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPermissoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddUser)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(boxSearchFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchUser)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchUser)
                    .addComponent(boxSearchFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddUser)
                    .addComponent(btnPermissoes)
                    .addComponent(btnView)
                    .addComponent(btnRemoveUser)
                    .addComponent(btnClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSearchFor;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPermissoes;
    private javax.swing.JButton btnRemoveUser;
    private javax.swing.JButton btnSearchUser;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAddUser() {
        return btnAddUser;
    }

    public JButton getBtnClose() {
        return btnClose;
    }

    public JButton getBtnRemoveUser() {
        return btnRemoveUser;
    }

    public JButton getBtnSearchUser() {
        return btnSearchUser;
    }

    public JTable getTblUsuarios() {
        return tblUsuarios;
    }

    public JTextField getTxtSearch() {
        return txtSearch;
    }

    public JButton getBtnView() {
        return btnView;
    }

    public JButton getBtnPermissoes() {
        return btnPermissoes;
    }

    public JComboBox<String> getBoxSearchFor() {
        return boxSearchFor;
    }

}

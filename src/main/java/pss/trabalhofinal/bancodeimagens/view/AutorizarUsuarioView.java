
package pss.trabalhofinal.bancodeimagens.view;

import javax.swing.JButton;
import javax.swing.JTable;

public class AutorizarUsuarioView extends javax.swing.JInternalFrame {

    public AutorizarUsuarioView() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btnAuthorize = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Autorizar Usuário");

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblUsers);

        btnAuthorize.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAuthorize.setText("Permitir");

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClose.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addGap(18, 18, 18)
                        .addComponent(btnAuthorize)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAuthorize)
                    .addComponent(btnClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuthorize;
    private javax.swing.JButton btnClose;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsers;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAuthorize() {
        return btnAuthorize;
    }

    public JButton getBtnClose() {
        return btnClose;
    }

    public JTable getTblUsers() {
        return tblUsers;
    }
}

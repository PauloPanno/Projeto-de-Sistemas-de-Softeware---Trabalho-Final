package pss.trabalhofinal.bancodeimagens.view;

import javax.swing.JButton;
import javax.swing.JTable;

public class ExclusoesView extends javax.swing.JInternalFrame {

    public ExclusoesView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblExclusoes = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();

        setTitle("Exclusão de View");

        tblExclusoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblExclusoes);

        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFechar.setText("Voltar");

        btnRestaurar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRestaurar.setText("Restaurar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRestaurar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestaurar)
                    .addComponent(btnFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnFechar() {
        return btnFechar;
    }

    public JButton getBtnRestaurar() {
        return btnRestaurar;
    }

    public JTable getTblExclusoes() {
        return tblExclusoes;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblExclusoes;
    // End of variables declaration//GEN-END:variables
}

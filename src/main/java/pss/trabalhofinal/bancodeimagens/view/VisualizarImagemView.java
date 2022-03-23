package pss.trabalhofinal.bancodeimagens.view;

import javax.swing.JButton;
import javax.swing.JLabel;

public class VisualizarImagemView extends javax.swing.JInternalFrame {

    public VisualizarImagemView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFiltros1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblImagem = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCompartilhar = new javax.swing.JButton();
        btnVisualizarHistorico = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        lblFiltros2 = new javax.swing.JLabel();

        lblFiltros1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblFiltros1.setText("Filtros");

        setTitle("Visualizar Imagens");

        jScrollPane1.setViewportView(lblImagem);

        btnFechar.setText("Voltar");

        btnExcluir.setText("Excluir");

        btnEditar.setText("Editar");

        btnCompartilhar.setText("Compartilhar");
        btnCompartilhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompartilharActionPerformed(evt);
            }
        });

        btnVisualizarHistorico.setText("Visualizar Histórico");

        btnExportar.setText("Exportar");

        lblFiltros2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblFiltros2.setText("Opções:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnFechar)
                    .addComponent(btnExcluir)
                    .addComponent(btnExportar)
                    .addComponent(btnVisualizarHistorico)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblFiltros2))
                    .addComponent(btnCompartilhar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFiltros2)
                        .addGap(12, 12, 12)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnExportar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCompartilhar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVisualizarHistorico)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompartilharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompartilharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCompartilharActionPerformed

    public JButton getBtnCompartilhar() {
        return btnCompartilhar;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public JButton getBtnExcluir() {
        return btnExcluir;
    }

    public JButton getBtnFechar() {
        return btnFechar;
    }

    public JButton getBtnVisualizarHistorico() {
        return btnVisualizarHistorico;
    }

    public JLabel getLblImagem() {
        return lblImagem;
    }

    public JButton getBtnExportar() {
        return btnExportar;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompartilhar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnVisualizarHistorico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFiltros1;
    private javax.swing.JLabel lblFiltros2;
    private javax.swing.JLabel lblImagem;
    // End of variables declaration//GEN-END:variables
}

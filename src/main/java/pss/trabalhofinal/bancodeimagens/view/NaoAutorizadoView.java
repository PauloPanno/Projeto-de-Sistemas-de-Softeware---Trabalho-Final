package pss.trabalhofinal.bancodeimagens.view;

import javax.swing.JButton;
import javax.swing.JLabel;

public class NaoAutorizadoView extends javax.swing.JInternalFrame {

    public NaoAutorizadoView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAcessoNaoAutorizado = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setTitle("Autorização");

        lblAcessoNaoAutorizado.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblAcessoNaoAutorizado.setText("Aguarde a autorização do administrador");

        btnFechar.setText("Ok");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAcessoNaoAutorizado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAcessoNaoAutorizado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnFechar() {
        return btnFechar;
    }

    public JLabel getLblAguarde(JLabel lblAguarde) {
        return lblAguarde;
    }

    public JLabel getLblIcone(JLabel lblIcone) {
        return lblIcone;
    }

    public JLabel getLblAcessoNaoAutorizado() {
        return lblAcessoNaoAutorizado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel lblAcessoNaoAutorizado;
    // End of variables declaration//GEN-END:variables
}

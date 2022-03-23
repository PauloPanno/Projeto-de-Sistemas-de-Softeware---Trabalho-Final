package pss.trabalhofinal.bancodeimagens.view;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;

public class PrincipalView extends javax.swing.JFrame {

    public PrincipalView() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUser = new javax.swing.JTextPane();
        btnNotifications = new javax.swing.JButton();
        btnSolicitacao = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuUsuario = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenuItem();
        menuUpdate = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenuItem();
        menuArquivos = new javax.swing.JMenu();
        menuAbrir = new javax.swing.JMenuItem();
        menuExcluirMultiplos = new javax.swing.JMenuItem();
        menuDesfazerExlusoes = new javax.swing.JMenuItem();
        jMenuAdministrador = new javax.swing.JMenu();
        menuListarUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);

        txtUser.setEditable(false);
        jScrollPane1.setViewportView(txtUser);

        btnNotifications.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNotifications.setText("0 notificações");

        btnSolicitacao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSolicitacao.setText("Solicitações de Acesso");

        jMenuBar1.setToolTipText("");

        jMenuUsuario.setText("Usuário");

        menuLogin.setText("Acessar");
        jMenuUsuario.add(menuLogin);

        menuUpdate.setText("Editar Cadastro");
        jMenuUsuario.add(menuUpdate);

        menuLogout.setText("Sair");
        jMenuUsuario.add(menuLogout);

        jMenuBar1.add(jMenuUsuario);

        menuArquivos.setText("Arquivo");

        menuAbrir.setText("Abrir");
        menuArquivos.add(menuAbrir);

        menuExcluirMultiplos.setText("Excluir Arquivos");
        menuArquivos.add(menuExcluirMultiplos);

        menuDesfazerExlusoes.setText("Reverter Exclusão");
        menuArquivos.add(menuDesfazerExlusoes);

        jMenuBar1.add(menuArquivos);

        jMenuAdministrador.setText("Administrador");

        menuListarUsuarios.setText("Listar Usuários");
        jMenuAdministrador.add(menuListarUsuarios);

        jMenuBar1.add(jMenuAdministrador);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSolicitacao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNotifications, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolicitacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNotifications)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNotifications;
    private javax.swing.JButton btnSolicitacao;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenuAdministrador;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenu menuArquivos;
    private javax.swing.JMenuItem menuDesfazerExlusoes;
    private javax.swing.JMenuItem menuExcluirMultiplos;
    private javax.swing.JMenuItem menuListarUsuarios;
    private javax.swing.JMenuItem menuLogin;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuUpdate;
    private javax.swing.JTextPane txtUser;
    // End of variables declaration//GEN-END:variables

    public JDesktopPane getDesktop() {
        return desktop;
    }

    public JButton getBtnNotifications() {
        return btnNotifications;
    }

    public JTextPane getTxtUser() {
        return txtUser;
    }

    public JMenuItem getMenuExcluirMultiplos() {
        return menuExcluirMultiplos;
    }

    public JMenu getjMenuAdministrador() {
        return jMenuAdministrador;
    }

    public JMenu getjMenuUsuario() {
        return jMenuUsuario;
    }

    public JMenuItem getMenuListarUsuarios() {
        return menuListarUsuarios;
    }

    public JMenuItem getMenuLogout() {
        return menuLogout;
    }

    public JMenuItem getMenuUpdate() {
        return menuUpdate;
    }

    public JMenuItem getMenuLogin() {
        return menuLogin;
    }

    public JButton getBtnSolicitacao() {
        return btnSolicitacao;
    }

    public JMenu getjMenuArquivo() {
        return menuArquivos;
    }

    public JMenu getArquivos() {
        return menuArquivos;
    }

    public JMenuItem getMenuDesfazerExlusoes() {
        return menuDesfazerExlusoes;
    }

    public JMenuItem getMenuAbrir() {
        return menuAbrir;
    }

}

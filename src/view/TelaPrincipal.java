package view;

import dao.UsuarioDAO;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Usuario;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() { // construtor
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        tabela.setRowSorter(new TableRowSorter(modelo)); // ordenar tabela

        preenchetabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaineldeDados = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtsenha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtadmin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcep = new javax.swing.JTextField();
        txttelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        editarUsuario = new javax.swing.JButton();
        excluirUsuario = new javax.swing.JButton();
        gravarUsuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PainelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Senha");

        txtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsenhaActionPerformed(evt);
            }
        });

        jLabel6.setText("Adm");

        txtadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadminActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Cep");

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel3.setText("E-mail");

        txttelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefoneActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone");

        editarUsuario.setText("Atualizar");
        editarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioActionPerformed(evt);
            }
        });

        excluirUsuario.setText("Excluir");
        excluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUsuarioActionPerformed(evt);
            }
        });

        gravarUsuario.setText("Gravar");
        gravarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarUsuarioActionPerformed(evt);
            }
        });

        jLabel7.setText("Cadastro de Usuários");

        jButton1.setText("Trocar senha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaineldeDadosLayout = new javax.swing.GroupLayout(PaineldeDados);
        PaineldeDados.setLayout(PaineldeDadosLayout);
        PaineldeDadosLayout.setHorizontalGroup(
            PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaineldeDadosLayout.createSequentialGroup()
                .addGroup(PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaineldeDadosLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(107, 107, 107))
                    .addGroup(PaineldeDadosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PaineldeDadosLayout.createSequentialGroup()
                                .addComponent(gravarUsuario)
                                .addGap(43, 43, 43)
                                .addComponent(editarUsuario)
                                .addGap(35, 35, 35)
                                .addComponent(excluirUsuario)
                                .addGap(35, 35, 35)
                                .addComponent(jButton1))
                            .addGroup(PaineldeDadosLayout.createSequentialGroup()
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)))
                .addGroup(PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PaineldeDadosLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(PaineldeDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaineldeDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(382, 382, 382))
        );
        PaineldeDadosLayout.setVerticalGroup(
            PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaineldeDadosLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addGroup(PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(PaineldeDadosLayout.createSequentialGroup()
                        .addGroup(PaineldeDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gravarUsuario)
                            .addComponent(excluirUsuario))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Ativo", "Nome", "E-mail", "Telefone", "CEP", "Administrador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel8.setText("Lista de Usuários");

        javax.swing.GroupLayout PainelTabelaLayout = new javax.swing.GroupLayout(PainelTabela);
        PainelTabela.setLayout(PainelTabelaLayout);
        PainelTabelaLayout.setHorizontalGroup(
            PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTabelaLayout.createSequentialGroup()
                .addGroup(PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelTabelaLayout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelTabelaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelTabelaLayout.setVerticalGroup(
            PainelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTabelaLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(PainelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PaineldeDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PaineldeDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here: // pegar os dados da linha selecionada via mouse 
        if (tabela.getSelectedRow() != -1) {

            txtnome.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            txtemail.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            txttelefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            txtcep.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
            txtadmin.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
        // TODO add your handling code here:// pegar os dados da linha selecionada via teclado
        if (tabela.getSelectedRow() != -1) {

            txtnome.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            txtemail.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            txttelefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            txtcep.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
            txtadmin.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_tabelaKeyReleased

    private void gravarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarUsuarioActionPerformed
        // TODO add your handling code here:

        Usuario usuario = new Usuario();
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        usuario.setNome(txtnome.getText());
        usuario.setEmail(txtemail.getText());
        usuario.setTelefone(txttelefone.getText());
        usuario.setCep(txtcep.getText());
        usuario.setSenha(txtsenha.getText());
        usuario.setAdministrador(Integer.parseInt(txtadmin.getText()));

        try {
            usuarioDAO.save(usuario);// comando(DAO)responsavel por salvar
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        // apaga campo
        txtnome.setText("");
        txtemail.setText("");
        txttelefone.setText("");
        txtcep.setText("");
        txtsenha.setText("");
        txtadmin.setText("");
        
       

        JOptionPane.showMessageDialog(null,"Cadastro gravado com sucesso!");
        preenchetabela();

    }//GEN-LAST:event_gravarUsuarioActionPerformed

    private void excluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirUsuarioActionPerformed
        // TODO add your handling code here:
        // excluir usario
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //System.out.println("linha selecionada: "+tabela.getSelectedRow());
        //System.out.println("codigo"+tabela.getModel().getValueAt(row, 0));
        if (tabela.getSelectedRow() != -1) {
            int row = tabela.getSelectedRow();
            usuarioDAO.deleteByCODIGO((int) tabela.getModel().getValueAt(row, 0));
            JOptionPane.showMessageDialog(null,"Cadastro excluido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "selecione um usuario para excluir");
        }
        preenchetabela();

    }//GEN-LAST:event_excluirUsuarioActionPerformed

    private void editarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioActionPerformed
        // TODO add your handling code here:
        //

        if (tabela.getSelectedRow() != -1) {

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuario = new Usuario();

            usuario.setNome(txtnome.getText());
            usuario.setEmail(txtemail.getText());
            usuario.setTelefone(txttelefone.getText());
            usuario.setCep(txtcep.getText());
            usuario.setAdministrador(Integer.parseInt(txtadmin.getText()));
            usuario.setAtivo((int) tabela.getValueAt(tabela.getSelectedRow(), 1));
            usuario.setCodigo((int) tabela.getValueAt(tabela.getSelectedRow(), 0));

            usuarioDAO.update(usuario);
// apaga campo
            txtnome.setText("");
            txtemail.setText("");
            txttelefone.setText("");
            txtcep.setText("");
            txtadmin.setText("");
            
            JOptionPane.showMessageDialog(null,"Cadastro Atualizado com sucesso!");
            preenchetabela();

        }
    }//GEN-LAST:event_editarUsuarioActionPerformed

    private void txttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefoneActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadminActionPerformed

    private void txtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TelaSenha tela = new TelaSenha();// caso o retorno for verdadeiro ele libera o acesso para a tela principal
                    tela.setVisible(true);//libera o acesso, caso o resultado do
                    //if seja true(verdadeiro)
                    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    public static void preenchetabela() {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        UsuarioDAO udao = new UsuarioDAO();

        for (Usuario u : udao.getUsuarios()) {

            modelo.addRow(new Object[]{
                u.getCodigo(),
                u.getAtivo(),
                u.getNome(),
                u.getEmail(),
                u.getTelefone(),
                u.getCep(),
                u.getAdministrador()
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelTabela;
    private javax.swing.JPanel PaineldeDados;
    private javax.swing.JButton editarUsuario;
    private javax.swing.JButton excluirUsuario;
    private javax.swing.JButton gravarUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tabela;
    private javax.swing.JTextField txtadmin;
    private javax.swing.JTextField txtcep;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtsenha;
    private javax.swing.JTextField txttelefone;
    // End of variables declaration//GEN-END:variables
}

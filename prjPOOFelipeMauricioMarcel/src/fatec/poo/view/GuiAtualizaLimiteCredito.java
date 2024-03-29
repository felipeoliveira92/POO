package fatec.poo.view;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pessoa;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class GuiAtualizaLimiteCredito extends javax.swing.JFrame {

    /**
     * Creates new form GuiAtualizaLimiteCredito
     */
    public GuiAtualizaLimiteCredito(ArrayList<Pessoa> p) {
        initComponents();
        this.setLocationRelativeTo(null);
        pessoas = p;
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jTextFieldPorcentagem = new javax.swing.JTextField();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelAtualizados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("atualiza limite cred");
        setName("atualiza limite"); // NOI18N

        jLabel1.setText("Tipo");

        jLabel2.setText("Porcentagem(%)");

        jLabel3.setText("Qtde Clientes Atualizados");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Especial", "Todos" }));

        jTextFieldPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPorcentagemActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabelAtualizados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelAtualizados, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButtonAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addComponent(jLabelAtualizados, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonSair))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPorcentagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPorcentagemActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        int atualizados = 0;  
        try {
            if(!(jTextFieldPorcentagem.getText().equals(" ")))
            {
                if(Double.parseDouble(jTextFieldPorcentagem.getText()) <= 100)
                {
                    if(jComboBoxTipo.getSelectedItem().toString().equals("Comum"))
                    {
                        for(int i = 0; i < pessoas.size(); i++)
                        {
                            if(pessoas.get(i) instanceof Cliente)
                            {
                                if(((Cliente)pessoas.get(i)).getTipo().equals("Comum"))
                                {
                                    double limiteAtual = ((Cliente)pessoas.get(i)).getLimiteCred();
                                    ((Cliente)pessoas.get(i)).setLimiteCred(limiteAtual + ((limiteAtual / 100) * Double.parseDouble(jTextFieldPorcentagem.getText())));
                                    atualizados++;
                                }
                            }
                        }
                
                    }
                    else if(jComboBoxTipo.getSelectedItem().toString().equals("Especial"))
                    {
                        for(int i = 0; i < pessoas.size(); i++)
                        {
                            if(pessoas.get(i) instanceof Cliente)
                            {
                                if(((Cliente)pessoas.get(i)).getTipo().equals("Especial"))
                                {
                                    double limiteAtual = ((Cliente)pessoas.get(i)).getLimiteCred();
                                    ((Cliente)pessoas.get(i)).setLimiteCred(limiteAtual + ((limiteAtual / 100) * Double.parseDouble(jTextFieldPorcentagem.getText())));
                                    atualizados++;
                                }
                            }
                        }
                    }
                    else
                    {
                        for(int i = 0; i < pessoas.size(); i++)
                        {
                            if(pessoas.get(i) instanceof Cliente)
                            {
                                double limiteAtual = ((Cliente)pessoas.get(i)).getLimiteCred();
                                ((Cliente)pessoas.get(i)).setLimiteCred(limiteAtual + ((limiteAtual / 100) * Double.parseDouble(jTextFieldPorcentagem.getText())));
                                atualizados++;
                            }
                        }
                    }
                }else
                {
                    JOptionPane.showMessageDialog(null, "Valor máximo permitido é 100\n", "Valor Incorreto!", HEIGHT);
                }
            }
        } 
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Digite valor correto na Porcentagem.\n" + ex.getMessage(), "Valor incorreto!", HEIGHT);
        }
         jLabelAtualizados.setText(Integer.toString(atualizados));
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

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
            java.util.logging.Logger.getLogger(GuiAtualizaLimiteCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAtualizaLimiteCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAtualizaLimiteCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAtualizaLimiteCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GuiAtualizaLimiteCredito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAtualizados;
    private javax.swing.JTextField jTextFieldPorcentagem;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pessoa> pessoas;
    
}

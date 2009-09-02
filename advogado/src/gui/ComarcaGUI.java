/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ComarcaGUI.java
 *
 * Created on 30/08/2009, 21:25:28
 */

package gui;

import facade.AdvogadoFacade;
import javax.swing.JOptionPane;

/**
 *
 * @author andrehadm
 */
public class ComarcaGUI extends javax.swing.JDialog {

    private AdvogadoFacade advogadoFacade;

    /** Creates new form ComarcaGUI */
    public ComarcaGUI(AdvogadoFacade advogadoFacade, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.advogadoFacade = advogadoFacade;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        Salvar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nova Comarca"));

        jLabelNome.setText("Nome");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        Salvar.setText("Salvar");
        Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalvarMouseClicked(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFechar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(jButtonFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarMouseClicked
        String nome = jTextFieldNome.getText();
        advogadoFacade.CriarComarca(nome);
        JOptionPane.showMessageDialog(null, "Comarca "+nome+" salva com sucesso.");
        this.dispose();
    }//GEN-LAST:event_SalvarMouseClicked

    private void jButtonFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonFecharMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salvar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

}

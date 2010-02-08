/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ClienteGUI.java
 *
 * Created on 17/07/2009, 17:26:19
 */

package gui;

import excecao.AtributoNaoEncontrado;
import facade.AdvogadoFacade;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author andrehadm
 */
public class ClienteGUI extends javax.swing.JPanel {

    private AdvogadoFacade advogadoFacade;
    private JPanel areaDeTrabalho;
    private JToolBar barraDeFerramentas;

    /** Creates new form ClienteGUI */
    public ClienteGUI(JPanel areaDeTrabalho, JToolBar barra, AdvogadoFacade advogadoFacade) {
        this.advogadoFacade = advogadoFacade;
        this.areaDeTrabalho = areaDeTrabalho;
        this.barraDeFerramentas = barra;
        initComponents();
        this.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_RG = new javax.swing.JTextField();
        jTextField_Endereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Bairro = new javax.swing.JTextField();
        jTextField_Cidade = new javax.swing.JTextField();
        jButton_Salvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_Posicao = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox_UF = new javax.swing.JComboBox();
        jFormattedTextField_CPF = new javax.swing.JFormattedTextField();
        jFormattedTextField_CEP = new javax.swing.JFormattedTextField();
        jFormattedTextField_Telefone = new javax.swing.JFormattedTextField();
        jFormattedTextField_Celular = new javax.swing.JFormattedTextField();
        jFormattedTextField_Visista = new javax.swing.JFormattedTextField();
        jButtonFechar = new javax.swing.JButton();
        jButton_Limpar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Novo Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Endereço");

        jLabel4.setText("RG");

        jLabel5.setText("Bairro");

        jLabel6.setText("Cidade");

        jButton_Salvar.setText("Salvar");
        jButton_Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_SalvarMouseClicked(evt);
            }
        });

        jLabel7.setText("CEP");

        jLabel8.setText("UF");

        jLabel9.setText("Telefone");

        jLabel10.setText("Celular");

        jLabel11.setText("Email");

        jLabel12.setText("Posição");

        jLabel13.setText("Próx. Visita");

        jComboBox_UF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RN", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "GO", "ES", "MA", "MT", "MS", "MG", "PA", "PB", "PE", "PI", "RJ", "RS", "RO", "RR", "SP", "SC", "SE", "TO" }));

        try {
            jFormattedTextField_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField_CEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField_Celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField_Visista.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonFechar.setText("Fechar");
        jButtonFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFecharMouseClicked(evt);
            }
        });

        jButton_Limpar.setText("Limpar");
        jButton_Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_LimparMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(jTextField_Endereco, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(jTextField_Bairro, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(jTextField_Cidade, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE))
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jFormattedTextField_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_Posicao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton_Salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Limpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFechar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField_Visista, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextField_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jFormattedTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_Posicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jFormattedTextField_Visista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Salvar)
                    .addComponent(jButtonFechar)
                    .addComponent(jButton_Limpar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SalvarMouseClicked
        String nome = jTextField_Nome.getText();
        String cpf = jFormattedTextField_CPF.getText();
        String rg = jTextField_RG.getText();
        String endereco = jTextField_Endereco.getText();
        String bairro = jTextField_Bairro.getText();
        String cidade = jTextField_Cidade.getText();
        String cep = jFormattedTextField_CEP.getText();
        String uf = jComboBox_UF.getSelectedItem().toString();
        String telefone = jFormattedTextField_Telefone.getText();
        String celular = jFormattedTextField_Celular.getText();
        String email = jTextField_Email.getText();
        String posicao = jTextField_Posicao.getText();
        String visita = jFormattedTextField_Visista.getText();

        System.out.println("Verificando atributos.");
        if (cpf.trim().length() == 9) {
            cpf = "";
        }
        if (cep.trim().length() == 1) {
            cep = "";
        }
        if (telefone.trim().length() == 10) {
            telefone = "";
        }
        if (celular.trim().length() == 10) {
            celular = "";
        }
        if (visita.trim().length() == 4) {
            visita = "";
        }


        try {
            advogadoFacade.CriarCliente(nome, cpf, rg, endereco, bairro, cidade, cep, uf, telefone, celular, email, posicao, visita);
            JOptionPane.showMessageDialog(null, "Cliente "+nome+" salvo com sucesso.");
            limpaCampos();
        } catch (AtributoNaoEncontrado ex) {
            System.out.println("Falta algum atributo.");
            //Logger.getLogger(ClienteGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage() ,"Erro",JOptionPane.ERROR_MESSAGE);
            //jTextField_Nome.grabFocus();
            //jFormattedTextField_CEP.grabFocus();
        }

    }//GEN-LAST:event_jButton_SalvarMouseClicked

    private void verificaNomeVazio(String nome) {
        if (nome.isEmpty()) {
            //jTextField_Nome.
        }
    }

    private void jButtonFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFecharMouseClicked
        habilitaBotoesBarraDeFerramentas();
        areaDeTrabalho.removeAll();
        areaDeTrabalho.revalidate();
        areaDeTrabalho.repaint();
    }//GEN-LAST:event_jButtonFecharMouseClicked

    private void habilitaBotoesBarraDeFerramentas(){
        for (Component botoes: barraDeFerramentas.getComponents()) {
            botoes.setEnabled(true);
        }
        System.out.println("");
        System.out.println("Todos os botoes habilitados.");
    }

    private void jButton_LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LimparMouseClicked
        limpaCampos();
    }//GEN-LAST:event_jButton_LimparMouseClicked

    private void limpaCampos() {
        jTextField_Nome.setText("");
        jFormattedTextField_CPF.setText("");
        jTextField_RG.setText("");
        jTextField_Endereco.setText("");
        jTextField_Bairro.setText("");
        jTextField_Cidade.setText("");
        jFormattedTextField_CEP.setText("");
        jFormattedTextField_Telefone.setText("");
        jFormattedTextField_Celular.setText("");
        jTextField_Email.setText("");
        jTextField_Posicao.setText("");
        jFormattedTextField_Visista.setText("");
        System.out.println("");
        System.out.println("Todos os campos limpos.");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButton_Limpar;
    private javax.swing.JButton jButton_Salvar;
    private javax.swing.JComboBox jComboBox_UF;
    private javax.swing.JFormattedTextField jFormattedTextField_CEP;
    private javax.swing.JFormattedTextField jFormattedTextField_CPF;
    private javax.swing.JFormattedTextField jFormattedTextField_Celular;
    private javax.swing.JFormattedTextField jFormattedTextField_Telefone;
    private javax.swing.JFormattedTextField jFormattedTextField_Visista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField_Bairro;
    private javax.swing.JTextField jTextField_Cidade;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Endereco;
    private javax.swing.JTextField jTextField_Nome;
    private javax.swing.JTextField jTextField_Posicao;
    private javax.swing.JTextField jTextField_RG;
    // End of variables declaration//GEN-END:variables

}

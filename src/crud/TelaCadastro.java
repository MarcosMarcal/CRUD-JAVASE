/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import model.bean.Produto;
import model.dao.ProdutoDAO;

/**
 *
 * @author marcal
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
    }

    private int produtoId;

    public TelaCadastro(Produto prod) {
        initComponents();
        produtoId = prod.getId();
        txt_dscNew.setText(prod.getDescricao());
        txt_fornNew.setText(prod.getFornecedor());
        txt_pricOrigNew.setText(""+prod.getPrecoOrig());
        txt_pricFinNew.setText(""+prod.getPrecoFin());
        txt_qntNew.setText(String.valueOf(prod.getQnt()));
        txt_LimitNew.setText(String.valueOf(prod.getLimite()));
        btn_cadastrar.setText("Atualizar");
        this.setTitle("Atualizar Produto");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        pnl_telaCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_dscNew = new javax.swing.JTextField();
        txt_fornNew = new javax.swing.JTextField();
        txt_pricOrigNew = new javax.swing.JTextField();
        txt_pricFinNew = new javax.swing.JTextField();
        txt_LimitNew = new javax.swing.JTextField();
        txt_qntNew = new javax.swing.JTextField();
        box_medidaNew = new javax.swing.JComboBox();
        btn_limpar = new javax.swing.JButton();
        btn_cadastrar = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        jTextField7.setText("jTextField7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setResizable(false);

        pnl_telaCadastro.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Descrição");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fornecedor");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Preço Origem");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Preço Final");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Limite de Estoque");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Medida");

        txt_dscNew.setBackground(new java.awt.Color(204, 204, 255));

        txt_fornNew.setBackground(new java.awt.Color(204, 204, 255));

        txt_pricOrigNew.setBackground(new java.awt.Color(204, 204, 255));

        txt_pricFinNew.setBackground(new java.awt.Color(204, 204, 255));

        txt_LimitNew.setBackground(new java.awt.Color(204, 204, 255));

        txt_qntNew.setBackground(new java.awt.Color(204, 204, 255));

        box_medidaNew.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "un", "cx", "pct" }));
        box_medidaNew.setBorder(null);

        btn_limpar.setBackground(new java.awt.Color(153, 153, 255));
        btn_limpar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btn_limpar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        btn_cadastrar.setBackground(new java.awt.Color(153, 153, 255));
        btn_cadastrar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btn_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_telaCadastroLayout = new javax.swing.GroupLayout(pnl_telaCadastro);
        pnl_telaCadastro.setLayout(pnl_telaCadastroLayout);
        pnl_telaCadastroLayout.setHorizontalGroup(
            pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_telaCadastroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_telaCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fornNew, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_telaCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_dscNew, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_telaCadastroLayout.createSequentialGroup()
                        .addGroup(pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnl_telaCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_pricOrigNew, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_telaCadastroLayout.createSequentialGroup()
                                .addGroup(pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_qntNew)
                                    .addComponent(txt_LimitNew))))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_telaCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(box_medidaNew, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_telaCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_pricFinNew, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_telaCadastroLayout.createSequentialGroup()
                        .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnl_telaCadastroLayout.setVerticalGroup(
            pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_telaCadastroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_dscNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_fornNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txt_pricOrigNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pricFinNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(txt_LimitNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(box_medidaNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_qntNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnl_telaCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_telaCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_telaCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        // TODO add your handling code here:

        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        p.setDescricao(txt_dscNew.getText());
        p.setFornecedor(txt_fornNew.getText());
        p.setPrecoOrig(Float.parseFloat(txt_pricOrigNew.getText()));
        p.setPrecoFin(Float.parseFloat(txt_pricFinNew.getText()));
        p.setQnt(Integer.parseInt(txt_qntNew.getText()));
        p.setLimite(Integer.parseInt(txt_LimitNew.getText()));
        p.setMedida(box_medidaNew.getSelectedItem().toString());
        if (btn_cadastrar.getText().equals("Atualizar")) {
            p.setId(produtoId);
            dao.update(p);
        } else {
            dao.create(p);

        }

    }//GEN-LAST:event_btn_cadastrarActionPerformed
    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        // TODO add your handling code here:

        txt_dscNew.setText("");
        txt_fornNew.setText("");
        txt_pricOrigNew.setText("");
        txt_pricFinNew.setText("");
        txt_qntNew.setText("");
        txt_LimitNew.setText("");
        box_medidaNew.setSelectedIndex(0);


    }//GEN-LAST:event_btn_limparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box_medidaNew;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel pnl_telaCadastro;
    private javax.swing.JTextField txt_LimitNew;
    private javax.swing.JTextField txt_dscNew;
    private javax.swing.JTextField txt_fornNew;
    private javax.swing.JTextField txt_pricFinNew;
    private javax.swing.JTextField txt_pricOrigNew;
    private javax.swing.JTextField txt_qntNew;
    // End of variables declaration//GEN-END:variables
}

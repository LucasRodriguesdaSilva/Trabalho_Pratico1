/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jarvis
 */
public class CadastroContaPoupanca extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroContaPoupanca
     */
    private static int enviar;
    private static double enviarSaldo;
    private static String enviarNome;
    double addReajuste;

    public double getAddReajuste() {
        return addReajuste;
    }

    public void setAddReajuste(double addReajuste) {
        this.addReajuste = addReajuste;
    }
    
    public String getEnviarNome() {
        return enviarNome;
    }

    public void setEnviarNome(String enviarNome) {
        this.enviarNome = enviarNome;
    }

    public int getEnviar() {
        return enviar;
    }

    public void setEnviar(int enviar) {
        this.enviar = enviar;
    }
    
    public double getSaldo() {
        return enviarSaldo;
    }

    public void setSaldo(double enviarSaldo) {
        this.enviarSaldo = enviarSaldo;
    }
    
    
    public CadastroContaPoupanca() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tnome1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tnumero1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tsaldo1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        treajuste = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Conta Poupança");

        jLabel1.setText("Nome do Titular");

        tnome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnome1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Número da conta");

        jLabel3.setText("Saldo Inicial");

        tsaldo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsaldo1ActionPerformed(evt);
            }
        });

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Taxa de reajuste");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tnome1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tnumero1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(tsaldo1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(treajuste, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tnome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tsaldo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(treajuste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnome1ActionPerformed

    private void tsaldo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsaldo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsaldo1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        CadastroContaNormal c1 = new CadastroContaNormal();
        
       
        
        ContaPoupanca conta2;
        conta2 = new ContaPoupanca();
        
        
        String nome1 = tnome1.getText();
        conta2.setNome(nome1);
        this.enviarNome = nome1;
        
        String numero1 = tnumero1.getText();
        int num1 = Integer.parseInt(numero1);
        conta2.setNumero(num1);
        this.enviar = num1;
        
        String saldo1 = tsaldo1.getText();
        double saldo2 = Double.parseDouble(saldo1);
        conta2.setSaldo(saldo2);
        this.enviarSaldo = saldo2;
        
        String taxa = treajuste.getText();
        double taxa1 = Double.parseDouble(taxa);
        this.addReajuste = (taxa1 / 100);
        
        
        conta2.tipoconta();
        
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null,"Cancelado com Sucesso!");
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tnome1;
    private javax.swing.JTextField tnumero1;
    private javax.swing.JTextField treajuste;
    private javax.swing.JTextField tsaldo1;
    // End of variables declaration//GEN-END:variables
}
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
public class CadastroContaEspecial extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroContaEspecial
     */
    private static int enviar;
    private static double enviarSaldo;
    private static String enviarNome;
    private static int enviarLimite;
    private static double enviarMulta;

    public double getEnviarMulta() {
        return enviarMulta;
    }

    public void setEnviarMulta(double enviarMulta) {
        this.enviarMulta = enviarMulta;
    }

    public int getEnviarLimite() {
        return enviarLimite;
    }

    public void setEnviarLimite(int enviarLimite) {
        this.enviarLimite = enviarLimite;
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
    
    
    public CadastroContaEspecial() {
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
        tnome2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tnumero2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tsaldo2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tlimite = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tmulta = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Conta Especial");

        jLabel1.setText("Nome do Titular");

        tnome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnome2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Número da conta");

        jLabel3.setText("Saldo Inicial");

        tsaldo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsaldo2ActionPerformed(evt);
            }
        });

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Limite");

        jLabel5.setText("Multa");

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
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tnome2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tnumero2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addComponent(tsaldo2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tlimite, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tmulta, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tnome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tsaldo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tlimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tmulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
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

    private void tnome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnome2ActionPerformed

    private void tsaldo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsaldo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsaldo2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        ContaEspecial conta3;
        conta3 = new ContaEspecial();
        
        
        String nome2 = tnome2.getText();
        conta3.setNome(nome2);
        this.enviarNome = nome2;
        
        String numero2 = tnumero2.getText();
        int num2 = Integer.parseInt(numero2);
        conta3.setNumero(num2);
        this.enviar = num2;
        
        String saldo2 = tsaldo2.getText();
        double saldo3 = Double.parseDouble(saldo2);
        conta3.setSaldo(saldo3);
        this.enviarSaldo = saldo3;
        
        String limite1 = tlimite.getText();
        int limite = Integer.parseInt(limite1);
        conta3.setLimite(limite);
        this.enviarLimite = limite;
        
        String multa1 = tmulta.getText();
        double multa = Double.parseDouble(multa1);
        conta3.setMulta1(multa);
        this.enviarMulta = multa;
        
        conta3.tipoconta();
        
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tlimite;
    private javax.swing.JTextField tmulta;
    private javax.swing.JTextField tnome2;
    private javax.swing.JTextField tnumero2;
    private javax.swing.JTextField tsaldo2;
    // End of variables declaration//GEN-END:variables
}

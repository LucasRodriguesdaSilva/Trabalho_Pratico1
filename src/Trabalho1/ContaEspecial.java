package Trabalho1;

import javax.swing.JOptionPane;

public class ContaEspecial extends Contas {
    private int limite;
    private double multa1;

    public double getMulta1() {
        return multa1;
    }

    public void setMulta1(double multa1) {
        this.multa1 = multa1;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    public void descontar(double multa){
        CadastroContaEspecial sq3 = new CadastroContaEspecial();
        
        double saldoAtual = sq3.getSaldo();
        saldoAtual = saldoAtual - sq3.getEnviarLimite();
        double descontar1 = saldoAtual + (multa/100 * saldoAtual);
        sq3.setSaldo(descontar1);
        
    }
    
    public void tipoconta(){
         JOptionPane.showMessageDialog(null, "Tipo de Conta: Conta-Especial");
    }
}

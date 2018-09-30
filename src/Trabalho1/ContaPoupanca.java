package Trabalho1;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Contas {
    
    
    public void reajuste(double taxa){
        
        CadastroContaPoupanca cp = new CadastroContaPoupanca();
        
        double saldoAtual = cp.getSaldo();
        double reajuste = saldoAtual * (taxa / 100);
        cp.setSaldo(cp.getSaldo() + reajuste);
        
    }
    
    public void reajuste(){
        
        CadastroContaPoupanca cp = new CadastroContaPoupanca();
        
        double taxa = 0.1;
        double saldoAtual = cp.getSaldo();
        double reajuste = saldoAtual * taxa;
        cp.setSaldo(cp.getSaldo() + reajuste);
        
    }
    
        public void tipoconta(){
         JOptionPane.showMessageDialog(null, "Tipo de Conta: Conta-Poupança");
    }
}

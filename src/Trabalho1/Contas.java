package Trabalho1;

import javax.swing.JOptionPane;

public class Contas {
    private  static String nome;
    private  static int numero;
    private  static double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    public boolean sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        else 
            return false;
    }
    boolean transferir(int conta1, int conta2, double valor){
        
        CadastroContaNormal a = new CadastroContaNormal();
        CadastroContaPoupanca b = new CadastroContaPoupanca();
        CadastroContaEspecial c = new CadastroContaEspecial();
        
        Contas c1 = new Contas();
        ContaPoupanca c2 = new ContaPoupanca();
        ContaEspecial c3 = new ContaEspecial();
        
        if(conta1 == a.getEnviar()){
            
            if(conta2 == b.getEnviar()){
                
                c1.setSaldo(a.getSaldo());
                boolean retirar = c1.sacar(valor);
                
                if(retirar == true){
                    a.setSaldo(a.getSaldo() - valor);
                    b.setSaldo(b.getSaldo() + valor);
                    return true;
                }
                else
                    return false;
            }
            
            if(conta2 == c.getEnviar()){
                c1.setSaldo(a.getSaldo());
                boolean retirar = c1.sacar(valor);
                if(retirar == true){
                    a.setSaldo(a.getSaldo() - valor);
                    c.setSaldo(c.getSaldo() + valor);
                    return true;
                }
                else
                    return false;
            }
    
        }
        
        if(conta1 == b.getEnviar()){
            
            if(conta2 == a.getEnviar()){
                c2.setSaldo(b.getSaldo());
                boolean retirar = c2.sacar(valor);
                if(retirar == true){
                    b.setSaldo(b.getSaldo() - valor);
                    a.setSaldo(a.getSaldo() + valor);
                    return true;
                }
                else
                    return false;
            }
            
            if(conta2 == c.getEnviar()){
                c2.setSaldo(b.getSaldo());
                boolean retirar = c2.sacar(valor);
                if(retirar == true){
                    b.setSaldo(b.getSaldo() - valor);
                    c.setSaldo(c.getSaldo() + valor);
                    return true;
                }
                else
                    return false;
                
            }
        }
        if(conta1 == c.getEnviar()){
        
            if(conta2 == a.getEnviar()){
                c3.setSaldo(c.getSaldo());
                boolean retirar = c3.sacar(valor);
                if(retirar == true){
                    c.setSaldo(c.getSaldo() - valor);
                    a.setSaldo(a.getSaldo() + valor);
                    return true;
                }
                else
                    return false;
            }
            if(conta2 == b.getEnviar()){
                c3.setSaldo(c.getSaldo());
                boolean retirar = c3.sacar(valor);
                if(retirar == true){
                    c.setSaldo(c.getSaldo() - valor);
                    b.setSaldo(b.getSaldo() + valor);
                    return true;
                
                }
                else
                    return false;
            
            }
        
        }
        
     return false;   
    }
        
          

    
    
    
    
    public void tipoconta(){
        JOptionPane.showMessageDialog(null, "Tipo de Conta: Conta-Comum");
    }
}


package aula070301;

public class Conta {
    private double saldo = 0;
    
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor <= 0 " + valor);
            return;
        }
        
        System.out.println("Depositou " + valor);
        saldo += valor;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor negativo:" + valor);
            return;
        }
        
        if (valor > saldo) {
            System.out.println("Valor > Saldo " + valor);
            return;
        }
        
        System.out.println("Sacou " + valor);
        saldo -= valor;
    }
    
    public double juros() {
        double juros = getSaldo() / 100;
        depositar(juros);
        
        return juros;
    }
}

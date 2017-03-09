package aula070302;

public class Poupanca extends Conta {
    public double juros() {
        double juros = getSaldo() / 100;
        depositar(juros);
        
        return juros;
    }

    public void sacar(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Valor > Saldo " + valor);
            return;
        }
        super.sacar(valor);
    }
    
    
}

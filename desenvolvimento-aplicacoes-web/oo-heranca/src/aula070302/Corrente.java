package aula070302;

public class Corrente extends Conta {
    protected double limite = 0;

    public void sacar(double valor) {
        double podeSacar = limite + getSaldo();
        if (valor > podeSacar) {
            System.out.println("Valor > PodeSacar " + valor);
            return;
        }
        super.sacar(valor);
    }
    
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
}

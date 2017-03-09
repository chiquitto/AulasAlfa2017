package aula070301;

public class Principal {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        
        conta1.depositar(120);
        conta1.depositar(100);
        conta1.depositar(-10);
        
        System.out.println(conta1.getSaldo());
        
        conta1.juros();
        
        System.out.println(conta1.getSaldo());
        
        conta1.sacar(50);
        conta1.sacar(200);
        
        System.out.println(conta1.getSaldo());
        
        conta1.juros();
        
        System.out.println(conta1.getSaldo());
        
        conta1.sacar(conta1.getSaldo());
        
        System.out.println(conta1.getSaldo());
        
        conta1.juros();
        
        System.out.println(conta1.getSaldo());
    }
    
}

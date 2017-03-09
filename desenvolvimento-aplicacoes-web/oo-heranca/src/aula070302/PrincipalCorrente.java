package aula070302;

public class PrincipalCorrente {
    public static void main(String[] args) {
        Corrente c = new Ouro();
        
        c.depositar(100);
        
        c.sacar(150);
        System.out.println(c.getSaldo());
        
        c.setLimite(100);
        c.sacar(150);
        System.out.println(c.getSaldo());
        
        c.depositar(500);

        c.sacar(25);
        System.out.println(c.getSaldo());
    }
}

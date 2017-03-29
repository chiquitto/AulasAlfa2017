package aula032802;

import java.util.InputMismatchException;

public class Aula032802 {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        
        try {
            c.qualquer();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        double a = -10;
        double b = 10;
        
        try {
            double resultado = c.divisao(a, b);
            System.out.println(resultado);
            
            return;
        } catch (ArithmeticException ex) {
            // codigo para contornar o problema
            
            System.out.println("O numero informado foi zero");
        } catch (InputMismatchException ex) {
            System.out.println("a deve ser positivo");
            
            return;
        } catch (Exception ex) {
            System.out.println("Exceção desconhecida");
        } finally {
            System.out.println("Alfa 2");
        }
        
        System.out.println("Alfa 1");
    }
    
}

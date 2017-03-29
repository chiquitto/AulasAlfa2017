package aula032802;

import java.util.InputMismatchException;

public class Calculadora {
    
    public int qualquer() throws Exception {
        
        //throw new Exception("Exceção qualquer");
        
        return 1;
    }
    
    public double divisao(double a, double b)
            throws ArithmeticException, InputMismatchException {
        
        if (a < 0) {
            throw new InputMismatchException();
        }
        if (b == 0) {
            throw new ArithmeticException();
        }
        
        return a / b;
    }
    
}

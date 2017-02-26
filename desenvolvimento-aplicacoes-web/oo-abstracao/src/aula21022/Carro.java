package aula21022;

public class Carro {
    int numero;
    String cor;
    int velocidade;
    int velocidadeMaxima = 300;
    int marcha;
    int quantidadeMarchas = 6;
    
    Piloto piloto;
    
    public void ligar() {
        System.out.println("Ligou o carro");
    }
    
    public int definirVelocidade(int velocidade) {
        if (velocidade <= velocidadeMaxima) {
            this.velocidade = velocidade;
        }
        return this.velocidade;
    }
    
    public int aumentarVelocidade() {
        //int x = this.velocidade + (2 * marcha);
        //return definirVelocidade(x);
        return aumentarVelocidade(2);
    }
    
    public int aumentarVelocidade(int valor) {
        int x = this.velocidade + (valor * marcha);
        return definirVelocidade(x);
    }
}

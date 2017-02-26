package aula21022;

public class Principal {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.numero = 1;
        carro1.cor = "Vermelho";
        carro1.marcha = 0;
        carro1.velocidade = 0;
        
        Piloto piloto1 = new Piloto();
        carro1.piloto = piloto1;
        
        piloto1.nome = "Schumacher";
        
        carro1.velocidadeMaxima = 300;
//        System.out.println(carro1.velocidadeMaxima);
        
        carro1.ligar();
        carro1.marcha = 5;
        carro1.aumentarVelocidade();
        carro1.aumentarVelocidade();
        carro1.aumentarVelocidade();
        carro1.aumentarVelocidade();
        carro1.aumentarVelocidade(10);
        
        int x = carro1.aumentarVelocidade();
        System.out.println(x);
        
//        Piloto piloto2 = carro1.piloto;
//        piloto2.nome = "Xumaker";
        
//        System.out.println(piloto1.nome);
        
//        System.out.println(carro1.numero);
//        System.out.println(carro1.cor);
    }
    
}

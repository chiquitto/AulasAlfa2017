package aula210301.animais;

public class Pombo extends Ave implements Herbivoro, Carnivoro {
    
    public void comer(Planta comida) {
        System.out.println("Comer planta");
    }

    public void comer(Carne comida) {
        System.out.println("Comer carne");
    }
    
}

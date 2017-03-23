package aula210301.animais;

public class Gaviao extends Ave  implements Carnivoro {
    
    public void comer(Carne comida) {
        System.out.println("Comer carne");
    }
    
}

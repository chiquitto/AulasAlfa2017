/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author chiquitto
 */
public class Main {
    
    private static Restaurante restaurante;

    public static void main(String[] args) {
        iniciarValores();
        
        fazerPedidos();
    }
    
    public static void iniciarValores() {
        restaurante = new Restaurante();
        
        restaurante.novaMesa(new Mesa(1));
        restaurante.novaMesa(new Mesa(2));
        restaurante.novaMesa(new Mesa(3));
        
        restaurante.novoProduto(new Produto(1, "Lasanha", 40.0f));
        restaurante.novoProduto(new Produto(2, "Pizza", 30.0f));
        restaurante.novoProduto(new Produto(3, "Arroz", 20.0f));
        restaurante.novoProduto(new Produto(4, "Refrigerante", 5.0f));
    }

    private static void fazerPedidos() {
        Produto lasanha = restaurante.pesquisarProduto(1);
        Produto pizza = restaurante.pesquisarProduto(2);
        Produto arroz = restaurante.pesquisarProduto(3);
        Produto refrigerante = restaurante.pesquisarProduto(4);
        
        Mesa mesa;
        
        mesa = restaurante.pesquisarMesa(3);
        mesa.fazerPedido(lasanha, 1);
        mesa.fazerPedido(refrigerante, 2);
        mesa.fazerPedido(refrigerante, 1);
        
        mesa.relatorio();
    }

    
    
}

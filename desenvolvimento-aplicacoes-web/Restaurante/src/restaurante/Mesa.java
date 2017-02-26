package restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiquitto
 */
public class Mesa {
    private final int numero;
    private List<Pedido> pedidos = new ArrayList<>();

    public Mesa(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public Pedido fazerPedido(Produto produto, int quantidade) {
        Pedido pedido = null;
        
        for (Pedido i : pedidos) {
            if (i.getProduto() == produto) {
                pedido = i;
                break;
            }
        }
        
        if (pedido == null) {
            pedido = new Pedido(produto, quantidade, produto.getPreco());
            pedidos.add(pedido);
        } else {
            pedido.add(quantidade);
        }
        
        return pedido;
    }

    public void relatorio() {
        float total = 0;
        
        for (Pedido pedido : pedidos) {
            String s = "";
            
            float subtotal = pedido.getPreco() * pedido.getQuantidade();
            total += subtotal;
            
            s += pedido.getQuantidade() + " x ";
            s += pedido.getProduto().getDescricao();
            s += " = " + subtotal;
            
            System.out.println(s);
        }
        
        System.out.println("Total: " + total);
    }
    
}

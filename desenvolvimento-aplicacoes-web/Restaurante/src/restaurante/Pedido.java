package restaurante;

/**
 *
 * @author chiquitto
 */
public class Pedido {
    private Produto produto;
    private int quantidade;
    private float preco;

    public Pedido(Produto produto, int quantidade, Float preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPreco() {
        return preco;
    }

    void add(int quantidade) {
        this.quantidade += quantidade;
    }
    
    
}

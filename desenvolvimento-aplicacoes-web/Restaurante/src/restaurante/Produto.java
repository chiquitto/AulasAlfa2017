package restaurante;

/**
 *
 * @author chiquitto
 */
public class Produto {
    private final int numero;
    private final String descricao;
    private final Float preco;

    public Produto(int numero, String descricao, Float preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public int getNumero() {
        return numero;
    }

    public Float getPreco() {
        return preco;
    }
    
}

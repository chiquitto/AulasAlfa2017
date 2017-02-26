package restaurante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiquitto
 */
public class Restaurante {

    private List<Mesa> mesas = new ArrayList<>();
    private List<Produto> produtos = new ArrayList<>();

    public void novaMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    public void novoProduto(Produto produto) {
        produtos.add(produto);
    }

    public Mesa pesquisarMesa(int numero) {
        for (Mesa mesa : mesas) {
            if (mesa.getNumero() == numero) {
                return mesa;
            }
        }
        
        return null;
    }

    public Produto pesquisarProduto(int numero) {
        for (Produto produto : produtos) {
            if (produto.getNumero() == numero) {
                return produto;
            }
        }
        
        return null;
    }

}

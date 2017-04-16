package aula0411;

import aula0411.dao.ProdutoDao;
import aula0411.exception.RegistroInexistenteException;
import aula0411.vo.Produto;
import java.util.List;

public class Aula0411 {

    public static void main(String[] args) {
        
        ProdutoDao produtoDao = new ProdutoDao();
        
//        Produto p1 = new Produto();
//        p1.setDescricao("Mouse");
//        p1.setPreco(59.90);
        
//        produtoDao.inserir(p1);
        
//        System.out.println(p1.getIdproduto());
        
//        Produto p2 = new Produto();
//        p2.setIdproduto(1);
//        p2.setDescricao("Teclado");
//        p2.setPreco(400);
//        
//        produtoDao.atualizar(p2);
        
//        Produto p3;
//        
//        try {
//            p3 = produtoDao.pegarUm(3);
//            
//            System.out.println(p3.getDescricao());
//            System.out.println(p3.getPreco());
//        } catch (RegistroInexistenteException e) {
//            e.printStackTrace();
//        }
        
        List<Produto> produtos = produtoDao.pegarTodos();
        
        for (Produto produto : produtos) {
            System.out.println(produto.getIdproduto());
            System.out.println(produto.getDescricao());
        }
        
    }
    
}

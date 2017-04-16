package aula0411.dao;

import aula0411.Conexao;
import aula0411.exception.RegistroInexistenteException;
import aula0411.vo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {
    
    public void inserir(Produto produto) {
        String sql = "Insert Into produto"
                + "(descricao, preco) Values (?, ?)";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt= conexao.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPreco());
            
            stmt.execute();
            
            ResultSet rs = stmt.getGeneratedKeys();
            int id = rs.getInt(1);
            
            produto.setIdproduto(id);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void atualizar(Produto produto) {
        String sql = "Update produto Set "
                + "descricao = ?,"
                + "preco = ?"
                + "Where idproduto = ?";
        
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getIdproduto());
            
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void apagar(int idproduto) {
        String sql = "Delete from produto "
                + "Where idproduto = ?";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, idproduto);
            
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private Produto rsParaObjeto(ResultSet rs) {
        Produto p = new Produto();
        
        try {
            p.setIdproduto(rs.getInt("idproduto"));
            p.setDescricao(rs.getString("descricao"));
            p.setPreco(rs.getFloat("preco"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return p;
    }
    
    public Produto pegarUm(int idproduto)
        throws RegistroInexistenteException {
        String sql = "Select "
                + "idproduto, descricao, preco "
                + "From produto "
                + "Where idproduto = ?";
        
        Connection conexao = Conexao.getConexao();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idproduto);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                return rsParaObjeto(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        throw new RegistroInexistenteException();
    }
    
    public List<Produto> pegarTodos() {
        String sql = "Select idproduto, descricao, preco "
                + "From produto";
        Connection conexao = Conexao.getConexao();
        
        ArrayList<Produto> produtos = new ArrayList();
        
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            Produto p;
            while (rs.next()) {
                p = rsParaObjeto(rs);
                produtos.add(p);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return produtos;
    }
    
}

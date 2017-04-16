package jdbcexemplo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import jdbcexemplo.Conexao.Conexao;

/**
 *
 * @author chiquitto
 */
public class ClienteInsert {
    public static void main(String[] args) {
        Connection conexao = Conexao.getConexao();
        
        String nome = "João Ninguém";
        Date nascimento = new Date();
        
        java.sql.Date nascimentoSql = new java.sql.Date(nascimento.getTime());
                
        String sql = "Insert into cliente (nome, nascimento) Values (?, ?)";
        
        try {
            // Cadastrar no BD
            PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, nome);
            stmt.setDate(2, nascimentoSql);
            
            stmt.executeUpdate();
            
            // Pegar Id gerado
            ResultSet rs = stmt.getGeneratedKeys();
            // System.out.println(rs.getInt(1));
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

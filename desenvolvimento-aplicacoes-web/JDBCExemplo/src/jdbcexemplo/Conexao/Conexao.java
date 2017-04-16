package jdbcexemplo.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chiquitto
 */
public class Conexao {
    private static Connection conexao = null;
    
    private static String path = "/Users/chiquitto/work/aula/JDBCExemplo/resources";
    private static String file = "/restaurante.sqlite.db";
    
    public static Connection getConexao() {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection("jdbc:sqlite:" + path + file);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return conexao;
    }
}

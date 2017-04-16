package aula0404;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private static Connection conexao;
    
    private static String dir = "/Users/faculdadealfa/chiquitto/aula0404/arquivos";
    private static String file = "/restaurante.sqlite.db";
    
    public static Connection getConexao() {
        if (conexao == null) {
            // abrir conexao
            String dsn = "jdbc:sqlite:" + dir + file;
            
            try {
                conexao = DriverManager.getConnection(dsn);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        return conexao;
    }
}

package util;

import br.com.chiquitto.aula.jdbcblog.Conexao;

/**
 *
 * @author chiquitto
 */
public class Util {
    public static void iniciarConexao() {
        Conexao.setUrl("jdbc:sqlite:/Users/faculdadealfa/Desktop/jsp-blog/lib/blog.sqlite/blog.sqlite.db");
    }
}

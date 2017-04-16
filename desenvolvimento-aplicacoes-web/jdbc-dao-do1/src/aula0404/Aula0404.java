package aula0404;

import aula0404.vo.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

public class Aula0404 {

    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();
        calendario.set(2000, 4, 1);
        calendario.set(Calendar.YEAR, 1990);
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Neymaria");
        cliente1.setNascimento(calendario.getTime());
        
        // calendario.set(Calendar.YEAR, 1980);
        calendario.add(Calendar.YEAR, -10);
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Neyjose");
        cliente2.setNascimento(calendario.getTime());
        
        try {
            cadastrar(cliente1);
            System.out.println("Cadastrado: " + cliente1.getIdcliente());
            
            cadastrar(cliente2);
            System.out.println("Cadastrado: " + cliente2.getIdcliente());
        } catch (Exception e) {
            
        }
        
        String sql = "Select idcliente, nome, nascimento From cliente";
        
        try {
            Statement stmtSelect = Conexao.getConexao().createStatement();
            ResultSet rs = stmtSelect.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println( rs.getInt("idcliente") );
                System.out.println( rs.getString("nome") );
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void cadastrar(Cliente cliente)
            throws Exception {
        String sql = "Insert into cliente (nome, nascimento)"
                + "Values (?, ?)";
        
        try {
            PreparedStatement st = Conexao.getConexao().prepareStatement(
                    sql, Statement.RETURN_GENERATED_KEYS);
            
            st.setString(1, cliente.getNome());
            st.setLong(2, cliente.getNascimento().getTime());
            st.executeUpdate();
            
            ResultSet rsChaves = st.getGeneratedKeys();
            cliente.setIdcliente(rsChaves.getInt(1));
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro para cadastrar cliente");
        }
    }
    
}

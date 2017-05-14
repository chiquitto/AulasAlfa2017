<%@page import="br.com.chiquitto.aula.jdbcblog.dao.CategoriaDao"%>
<%@page import="br.com.chiquitto.aula.jdbcblog.vo.Categoria"%>
<%@page import="util.Util"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    String erro = "";
    
    String categoria = "";
    
    if (request.getMethod() == "POST") {
        
        categoria = request.getParameter("categoria");
        
        if (categoria.isEmpty()) {
            erro = "Categoria deve ser preenchida";
        }
        
        if (erro.isEmpty()) {
            Util.iniciarConexao();
            
            Categoria categoriaVo = new Categoria();
            categoriaVo.setCategoria(categoria);
            
            CategoriaDao dao = new CategoriaDao();
            dao.cadastrar(categoriaVo);
            
            response.sendRedirect("categorias.jsp");
        }
        
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categoria - Cadastrar</title>
        
        <%@ include file="css.jsp" %>
    </head>
    <body>
        <h1>Cadastrar categoria</h1>
        
        <%@ include file="menu.jsp" %>

        <% if (erro.isEmpty() == false) {%>
        <p>ERRO: <%= erro %></p>
        <% }%>

        <form method="POST">
            <p>Categoria: <input type="text" name="categoria" /></p>
            <p><input type="submit" value="Salvar" /></p>
        </form>
    </body>
</html>

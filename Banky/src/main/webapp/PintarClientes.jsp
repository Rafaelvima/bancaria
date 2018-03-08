<%-- 
    Document   : PintarClientes.jsp
    Created on : Mar 8, 2018, 6:42:11 PM
    Author     : Rafa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <h1>ALUMNOS</h1>
        
        <table border="1">
             <tr> 
                    <td>
                        ID_parada
                    </td>
                    <td>
                        Tiempo restante
                    </td>
                        
                    <td>
                      Distancia
                    </td>

                    <td>
                        Tipo de posicion
                        </td>
                    </tr>
            <c:forEach items="${clientes}" var="cliente">  
                <tr> 
                    <td>
                      ${cliente.cl_dni}
                    </td>
                    <td>
                        ${cliente.cl_nom}
                    </td>
                       
                    </tr>


            </c:forEach> 

        </table>
        <form action="clientes" method="GET">
            <input type="hidden" id="idalumno" name="idalumno"/>
            <input type="hidden" id="op" name="op" value="insertar"/>
            
            <input type="text" id="nombre" name="nombre" size="12"/>
            <button onclick="valor();" value="submit" >
                submit </button>
        </form>
        <script>
              function valor(){
                  document.getElementById("op").value="insertar";
              }  
                </script>
    </body>
</html>

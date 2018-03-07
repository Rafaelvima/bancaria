<%-- 
    Document   : newjsp
    Created on : Feb 1, 2018, 7:29:33 PM
    Author     : Rafa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <link rel="stylesheet/css" type="text/css" href="css/estilo.css" />
        <link rel="stylesheet/less" type="text/css" href="css/estilo.less">
        <script src="//cdnjs.cloudflare.com/ajax/libs/less.js/3.0.0/less.min.js" ></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script>

            function cargarAlumno(id, nombre, fecha, mayor) {
                document.getElementById("nombre").value = nombre;
                document.getElementById("idalumno").value = id;
                document.getElementById("fecha").value = fecha;
                document.getElementById("mayorEdad").checked = mayor;

            }
            function iniciarSesion(){
                var numCuenta=document.getElementById("num_cuenta").value;
                var dn1=document.getElementById("dni1").value;
                var dn2=document.getElementById("dni2").value;
                $.ajax({
                    type:"POST",
                    url:"http://localhost:8083/Banky/clientes",
                    data:$("#form1").serialize(),
                        success : function (data){
                            
                        }
                    
                })
            }
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form id="form1" action="clientes">
        <input id="num_cuenta" value="1234567890">
        <input id="dni1" value="12345678j">
        <input id="dni2" value="12345678j">
        <input type="button" id="op" value="iniciarS" onclick="iniciarSesion();">
        </form>
    </body>
</html>

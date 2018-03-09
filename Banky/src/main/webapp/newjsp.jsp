<%-- 
    Document   : newjsp
    Created on : Feb 1, 2018, 7:29:33 PM
    Author     : Rafa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    
    <head>
        <link rel="stylesheet/css" type="text/css" href="css/estilo.css" />
        <link rel="stylesheet/less" type="text/css" href="css/estilo.less">
        <script src="//cdnjs.cloudflare.com/ajax/libs/less.js/3.0.0/less.min.js" ></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
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
                $.ajax({
                    type:"POST",
                    url:"http://localhost:8080/Banky/clientes",
                    data:$("#form1").serialize(),
                        success : function (data){
                            alert (data);
                        }
                    
                })
            }
            function verMovimiento(){
                $.ajax({
                    type:"POST",
                    url:"http://localhost:8080/Banky/movimientos",
                    data:$("#form2").serialize(),
                        success : function (data){
                           $("#output").append(data);
                        }
                    
                })
            }
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form id="form1" action="clientes">
            <input type="hidden" value="iniciarS" id="op">
        <input id="num_cuenta" value="1234567890">
        <input id="dni1" value="12345678j">
        <input id="dni2" value="12345678j">
        <button id="op" name ="op" value="all"> all </button>
        <input type="button"  onclick="iniciarSesion();">
        </form>
        <form id="form2" action="movimientos">
        <input type="hidden" value="ver" name="op" id="op">
        <input id="mo_ncu" name="mo_ncu" value="0000000011">
        <input id="fechaini" name="fechaini" type="date" >
        <input id="fechafin" name="fechafin" type="date">
        <input type="button" value="ver" onclick="verMovimiento();">
        </form>
        <div id="output"></div> 
    </body>
</html>

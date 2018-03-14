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
           <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="js/jscript.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/less.js/3.0.0/less.min.js" ></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:bisque">  
        <div class="container" ><br>
            <h1>Ahora se encuentra en el menu de inicio</h1><br><hr>
            <div class="row">
                <div class="col">
                    <h3 style="color:green">¿Donde vamos ahora Sr/Sra?</h3><br>     
                    <h3 style="color:yellowgreen">Recomendacion: <a href="abrircuenta.jsp">abrir una cuenta</a></h3><br>
                    <h2 class="form-control"><a href="movimientos.jsp">¿Quiere consultar movimientos?</a></h2>
                    <h2  class="form-control"><a href="ingren.jsp">¿Quiere hacer un ingreso o reintegro?</a></h2>
                    <h2 class="form-control"><a class="nova" href="cerrarcuenta.jsp">¿Quiere cerrar alguna cuenta?</a></h2>
                    <h2 class="form-control"><a href="abrircuenta.jsp">¿Quiere abrir una cuenta?</a></h2>
                    
                    <br class="form-control"><hr>
                    <h3 style="color:yellowgreen">Una vez salga no podra regresar  asegurese de que de verdad desea <a href="adios.jsp" style="color:red" >cerrar sesion</a>
                    
                </div>
            </div>
        </div>               
    </body>
</html>

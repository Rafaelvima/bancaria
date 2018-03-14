<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="utils.Constantes" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="../css/estilos.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="../js/ingresoreintegro.js"></script>
        <title>Ingresos y Reintegros</title>     
        
    </head>
    
    <body>     
        <div class="container">
            <h1>INGRESOS Y REINTEGROS</h1> <br>
            <h4><a href="inicio.jsp">Volver</a></h4><hr><br>
            <div class="row">
                <form id="formingrein" methos="post" class="col-12">
                    <h2 style="color:green">¿Y ahora que hacemos figura?</h2><br>
                         <label class="btn btn-primary active">
    <input type="radio" name="options" id="option1" autocomplete="off" checked> Ingresar
  </label>
  <label class="btn btn-primary">
    <input type="radio" name="options" id="option2" autocomplete="off"> Retirar
  </label>
                        <table class="table table-striped ">
                            <tr>
                                <th colspan="2" class=table-info>
                                    DATOS PARA HACER COSAS
                                </th>
                            </tr>
                            <tr>
                                <td><label><b>nº Cuenta:</b></label></td>
                                <td><input type="text" id="numcuenta" name="numcuenta"/></td>
                            </tr>
                            <tr>
                                <td><label><b>Importe:</b></label></td>
                                <td><input type="text" id="importe" name="importe"/></td>
                            </tr>
                            <tr>
                                <td><label><b>Descripción:</b></label></td>
                                <td><textarea rows="5" id="descripcion" name="descripcion" required></textarea></td>
                            </tr>
                        </table> 
                    <input type="button" class="btn btn-success" value="Enviar solicictud"/>
                </form>
                                 
            </div>           
        </div> 
    </body>
</html>
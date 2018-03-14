<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <script src="../js/cerrarcuenta.js"></script>
        <title>Cerrar Cuenta</title>
    </head>
    <body style="background-color:burlywood ">
          <div class="container">
            <h1>CERRAR CUENTA</h1><br><hr> 
            <h4><a href="index.jsp">Volveral menu de inicio</a></h4><hr><br>
            <div class="row">
                <form id="formadd" methos="get" class="col-12"><br><br>
                   <br>
                    <div style="clear:left">
                    <table class="table table-striped">
                        <tr>
                            <th class="table-dark"  colspan="2">DATOS DE LA CUENTA A CERRAR</th>
                        </tr>
                        <tr>
                            <td>DNI:</td>
                            <td><input type="text" id="dni" name="dni" size="12"/></td>
                        </tr>
                        <tr>
                            <td>Nombre:</td>
                            <td><input type="text" id="nombre" name="nombre" size="12"/></td>
                        </tr>
                        <tr>
                            <td>Password:</td>
                            <td><input type="password" id="password" name="password"/></td>
                        </tr>
                        <tr>
                            <td>Nº De Cuenta:</td>
                            <td><input type="text" id="correo" name="correo"/></td>
                        </tr>                         
                    </table> 
                        <h1>UNA VEZ PULSES EL BOTON YA NO HABRA MARCHA ATRAS</h1> 
                        <button class="btn btn-success" value="registrar" name="op">Cerrar CUENTA</button>
                    </div >
                </form>
                 <h2><a href="adios.jsp" style="color:red">Cerar Sesion</a></h2>            
            </div>
        </div>
    </body>
</html>

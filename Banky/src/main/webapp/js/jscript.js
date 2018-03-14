/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validar() {
    var dentro = true;   
    var cuenta = $("#numcuenta").val();
    var dni1= $("#dni1").val();
    var dni2= $("#dni2").val();
    var importe=$("#importe").val();
    var suma = 0;    
    for (var i = 0; i < cuenta.length - 1; i++) {
        suma += parseInt(cuenta.charAt(i));
    }
    if (!/^[0-9]{10}$/.test(cuenta)) 
    {
        dentro = false;
    }
    if (!/^[0-9]{8}[A-Z]{1}$/.test(dni1)) 
    {
        dentro=false;
    }
    if (!/^[0-9]{8}[A-Z]{1}$/.test(dni2)) {
        dentro=false;
    }
    if (!((suma % 9) == (cuenta.charAt(cuenta.length - 1)))) {
        dentro = false;
    }
    if (importe<0){
        dentro=false;
    }
    return dentro;
}
var pasa =validar();
function verMovimiento() {
                $.ajax({
                    type: "POST",
                    url: "http://localhost:8083/Banky/movimientos",
                    data: $("#form2").serialize(),
                    success: function (data) {
                        $("#output").append(data);
                    }

                })
            }
            function abrirCuenta() {
                if(pasa)
                $.ajax({
                    type: "POST",
                    url: "http://localhost:8083/Banky/cuentas",
                    data: $("#form3").serialize(),
                    success: function (data) {
                        $("#output").append(data);

                    }
                })
            }
            function crearCliente() {
                $.ajax({
                    type: "POST",
                    url: "http://localhost:8083/Banky/clientes",
                    data: $("#form1").serialize(),
                    success: function (data) {
                        $("#output").append(data);
                    }
                })
            }
            function verCuenta() {
                $.ajax({
                    type: "POST",
                    url: "http://localhost:8083/Banky/movimientos",
                    data: $("#form2").serialize(),
                    success: function (data) {
                        $("#output").append(data);
                    }

                })
            }
            function ingresarono() {
                if (document.getElementById("ingresar").checked == checked) {
                    $.ajax({
                        type: "POST",
                        url: "http://localhost:8083/Banky/movimientos",
                        data: {mo_ncu: document.getElementById("mo_nocu").value,
                            cu_sal: document.getElementById("cu_sal").value,
                            op: "ingresar"},
                        success: function (data) {
                            $("#output").append(data);
                        }

                    })
                } else {
                    if (document.getElementById("retirar").checked == checked) {
                        $.ajax({
                            type: "POST",
                            url: "http://localhost:8083/Banky/movimientos",
                            data: {mo_ncu: document.getElementById("mo_nocu").value,
                                cu_sal: document.getElementById("cu_sal").value,
                                op: "retirar"},
                            success: function (data) {
                                $("#output").append(data);
                            }

                        })
                    } else {
                        alert("selecciona retirar o ingresar");
                    }

                }


            }

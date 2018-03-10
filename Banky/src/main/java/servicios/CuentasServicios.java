/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dao.CuentasDAO;
import java.util.List;
import model.Cuenta;

/**
 *
 * @author Rafa
 */
public class CuentasServicios
{

    public Cuenta existeCuenta(String numerocu) {
       CuentasDAO dao = new CuentasDAO();
       return dao.existeCuenta(numerocu);
    }


}

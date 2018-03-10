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

    public void addCuenta(String numerocu, String dn1cu, String dn2cu, int salariocu) {
       CuentasDAO dao = new CuentasDAO();
       dao.addCuenta(numerocu,dn1cu,dn2cu,salariocu);
    }

    public void addCuenta2(String numerocu, String dn1cu, int salariocu) {
       CuentasDAO dao = new CuentasDAO();
       dao.addCuenta2(numerocu,dn1cu,salariocu);
    }
    public boolean updateSalCliente(Cuenta c,String a, int b) {
        CuentasDAO dao = new CuentasDAO();
       return dao.updateSalCliente(c,a,b);
    }


}

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

    public List<Cuenta> getAllCuentas()
    {
        CuentasDAO dao = new CuentasDAO();

        return dao.getAllCuentas();
    }

    public Cuenta addAsig(Cuenta cuentaNuevo)
    {
        CuentasDAO dao = new CuentasDAO();

        return dao.addAsig(cuentaNuevo);
    }

    public void delAsig(Cuenta cuentaNuevo)
    {
        CuentasDAO dao = new CuentasDAO();

        dao.delAsig(cuentaNuevo);
    }

    public void updateAsig(Cuenta cuentaNuevo)
    {
        CuentasDAO dao = new CuentasDAO();

        dao.updateAsig(cuentaNuevo);
    }

}
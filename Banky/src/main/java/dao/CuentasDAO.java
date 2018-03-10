/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cuenta;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author rafa
 */
public class CuentasDAO {

    public Cuenta existeCuenta(String numerocu) {
        Cuenta ce=null;
          try {
              JdbcTemplate jtm = new JdbcTemplate(DBConnection.getInstance().getDataSource());
        ce =  (Cuenta) jtm.queryForObject("select * from cuentas where cu_ncu=? ",new Object[]{numerocu},new BeanPropertyRowMapper(Cuenta.class));
            
        } catch (Exception ex) {
            Logger.getLogger(CuentasDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return ce;
    }

    public boolean addCuenta2(String numerocu, String dn1cu, int salariocu) {
        int filas;
        try {
            String sql = "insert into cuentas (cu_ncu,cu_dn1,cu_sal) values(?,?,?)";
            JdbcTemplate jtm = new JdbcTemplate(DBConnection.getInstance().getDataSource());
            filas = jtm.update(sql, numerocu,dn1cu,salariocu);
        } catch (DataAccessException e) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        if(filas>0){
            return true;
        }else
        return false;
    }

    public boolean addCuenta(String numerocu, String dn1cu, String dn2cu, int salariocu) {
        int filas;
        try {
            String sql = "insert into cuentas (cu_ncu,cu_dn1,cu_dn2,cu_sal) values(?,?,?,?)";
            JdbcTemplate jtm = new JdbcTemplate(DBConnection.getInstance().getDataSource());
            filas = jtm.update(sql, numerocu,dn1cu,dn2cu,salariocu);
        } catch (DataAccessException e) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        if(filas>0){
            return true;
        }else
        return false;
    }
    public boolean updateSalCliente(Cuenta c,String a, int b) {
         int filas;
        try {
            String sql = "update clientes set cl_sal=? where cl_ncu=?";
            JdbcTemplate jtm = new JdbcTemplate(DBConnection.getInstance().getDataSource());
            filas = jtm.update(sql,c.getCu_sal()+b , a);
        } catch (DataAccessException e) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        if(filas>0){
            return true;
        }else
        return false;
    }
    
}

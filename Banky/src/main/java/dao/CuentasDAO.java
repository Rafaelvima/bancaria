/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cuenta;
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
    
}

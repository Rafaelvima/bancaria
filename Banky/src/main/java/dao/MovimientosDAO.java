/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Movimiento;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author rafa
 */
public class MovimientosDAO {
    
    public List<Movimiento> verMovimiento(String a, String b, String c){
        List<Movimiento> mv = new ArrayList<>();
          try {
              JdbcTemplate jtm = new JdbcTemplate(DBConnection.getInstance().getDataSource());
        mv = jtm.query("Select * from movimientos where mo_ncu = ? and mo_fec between ? and ?",new BeanPropertyRowMapper(Movimiento.class),a,b,c);
            
        } catch (Exception ex) {
            Logger.getLogger(MovimientosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mv;
    }

    public boolean ingresar(String a, Date b, int c) {
     
         int filas;
        try {
            String sql = "update movimientos set mo_fec=? and mo_imp=? where mo_ncu=? ";
            JdbcTemplate jtm = new JdbcTemplate(DBConnection.getInstance().getDataSource());
            filas = jtm.update(sql,b ,c, a);
        } catch (DataAccessException e) {
            Logger.getLogger(MovimientosDAO.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
        if(filas>0){
            return true;
        }else
        return false;
    
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Date;
import model.Movimiento;
import dao.MovimientosDAO;
import java.util.List;


/**
 *
 * @author Rafa
 */
public class MovimientosServicios
{

    public String verMovimientos(String mo_ncu, String fechaDate1, String fechaDate2) {
        MovimientosDAO dao = new MovimientosDAO();
        List<Movimiento> lista2 = (List) dao.verMovimiento(mo_ncu,fechaDate1,fechaDate2);
        String devolver="<h1>movimientos</h1>"
                + "<table border=1> <tr><th>Numero de cuenta</th> <th>Fecha </th> "
                + "<th>Tipo de movimiento</th>"+ "<th>Importe del movimiento</th>";
        for(int i=0;i<lista2.size();i++){
            devolver+="<tr> <td>"+lista2.get(i).getMo_ncu()+"</td> <td>"
                    +lista2.get(i).getMo_fec()+"</td><td>"+lista2.get(i).getMo_des()+
                    "</td><td>"+lista2.get(i).getMo_imp()+ "</td> </tr>";
        }
        devolver +="</table>";
        return devolver;
    }
    public boolean ingresar(String a, Date b,int c){
        MovimientosDAO dao = new MovimientosDAO();
        return dao.ingresar(a,b,c);
    }

   
}

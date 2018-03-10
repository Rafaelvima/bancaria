/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cuenta;
import model.Movimiento;
import servicios.CuentasServicios;
import servicios.MovimientosServicios;

/**
 *
 * @author rafa
 */
@WebServlet(name = "Movimientos", urlPatterns = {"/secure/movimientos","/rest/movimientos"})
public class Movimientos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException { 
        Movimiento m = new Movimiento();
        LocalDate local = LocalDate.of(1910, Month.MARCH, 12);
        CuentasServicios cus = new CuentasServicios();
        MovimientosServicios ms = new MovimientosServicios();
        String op = request.getParameter("op");
        String mo_ncu = request.getParameter("mo_ncu");
        String cu_sal = request.getParameter("cu_sal");
        int pasta= Integer.parseInt(cu_sal);
        String fechaini = request.getParameter("fechaini");
        String fechafin = request.getParameter("fechafin");
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Cuenta existecu=cus.existeCuenta(mo_ncu);
        switch (op)
        {
            case "ver":
               String mismovis = ms.verMovimientos(mo_ncu,fechaini,fechafin);
                response.getWriter().write(mismovis);
               
                break;

            case "ingresar":
              
                if(  ms.ingresar(mo_ncu, Date.from(local.atStartOfDay().toInstant(ZoneOffset.UTC)), pasta) && cus.updateSalCliente(existecu,mo_ncu,  pasta))
                        response.getWriter().write("<h1>ingresado correctamente</h1>");
                else  response.getWriter().write("<h1>erro al ingresar</h1>");
                break;
            case "retirar":
             if( ms.ingresar(mo_ncu, Date.from(local.atStartOfDay().toInstant(ZoneOffset.UTC)), pasta*-1) && cus.updateSalCliente(existecu,mo_ncu,  pasta*-1))
                        response.getWriter().write("<h1>ingresado correctamente</h1>");
                else  response.getWriter().write("<h1>erro al retirar</h1>");
               
                break;
            default:


        }
      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Movimientos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Movimientos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

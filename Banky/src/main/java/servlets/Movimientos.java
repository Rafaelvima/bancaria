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
import model.Movimiento;

/**
 *
 * @author rafa
 */
@WebServlet(name = "Movimientos", urlPatterns = {"/movimientos"})
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
        //MovimientosServicios ms = new MovimientosServicios();
        String op = request.getParameter("op");
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String fecha = request.getParameter("fecha");
        String mayor = request.getParameter("mayor");
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        switch (op)
        {
            case "insert":
                Date fechaDate = format.parse(fecha);
            //    a.setNombre(nombre);
                if (fecha != null)
                {
                  //  a.setFecha_nacimiento(fechaDate);
                } else
                {
                    //a.setFecha_nacimiento(Date.from(local.atStartOfDay().toInstant(ZoneOffset.UTC)));
                }

                if ("on".equals(mayor))
                {
                  //  a.setMayor_edad(Boolean.TRUE);
                } else

                {
                    //a.setMayor_edad(Boolean.FALSE);
                }
                //as.addAlumno(a);
               
                break;

            case "delete":
                //a.setId(Long.parseLong(id));
                //as.delAlumno(a);

                break;
            case "update":
//                fechaDate = format.parse(fecha);
//                a.setId(Long.parseLong(id));
//                a.setNombre(nombre);
//                a.setFecha_nacimiento(fechaDate);
                if ("on".equals(mayor))
                {
//                    a.setMayor_edad(Boolean.TRUE);
                } else
                {
//                    a.setMayor_edad(Boolean.FALSE);
                }
//                as.updateAlumno(a);
                break;
            default:
                //request.setAttribute("alumnos", ms.getAllMovimientos());
                request.getRequestDispatcher("pintarListaAlumnos.jsp").forward(request, response);

        }
       // request.setAttribute("alumnos", as.getAllAlumnos());
        request.getRequestDispatcher("pintarListaAlumnos.jsp").forward(request, response);
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
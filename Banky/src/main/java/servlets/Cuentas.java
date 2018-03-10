/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import model.Cuenta;
import servicios.ClientesServicios;
import servicios.CuentasServicios;

/**
 *
 * @author rafa
 */
@WebServlet(name = "Cuentas", urlPatterns = {"/cuentas"})
public class Cuentas extends HttpServlet {

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
        Cuenta m = new Cuenta();
        LocalDate local = LocalDate.of(1910, Month.MARCH, 12);
        CuentasServicios cus = new CuentasServicios();
        ClientesServicios cls = new ClientesServicios();
        boolean cu_ncu_correcto = false;
        String op = request.getParameter("op");
        String numerocu = request.getParameter("cu_ncu");
        String ultimonum = numerocu.charAt(9)+"";
        int numeor=Integer.parseInt(ultimonum);
        int contador =0;        //123456789
//        for(int i=0;i<numerocu.length();i++){
//            if(i<numerocu.length()-1){
//            contador+=Integer.parseInt(numerocu.charAt(i)+"");
//            }
//            else{
//                if(contador%numerocu.length()==Integer.parseInt(ultimonum)){
//                    //numero de cuenta correcto
//                    cu_ncu_correcto=true;
//                }
//                else
//                    //numero de cuenta incorrecto
//                    cu_ncu_correcto=false;
//            }
//        }
        String dn1cu = request.getParameter("cu_dn1");
        String dn2cu = request.getParameter("cu_dn2");
        String salariocu = request.getParameter("cu_sal");
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        
        switch (op)
        {
            case "abrirCu":
                Cuenta existecu=cus.existeCuenta(numerocu);
                Cliente existecli=cls.existeCliente(dn1cu);
                String jsoncli = new Gson().toJson(existecli);
                 String jsoncuenta = new Gson().toJson(existecu);
                if(existecu !=null){
                    response.getWriter().write("<h1> esta cuenta ya existe prueba con otra </h1>");
                }
                else{
                    if(existecli!=null){
                        response.getWriter().write(jsoncli);
                    }
                    else{
                        response.getWriter().write("<h1> El cliente "+dn1cu+" no se encuentra en la base de datos, rellenar el formulario primero</h1>");
                    }
                }
                
               
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
              
                break;
            default:
                //request.setAttribute("alumnos", ms.getAllMovimientos());
                //request.getRequestDispatcher("pintarListaAlumnos.jsp").forward(request, response);

        }
       // request.setAttribute("alumnos", as.getAllAlumnos());
       // request.getRequestDispatcher("pintarListaAlumnos.jsp").forward(request, response);
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
            Logger.getLogger(Cuentas.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Cuentas.class.getName()).log(Level.SEVERE, null, ex);
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

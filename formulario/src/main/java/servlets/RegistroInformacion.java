/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author jl4ma
 */
public class RegistroInformacion extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistroInformacion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistroInformacion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String nombre = request.getParameter("name");
        String apellido = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String gender = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobbies");
        String incomeSource = request.getParameter("opciones");
        String income = request.getParameter("income");
        String age = request.getParameter("edad");
        String bio = request.getParameter("comentarios");
        StringBuilder validationErrors = new StringBuilder();
        
        if (nombre == null || nombre.trim().isEmpty()) {
            validationErrors.append("First name is required.\n");
        }
        if (email == null || email.trim().isEmpty()) {
            validationErrors.append("Email is required.\n");
        }
        if (password == null || password.trim().isEmpty()) {
            validationErrors.append("Password is required.\n");
        }
        if (confirmPassword == null || confirmPassword.trim().isEmpty()) {
            validationErrors.append("Confirm Password is required.\n");
        }
        if (gender == null) {
            validationErrors.append("Gender is required.\n");
        }
        if (incomeSource == null) {
            validationErrors.append("Source of income is required.\n");
        }
        if (age == null || age.trim().isEmpty()) {
            validationErrors.append("Age is required.\n");
        }
        if (bio == null || bio.trim().isEmpty()) {
            validationErrors.append("Bio is required.\n");
        }
        
        // Verificar si las contraseñas coinciden
        if (!password.equals(confirmPassword)) {
            validationErrors.append("Passwords do not match.\n");
        }

        // Si hay errores de validación
        if (validationErrors.length() > 0) {
            request.setAttribute("validationErrors", validationErrors.toString());
            request.getRequestDispatcher("/index.jsp").forward(request, response); 
        }else{
        // Carta de bienvenida
            try (PrintWriter out = response.getWriter()) {
                response.setContentType("text/html;charset=UTF-8");
                out.println("<html>");
                out.println("<head><title>Bienvenido</title></head>");
                out.println("<body>");
                out.println("<h1>BIENVENIDO " + nombre + " " + apellido + "</h1>");
                out.println("<p>Gracias por Registrarse</p>");
                out.println("<h2>Sus Datos:</h2>");
                out.println("<ul>");
                out.println("<li><strong>Nombre:</strong> " + nombre + "</li>");
                out.println("<li><strong>Apellido:</strong> " + apellido + "</li>");
                out.println("<li><strong>Email:</strong> " + email + "</li>");
                out.println("<li><strong>Género:</strong> " + (gender != null ? gender : "No especificado") + "</li>");
                out.println("<li><strong>Hobbies:</strong> " + (hobbies != null ? String.join(", ", hobbies) : "Ninguno") + "</li>");
                out.println("<li><strong>Fuente de Ingresos:</strong> " + incomeSource + "</li>");
                out.println("<li><strong>Ingreso:</strong> " + income + "</li>");
                out.println("<li><strong>Edad:</strong> " + age + "</li>");
                out.println("<li><strong>Bio:</strong> " + bio + "</li>");
                out.println("</ul>");
                out.println("</body>");
                out.println("</html>");
        }finally{
            
        }
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

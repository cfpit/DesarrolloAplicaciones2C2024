package ar.edu.centro8.ejercicio2.servlets;

import java.io.IOException;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/autos")
public class AutoServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //capturo los datos del formulario
        String marca = req.getParameter("marca");
        int modelo = Integer.parseInt(req.getParameter("modelo"));

        //regla de negocio
        String [] autos = {"ford","chevtolet","renault","fiat"};

        if (Arrays.asList(autos).contains(marca.toLowerCase()) && modelo >= 2014) {
            resp.getWriter().println("<h1>Marca: " + marca + " Modelo: " + modelo + "</h1>");
        } else {
            resp.getWriter().println("Marca o Modelo Incorrectos");
        }
    }
}


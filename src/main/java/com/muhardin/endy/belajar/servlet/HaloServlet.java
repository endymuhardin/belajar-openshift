package com.muhardin.endy.belajar.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.annotation.WebServlet;


@WebServlet("/halo")
public class HaloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
                                        throws IOException, ServletException {
        res.setContentType("text/html");
        
        PrintWriter output = res.getWriter();
        
        output.println("<!doctype html>");
        output.println("<html lang=\"en\">");
        output.println("<head><title>Halo Servlet</title></head>");
        output.println("<body>");
        output.println("<h1>HaloServlet</h1>");
        output.println("Waktu : "+new Date());
        output.println("</body>");
        output.println("</html>");
        
        output.flush();                                    
    }
}

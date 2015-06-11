package com.muhardin.endy.belajar.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import com.muhardin.endy.belajar.Todo;
import com.muhardin.endy.belajar.dao.TodoDao;


@WebServlet("/todo/list")
public class TodoListServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) 
                                        throws IOException, ServletException {
                                        
        // Koneksi database
        TodoDao td = new TodoDao();
                                        
        // Data yang akan ditampilkan
        List<Todo> daftarTodo = td.semuaTodo();
        
        // masukkan data ke request attribute
        req.setAttribute("todo", daftarTodo);
        
        // redirect ke tampilan
        String lokasiJsp = "/WEB-INF/jsp/todo/list.jsp";
        RequestDispatcher rd = req.getRequestDispatcher(lokasiJsp);
        rd.forward(req, res);                         
    }
}

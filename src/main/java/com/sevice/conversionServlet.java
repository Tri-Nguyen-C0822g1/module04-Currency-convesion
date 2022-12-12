package com.sevice;

import com.DAO.Convert;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "conversionServlet", value = "/conversions")
public class conversionServlet extends HttpServlet {
    Convert convert = new Convert();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double usd = 0;
        double result = 0;

        try {
            usd = Double.parseDouble(request.getParameter("usd"));
            result = convertUSDToVND(usd);
        } finally {
            request.setAttribute("usd", usd);
            request.setAttribute("result", result);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/index.jsp");
            requestDispatcher.forward(request, response);
        }
    }


    public double convertUSDToVND(double usd) {
        return usd * 23000;
    }
}

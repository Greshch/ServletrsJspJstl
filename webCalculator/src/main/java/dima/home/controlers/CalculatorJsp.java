package dima.home.controlers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/first")
public class CalculatorJsp extends HttpServlet {
    @Override
    public void init() throws ServletException {
        res = 0;
    }

    private double res;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("result", res);
        req.getRequestDispatcher("jsp/first.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double par1 = Double.parseDouble(req.getParameter("a"));
        double par2 = Double.parseDouble(req.getParameter("b"));
        String action = req.getParameter("do");
        if (action.equals("add")) {
            res = par1 + par2;
        } else if (action.equals("dif")) {
            res = par1 - par2;
        } else if (action.equals("pro")) {
            res = par1 * par2;
        } else if (action.equals("div")) {
            res = par1 / par2;
        }
        doGet(req, resp);
    }
}

package dima.home.controlers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/very")
public class VerySympleCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double param1 = Double.parseDouble(req.getParameter("a"));
        double param2 = Double.parseDouble(req.getParameter("b"));
        double res = 0;
        String action = req.getParameter("do");
        if (action.equals("add")) {
            res = param1 + param2;
        } else if (action.equals("dif")) {
            res = param1 - param2;
        } else if (action.equals("pro")) {
            res = param1 * param2;
        } else if (action.equals("div")) {
            res = param1 / param2;
        }
        resp.getWriter().write("<h1>" + param1 + " " + action + " " + param2 +  " = " + res + "</h1>");
    }
}

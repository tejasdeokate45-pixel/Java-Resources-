import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sum")
public class SumOfNumber extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int N1 = Integer.parseInt(req.getParameter("num1"));
        int N2 = Integer.parseInt(req.getParameter("num2"));
        int Sum = N1+N2;

        PrintWriter out = resp.getWriter();
        out.println("<h2>"+Sum+"</h2>");

    }
}

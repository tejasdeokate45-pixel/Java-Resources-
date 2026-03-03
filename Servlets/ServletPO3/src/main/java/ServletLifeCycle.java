import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletLifeCycle extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service methdo called : ");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Hello From Servlet Life Cycle</h2>");
    }
}

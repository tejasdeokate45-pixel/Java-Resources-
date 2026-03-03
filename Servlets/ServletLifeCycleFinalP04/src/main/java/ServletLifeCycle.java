import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.PrimitiveIterator;

public class ServletLifeCycle extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.print("Servlet Initialized : ");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.print("Service Method Called : ");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Servlet Life Cycle Running <h2>");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy Called : ");
    }
}

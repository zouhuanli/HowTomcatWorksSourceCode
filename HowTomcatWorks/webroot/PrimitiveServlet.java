import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class PrimitiveServlet implements Servlet {

    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }

    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        System.out.println("from service");
        PrintWriter out = response.getWriter();
        String respMsg = "HTTP/1.1 200 ok \r\n" +
                "Content-Type: text/html\r\n" +
                "\r\n" +
                "<html><h1></h1>" +
                "<body><p>Hello. Roses are red.</p></body></html>";
        out.println(respMsg);
        out.close();
    }

    public void destroy() {
        System.out.println("destroy");
    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }

}

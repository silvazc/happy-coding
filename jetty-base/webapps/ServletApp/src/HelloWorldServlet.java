import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
        String requestUrl = request.getRequestURI();
		String name = requestUrl.substring("/ServletApp/hello/".length());

		PrintWriter out = response.getWriter();
		out.println("<h1>Hello " + name + "</h1>");
		out.println("<p>Nice to meet you!</p>");
	}
}

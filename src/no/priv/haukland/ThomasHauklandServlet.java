package no.priv.haukland;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ThomasHauklandServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<!DOCTYPE html>");
		writer.println("<html lang=\"en\">");
		writer.println("<head>");
		writer.println("<meta charset=\"utf-8\">");
		writer.println("<title>Thomas Haukland sin fancy hjemmeside</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("Hallo verden");
		writer.println("</body>");
		writer.println("</html>");
	}
}

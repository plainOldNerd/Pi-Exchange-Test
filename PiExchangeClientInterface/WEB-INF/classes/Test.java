import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class Test extends HttpServlet {
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
 
      // Set the response MIME type of the response message
      response.setContentType("text/html");
      // Allocate a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();
 
      // Write the response message, in an HTML page
      try {
         out.printf("I can print the double quotation marks as such \"this is in " +
            " double quotation marks!\"");
      } finally {
         out.close();  // Always close the output writer
      }
   }
}
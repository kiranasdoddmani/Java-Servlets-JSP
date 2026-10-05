
/*
In Servlet We Use [ org.apache.maven.archetypes:maven-archetype-webapp ]
 not quick-Start Maven Archetype

  A Servlet is a server-side Java program that handles client requests and generates dynamic responses

    HttpServelt:-
    HttpServlet is a class used to create Servlets that handle HTTP requests and send HTTP responses to the client
     HttpServlet provides methods that help us handle browser requests like GET and POST

 text/html;charset=UTF-8 :-
    tells the browser what type of data the Servlet is sending and how to interpret the text

          UTF-8 :- which character encoding to use
          text/html :- The response contains HTML code

  PrintWriter out = res.getWriter(); :-
   This line is used to send output from your Servlet to the browser


  index.jsp :-
   JSP is a technology used to create dynamic web pages using HTML with Java/server-side features

 */

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
 protected void doget(HttpServletRequest req, HttpServletResponse res) throws IOException {
     res.setContentType("text/html;charset=UTF-8");

     PrintWriter out = res.getWriter();

     out.println("<!DOCTYPE html>");
     out.println("<html>");
     out.println("<head>");
     out.println("<title>My First Servlet</title>");
     out.println("</head>");

     out.println("<body>");

     out.println("<h1>Welcome to Servlet</h1>");
     out.println("<p>This HTML page is created using Servlet.</p>");

     out.println("</body>");
     out.println("</html>");
 }
}

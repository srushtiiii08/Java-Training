package com.techlabs.test;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Session")
public class SessionDemo extends HttpServlet {

    public void doGet(HttpServletRequest request,
                     HttpServletResponse response)
        throws ServletException, IOException
    {
        HttpSession session = request.getSession(true);

        Date createTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());

        String title = "Welcome to Servlet demo";
        Integer visitCount = 0;
        String visitCountKey = "visitCount";
        String userIDKey = "userID";
        String userID = "Admin";

        if (session.isNew()) {
            title = "Welcome to Servlet demo";
            session.setAttribute(userIDKey, userID);
        } else {
            Integer prevCount = (Integer)session.getAttribute(visitCountKey);
            if (prevCount != null) {
                visitCount = prevCount + 1;
            } else {
                visitCount = 1;
            }
            userID = (String)session.getAttribute(userIDKey);
        }

        session.setMaxInactiveInterval(300);  // 5 minutes

        // Check if the visitCount has reached 5
        if (visitCount >= 5) {
            session.invalidate(); // Invalidate session
            // Generate a response for session expiry
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Session Expired!</h1>");
            out.println("<p>Your session has been destroyed after 5 visits or 5 minutes of inactivity.</p>");
            out.println("</body></html>");
            return; // End processing
        } else {
            session.setAttribute(visitCountKey, visitCount);
        }

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 "
                         + "transitional//en\">\n";

        out.println(
            docType + "<html>\n"
            + "<head><title>" + title + "</title></head>\n"
            + "<body bgcolor = \"#f0f0f0\">\n"
            + "<h1 align = \"center\">" + title + "</h1>\n"
            + "<h2 align = \"center\">Session Information</h2>\n"
            + "<table border = \"1\" align = \"center\">\n"
            + "<tr bgcolor = \"#949494\">\n"
            + "  <th>Session info</th><th>value</th>"
            + "</tr>\n"
            + "<tr>\n"
            + "  <td>id</td>\n"
            + "  <td>" + session.getId() + "</td>"
            + "</tr>\n"
            + "<tr>\n"
            + "  <td>Creation Time</td>\n"
            + "  <td>" + createTime + "  </td>"
            + "</tr>\n"
            + "<tr>\n"
            + "  <td>Time of Last Access</td>\n"
            + "  <td>" + lastAccessTime + "</td>"
            + "</tr>\n"
            + "<tr>\n"
            + "  <td>User ID</td>\n"
            + "  <td>" + userID + "</td>"
            + "</tr>\n"
            + "<tr>\n"
            + "  <td>Number of visits</td>\n"
            + "  <td>" + visitCount + "</td>"
            + "</tr>\n"
            + "</table>\n"
            + "</body>"
            + "</html>");
    }
}

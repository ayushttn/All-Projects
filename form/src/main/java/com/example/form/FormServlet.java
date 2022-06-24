//package com.example.form;
//
//import org.springframework.stereotype.Controller;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class FormServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//
//        String firstName = req.getParameter("firstName");
//        String lastName = req.getParameter("lastName");
//        String age = req.getParameter("age");
//        String address = req.getParameter("address");
//        String gender = req.getParameter("gender");
//        out.println("<html><body>");
//        out.println("First Name: " + firstName + " <br>" +
//                    "Last Name: " + lastName + " <br>" +
//                    "Age: " + age + " <br>" +
//                    "Address: " + address + " <br>" +
//                    "Gender: " + gender + " <br>");
//        out.println("</body></html>");
//    }
//}

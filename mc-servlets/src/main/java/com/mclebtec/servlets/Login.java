package com.mclebtec.servlets;

import java.io.IOException;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

  public Login() {
    super();
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {

    response.getWriter().append("Served at: ").append(request.getContextPath());

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    final String username = request.getParameter("email");
    final String password = request.getParameter("password");
    System.out.println(username);
    System.out.println(password);

    if (username.equalsIgnoreCase("JAVA@GMAIL.COM") && password.equalsIgnoreCase("12345")) {

      System.out.println("Login Successful");
      System.out.println(request.getRequestURI());
      System.out.println(request.getRequestURL());
      System.out.println(Arrays.toString(request.getCookies()));
      System.out.println(request.getAttribute(getServletName()));
      System.out.println(request.getAttribute(getServletInfo()));
      String str = request.getRequestURL().toString();
      int index = str.lastIndexOf('/');
      System.out.println(str.substring(0, index));
      System.out.println(request.getDispatcherType());
      response.sendRedirect(str.substring(0, index) + "/dashboard");

    } else {

      response.sendRedirect("error.jsp");

    }

    doGet(request, response);
  }

}
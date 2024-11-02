package com.mclebtec.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Brian
 */
@Controller
public class LoginController {

  @RequestMapping("/")
  public String display() {
    return "index";
  }

  @RequestMapping("/login")
  public String login(final HttpServletRequest req, final Model model) {
    final String username = req.getParameter("username");
    final String password = req.getParameter("password");

    if (password.equals("admin")) {

      String msg = "Hello " + username;
      // add a message to the model
      model.addAttribute("message", msg);
      return "welcome";

    } else {

      String msg = "Sorry " + username + ". You entered an incorrect password";
      model.addAttribute("message", msg);
      return "errorPage";

    }
  }

  @RequestMapping("/hello")
  public String redirect() {
    return "viewPage";
  }

  @RequestMapping("/hello-again")
  public String helloAgain() {
    return "final";
  }

}

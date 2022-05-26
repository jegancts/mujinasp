package com.example.demo.sp;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @RequestMapping("/")
  public String index(Authentication authentication) {
    //return authentication == null ? "index" : "redirect:/user.html";
    return authentication.getPrincipal().toString();
  }

  @RequestMapping("/welcome1")
  public String test() {
    System.out.println("this is test welcome");
    return "welcome1";
  }

  @RequestMapping("/login1")
  public String login() {
    System.out.println("this is test welcome");
    return "Login Route works here";
  }

//  @GetMapping({"user", "/user.html"})
//  public String user(Authentication authentication, ModelMap modelMap) {
//    modelMap.addAttribute("user", authentication.getPrincipal());
//    System.out.println("user details :" + authentication.getPrincipal().toString());
//    return "user";

//  }

}

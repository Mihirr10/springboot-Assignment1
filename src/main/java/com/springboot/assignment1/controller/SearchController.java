package com.springboot.assignment1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class SearchController {

  @RequestMapping("/welcome")
  public String search() {
    return "index";
  }

  @RequestMapping("/search")
  public RedirectView Search(@RequestParam("query") String query) {

    String url = "https://www.google.com/search?q=" + query;
    RedirectView redirectView = new RedirectView();
    redirectView.setUrl(url);

    return redirectView;
  }


}

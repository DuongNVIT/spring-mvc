package com.duongnv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/input", method = RequestMethod.GET)
    public ModelAndView getInput(@RequestParam(defaultValue = "1") String param,
                                 Model model, HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("input");
        mav.addObject(param);
        return mav;
    }

}

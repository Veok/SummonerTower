package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Lelental on 13.02.2017.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }

}

package girardtechie.azurespringwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView Index(){
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }
}

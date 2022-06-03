package girardtechie.azurespringwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    public ModelAndView Index(){
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }
}

package girardtechie.azurespringwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {

    @GetMapping("/logout")
    public ModelAndView Logout(){
        ModelAndView model = new ModelAndView();
        model.setViewName("logout");
        return model;
    }
}

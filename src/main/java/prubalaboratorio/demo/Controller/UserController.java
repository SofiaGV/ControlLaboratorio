package prubalaboratorio.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import prubalaboratorio.demo.Constant.ViewConstants;

@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping("/cancel")
    public String cancel(){
        return "redirect:/users/showUsers";
    }

    @GetMapping("/index")
    public ModelAndView mostrarUsuarios(){
        int n=0;

        ModelAndView mav = new ModelAndView(ViewConstants.USERS);
        mav.addObject("users",n);


         return mav;
    }



}

package prubalaboratorio.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import prubalaboratorio.demo.Constant.ViewConstants;
import prubalaboratorio.demo.Service.UsuarioService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("usuarioServiceImpl")
    private UsuarioService userService;

    @GetMapping("/cancel")
    public String cancel(){
        return "redirect:/users/showUsers";
    }

    @GetMapping("/index")
    public ModelAndView mostrarUsuarios(){
        int n=0;

        ModelAndView mav = new ModelAndView(ViewConstants.USERS);
        mav.addObject("users",userService.listAllUsers());


         return mav;
    }



}

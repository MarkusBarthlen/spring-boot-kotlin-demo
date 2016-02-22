package hello

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class WelcomeController {

    @RequestMapping("/welcome")
    fun hello(model: Model): String {
        val data = arrayOf("ChenKan", "尘泥", "镍合金@Ni");
        model.addAttribute("data", data);
        return "welcome";
    }

}

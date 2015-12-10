package world.sai.misc.quickstart.sai01.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sai on 15. 12. 10..
 */
@Controller
public class IndexController {

    @RequestMapping(value={"/index.do", "/"})
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("name", "sai");
        return mav;
    }
}

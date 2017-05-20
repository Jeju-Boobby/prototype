package ac.kr.jejunu;

import ac.kr.jejunu.common.entity.App;
import ac.kr.jejunu.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by highdali on 2017. 4. 30..
 */

@Controller
public class HomeController {
    @Autowired
    private AppService appService;

    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        List<App> apps = appService.list();
        modelMap.addAttribute("applist", apps);
        return "index";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

}

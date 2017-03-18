package summonerTower.web.controllers;

import summonerTower.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Lelental on 13.02.2017.
 */
@Controller
@RequestMapping("/guides")
public class GuideController {


    private GuideService guideService;

    @Autowired
    public GuideController(GuideService guideService) {
        this.guideService = guideService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String guidesView() {
        return "guides";
    }

    @RequestMapping(value = {"all"}, method = RequestMethod.GET)
    public String build(Model model) {
        model.addAttribute("guideList", guideService.findAll());
        return "guidesAll";
    }
}

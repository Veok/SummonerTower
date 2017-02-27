package web.controller;

import dao.service.GuideService;
import data.BuildOfChampionRepository;
import domain.model.Guide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import java.util.List;

/**
 * @author Lelental on 13.02.2017.
 */
@Controller
@RequestMapping("/guides")
public class GuidesController {


    private GuideService guideService;

    @Autowired(required = true)
    public GuidesController(GuideService guideService) {
        this.guideService = guideService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String build(Model model) {
        model.addAttribute(guideService.findAll());
        return "guides";
    }
}

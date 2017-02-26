package web.controller;

import dao.GuideRepository;
import data.BuildOfChampionRepository;
import domain.model.Guide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

/**
 * @author Lelental on 13.02.2017.
 */
@Controller
@RequestMapping("/guides")
public class GuidesController {

    private BuildOfChampionRepository buildOfChampionRepository;

    @Inject
    private GuideRepository guideRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView displayForm() {
        return new ModelAndView("guide");
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ModelAndView addNewGuide() {
        Guide guide = new Guide();

        guideRepository.create(guide);
        return displayForm();

    }

    @RequestMapping(value = "out", method = RequestMethod.GET)
    private ModelAndView displayAll() {
        ModelAndView modelAndView = new ModelAndView("display");
        List<Guide> allData = guideRepository.getAll();
        modelAndView.addObject("data", allData);
        return modelAndView;
    }

    @Autowired
    public GuidesController(BuildOfChampionRepository buildOfChampionRepository) {
        this.buildOfChampionRepository = buildOfChampionRepository;
    }


    @RequestMapping(method = RequestMethod.GET)
    public String build(Model model) {
        model.addAttribute(buildOfChampionRepository.findBuild());
        return "guides";
    }
}

package web.controller;

import data.BuildOfChampionRepository;
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
public class GuidesController {

    private BuildOfChampionRepository buildOfChampionRepository;

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

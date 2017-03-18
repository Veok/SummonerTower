package summonerTower.web.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import summonerTower.service.ChampionService;

/**
 * @author Lelental on 16.02.2017.
 */
@Controller
@RequestMapping("/champions")
public class ChampionController {


    private ChampionService championService;

    @Autowired
    public ChampionController(ChampionService championService) {
        this.championService = championService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String championView() {
        return "champions";
    }

    @RequestMapping(value = {"/all"}, method = RequestMethod.GET)
    public String build(Model model) {
        model.addAttribute(championService.findAll());
        return "allChampions";
    }


}

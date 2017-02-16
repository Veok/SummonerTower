package web;

import data.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Lelental on 16.02.2017.
 */
@Controller
@RequestMapping("/champions")
public class ChampionController {

    private ChampionRepository championRepository;

    @Autowired
    public ChampionController(ChampionRepository championRepository) {
        this.championRepository = championRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String champion(Model model) {
        model.addAttribute(championRepository.championList());
        return "champions";
    }
}

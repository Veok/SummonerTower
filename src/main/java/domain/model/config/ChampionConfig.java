package domain.model.config;

import domain.model.Attributes;
import domain.model.Skill;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Lelental on 09.02.2017
 */
@Configuration
@ComponentScan(basePackages = "domain.model")
public class ChampionConfig {

    @Bean
    public Attributes attributesOfChampion() {
        return new Attributes();
    }

    @Bean
    public List<Skill> skills() {
        return new ArrayList<Skill>();
    }
}

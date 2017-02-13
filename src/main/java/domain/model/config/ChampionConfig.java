package domain.model.config;

import domain.model.champion.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.inject.Named;

/**
 * @author : Lelental on 09.02.2017
 */
@Configuration
@ComponentScan(basePackages = "domain.model.champion")
public class ChampionConfig {

    @Bean
    public AttributesOfChampion attributesOfChampion() {
        return new AttributesOfChampion();
    }

    @Bean
    @Named("skill")
    public Skill passiveSkill(){
        return new Skill();
    }

    @Bean
    public ActiveSkill activeSkill(){
        return new ActiveSkill();
    }

    @Bean
    public Role role(){
        return Role.adcarry;
    }

    @Bean
    public Position position(){
        return Position.bot;
    }
}

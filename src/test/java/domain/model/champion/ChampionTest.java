package domain.model.champion;

import domain.model.config.ChampionConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: Lelental on 09.02.2017
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ChampionConfig.class)
public class ChampionTest {


    @Autowired
    private Champion champion;

    @Test
    public void championShouldNotBeNull() {
        assertNotNull(champion);

    }


}
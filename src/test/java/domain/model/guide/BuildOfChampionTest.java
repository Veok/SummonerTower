package domain.model.guide;


import domain.model.config.BuildOfChampionConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


/**
 * @author : Lelental on 11.02.2017
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BuildOfChampionConfig.class)
public class BuildOfChampionTest {


    @Autowired
    private BuildOfChampion buildOfChampion;

    @Test
    public void buildShouldNotBeNull() {
        assertNotNull(buildOfChampion);
    }


}
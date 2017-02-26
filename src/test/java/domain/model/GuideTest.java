package domain.model;


import domain.model.Guide;
import domain.model.config.GuideConfig;
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
@ContextConfiguration(classes = GuideConfig.class)
public class GuideTest {


    @Autowired
    private Guide guide;

    @Test
    public void buildShouldNotBeNull() {
        assertNotNull(guide);
    }


}
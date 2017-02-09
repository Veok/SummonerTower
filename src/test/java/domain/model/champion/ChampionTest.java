package domain.model.champion;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
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

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    @Autowired
    private Champion champion;

    @Test
    public void championShouldNotBeNull() {
        assertNotNull(champion);
    }



}
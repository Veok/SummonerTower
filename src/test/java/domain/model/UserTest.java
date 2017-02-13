package domain.model;

import domain.model.config.UserConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author Lelental on 13.02.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserConfig.class)
public class UserTest {

    @Autowired
    private User user;

    @Test
    public void ifUserExists() {
        assertNotNull(user);
    }
}
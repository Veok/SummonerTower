package domain.model.guide;

import data.BuildOfChampionRepository;
import domain.model.config.BuildOfChampionConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import web.BuildOfChampionController;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * @author: Lelental on 11.02.2017
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

    @Test
    public void shouldShowRecentBuild() throws Exception {
        List<BuildOfChampion> expectedBuild = createBuildList();
        BuildOfChampionRepository mockRepository = mock(BuildOfChampionRepository.class);
        when(mockRepository.findBuild())
                .thenReturn(expectedBuild);

        BuildOfChampionController buildOfChampionController = new BuildOfChampionController(mockRepository);
        MockMvc mockMvc = standaloneSetup(buildOfChampionController)
                .setSingleView(new InternalResourceView("/builds.jsp"))
                .build();

        mockMvc.perform(get("/builds"))
                .andExpect(view().name("builds"));


    }

    private List<BuildOfChampion> createBuildList() {
        List<BuildOfChampion> buildOfChampions = new ArrayList<BuildOfChampion>();
        for (int i = 0; i < 20; i++) {
            buildOfChampions.add(new BuildOfChampion());

        }
        return buildOfChampions;
    }
}
package web;

import data.BuildOfChampionRepository;
import domain.model.guide.BuildOfChampion;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @author Lelental on 15.02.2017.
 */
public class BuildOfChampionControllerTest {


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
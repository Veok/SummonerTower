package web;

import data.BuildOfChampionRepository;
import domain.model.Guide;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import web.controller.GuidesController;

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
public class GuideControllerTest {


    @Test
    public void shouldShowRecentBuild() throws Exception {

        List<Guide> expectedBuild = createGuideList();
        BuildOfChampionRepository mockRepository = mock(BuildOfChampionRepository.class);
        when(mockRepository.findBuild())
                .thenReturn(expectedBuild);

        GuidesController guidesController = new GuidesController(mockRepository);
        MockMvc mockMvc = standaloneSetup(guidesController)
                .setSingleView(new InternalResourceView("WEB-INF/views/guides.jsp"))
                .build();

        mockMvc.perform(get("/guides"))
                .andExpect(view().name("guides"));


    }

    private List<Guide> createGuideList() {
        List<Guide> guides = new ArrayList<Guide>();
        for (int i = 0; i < 20; i++) {
            guides.add(new Guide());

        }
        return guides;
    }
}
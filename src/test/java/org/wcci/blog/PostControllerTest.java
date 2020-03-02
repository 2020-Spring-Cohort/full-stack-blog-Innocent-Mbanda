package org.wcci.blog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;
import org.wcci.blog.controllers.PostController;
import org.wcci.blog.models.Category;
import org.wcci.blog.models.Post;
import org.wcci.blog.storage.PostStorage;
import org.wcci.blog.storage.repositories.TagRepository;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

public class PostControllerTest {
    public MockMvc mockMvc;
    private PostController underTest;
    private PostStorage mockStorage;
    private Model mockMode1;
//    private TagRepository tagRepository;


    @BeforeEach
    public void setUP() {
        mockMode1 = mock(Model.class);
        mockStorage = mock(PostStorage.class);
        underTest = new PostController(mockStorage);
        mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();

    }


        @Test
       public void PostControllerShouldInstantiate () throws Exception {
            Category category = new Category();
            Post testPost = new Post(category,"testPostName","TestAuthorName");
            List<Post> postControllerCollection = Collections.singletonList(testPost);
            when(mockStorage.findAllPost()).thenReturn(postControllerCollection);
            mockMvc.perform(get("/post/id"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andExpect(view().name("post"))
                    .andExpect(model().attributeExists("post"))
                    .andExpect(model().attribute("post", postControllerCollection));

        }

        }




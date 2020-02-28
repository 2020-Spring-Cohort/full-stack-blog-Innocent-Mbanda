package org.wcci.blog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.ui.Model;
import org.wcci.blog.models.Category;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CategoryControllerTest {
    private MockMvc mockMvc;
    private CategoryControllerTest underTest;
    private CategoryStorage categoryStorage;
    private Model mockModel;
    private PostStorage postStorage;
    private AuthorStorage authorStorage;

    @BeforeEach
    public void SetUp() {
        mockModel = mock(Model.class);
        categoryStorage = mock(CategoryStorage.class);
        authorStorage = mock(AuthorStorage.class);
        postStorage = mock(PostStorage.class);
        underTest = new CategoryController(categoryStorage, authorStorage, postStorage);
//        mockMvc= MockMvcBuilder.standaloneSetup(underTest).build();
    }

    //        @Test
//         public void categoryControllerShouldInstantiate() throws Exception{
//            Category testCategory = new Category("why I chose wecancode it","innocent");
//            when(categoryStorage.findAllCategories()).thenReturn(categoryCollection);
//
//        }
//
    @Test
    public void shouldReturnViewWithOnePost() {
        Category testCategory = new Category("Why I Joined WeCanCodeIt?");
        when(categoryStorage.findPostByName("Why i joined WecancodeIT"));
        underTest.displaySinglePost()


    }
}

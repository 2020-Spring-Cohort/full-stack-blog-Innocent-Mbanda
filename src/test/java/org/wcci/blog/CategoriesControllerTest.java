package org.wcci.blog;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;
import org.wcci.blog.controllers.CategoriesController;
import org.wcci.blog.models.Category;
import org.wcci.blog.storage.AuthorStorage;
import org.wcci.blog.storage.CategoriesStorage;
import org.wcci.blog.storage.PostStorage;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;


public class CategoriesControllerTest {
    private MockMvc mockMvc;
    private CategoriesController underTest;
    private CategoriesStorage mockStorage;
    private Model mockModel;
    private PostStorage postStorage;
    private AuthorStorage authorStorage;



    @BeforeEach
    public void SetUp() {
        mockModel = mock(Model.class);
        mockStorage = mock(CategoriesStorage.class);
        authorStorage = mock(AuthorStorage.class);
        postStorage = mock(PostStorage.class);
        underTest = new CategoriesController (mockStorage);
        mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();

    }

            @Test
             public void categoryControllerShouldInstantiate() throws Exception {
                Category testCategory = new Category("Spring is hard");
                List<Category> categoryCollection = Collections.singletonList(testCategory);
                when(mockStorage.findAllCategories()).thenReturn((categoryCollection));
                when(mockStorage.findAllCategories()).thenReturn(categoryCollection);
                mockMvc.perform(get("/categories"))
                        .andDo(print())
                        .andExpect(status().isOk())
                        .andExpect(view().name("categoriesView"))
                        .andExpect(model().attributeExists("categories"))
                        .andExpect(model().attribute("categories", categoryCollection));
            }

            @Test
        public void shouldReturnViewWithOneCategory() {
                    Category testCategory = new Category("testName");
                    when(mockStorage.findCategoryByName("spring is hard")).thenReturn(testCategory);
                    underTest.displaySingleCategory("spring is hard", mockModel);
                    verify(mockStorage).findCategoryByName("spring is hard");
                    verify(mockModel).addAttribute("category", testCategory);
                }


//                @Test
//                    public void shouldReturnNamedCategoryWhenDisplaySignleCategory(){
//            String viewName =underTest.displaySingleCategory("categoryName", mockModel);
//            assertThat(viewName).isEualTo("Posts");
//
//                }
//            }



}

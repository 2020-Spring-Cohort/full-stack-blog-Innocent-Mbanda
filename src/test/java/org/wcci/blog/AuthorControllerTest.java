//package org.wcci.blog;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.ui.Model;
//import org.wcci.blog.models.Author;
//import org.wcci.blog.storage.AuthorStorage;
//
//import static org.mockito.Mockito.mock;
//
//public class AuthorControllerTest {
//    private MockMvc mockMvc;
//    private AuthorControllerTest underTest;
//    private AuthorStorage mockStorage;
//    private Model mockModel;
//
//    @BeforeEach
//
//  void setUp(){
//        mockModel = mock(Model.class);
//       mockStorage = mock(AuthorStorage.class);
//        underTest = new AuthorControllerTest(mockStorage);
//        mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
//    }
//    @Test
//    public void shouldReturnViewOfOneAuthor(){
//        Author testAuthor =new Author("authors");
//        when(mockStorage.findAuthorById(id)).thenReturn(testAuthor);
//
//    }
//
//}

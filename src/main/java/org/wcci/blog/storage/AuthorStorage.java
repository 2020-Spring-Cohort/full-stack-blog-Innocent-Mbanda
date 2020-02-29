package org.wcci.blog.storage;

import org.wcci.blog.models.Author;
import org.wcci.blog.models.Category;
import org.wcci.blog.models.Post;

public interface AuthorStorage {
    void store (Author authorToStore);


}

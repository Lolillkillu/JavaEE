package com.example.api.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import com.example.api.restapi.model.Post;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@WithMockUser
class PostServiceTest {

    @Autowired
    private PostService postService;

    @Test
    void shouldGetSinglePost() {
        Post singlePost = postService.getSinglePost(1L);
        assertThat(singlePost).isNotNull();
        assertThat(singlePost.getId()).isEqualTo(1L);
    }
}
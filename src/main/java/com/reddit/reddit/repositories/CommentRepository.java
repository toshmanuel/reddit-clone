package com.reddit.reddit.repositories;

import com.reddit.reddit.models.Comments;
import com.reddit.reddit.models.Post;
import com.reddit.reddit.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comments, Long> {
    List<Comments> findByPost(Post post);

    List<Comments> findAllByUser(User user);
}


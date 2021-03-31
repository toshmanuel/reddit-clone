package com.reddit.reddit.service;

import com.reddit.reddit.dto.RegisterRequest;
import com.reddit.reddit.exceptions.RedditException;
import com.reddit.reddit.models.User;
import org.springframework.transaction.annotation.Transactional;

public interface AuthService {
    @Transactional
    void signup(RegisterRequest registerRequest) throws RedditException;


    String generateVerificationToken(User user);

}

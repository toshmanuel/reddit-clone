package com.reddit.reddit.service;

import com.reddit.reddit.dto.RegisterRequest;
import com.reddit.reddit.models.User;
import org.springframework.transaction.annotation.Transactional;

public interface AuthService {
    @Transactional
    void signup(RegisterRequest registerRequest);


    String generateVerificationToken(User user);

}

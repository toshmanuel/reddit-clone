package com.reddit.reddit.service;


import com.reddit.reddit.dto.RegisterRequest;
import com.reddit.reddit.models.User;
import com.reddit.reddit.models.VerificationToken;
import com.reddit.reddit.repositories.UserRepository;
import com.reddit.reddit.repositories.VerificationTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    private final VerificationTokenRepository verificationTokenRepository;

    @Override
    public void signup(RegisterRequest registerRequest){
        User newUser = new User();

        newUser.setUsername(registerRequest.getUsername());
        newUser.setEmail(registerRequest.getEmail());
        newUser.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        newUser.setCreated(Instant.now());
        newUser.setEnabled(false);

        userRepository.save(newUser);

        String token = generateVerificationToken(newUser);

    }

    @Override
    public String generateVerificationToken(User user) {
        String token = UUID.randomUUID().toString();

        VerificationToken verificationToken = new VerificationToken();
        verificationToken.setToken(token);
        verificationToken.setUser(user);

        verificationTokenRepository.save(verificationToken);

        return token;
    }

}

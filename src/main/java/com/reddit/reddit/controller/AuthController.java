package com.reddit.reddit.controller;


import com.reddit.reddit.dto.RegisterRequest;
import com.reddit.reddit.exceptions.RedditException;
import com.reddit.reddit.service.AuthServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    AuthServiceImpl authServiceImpl;

    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) throws RedditException {
        authServiceImpl.signup(registerRequest);
        return new ResponseEntity<>("User Registration Successful", HttpStatus.OK);
    }


}

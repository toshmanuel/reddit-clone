package com.reddit.reddit.controller;


import com.reddit.reddit.dto.RegisterRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    public void signup(@RequestBody RegisterRequest registerRequest){

    }


}

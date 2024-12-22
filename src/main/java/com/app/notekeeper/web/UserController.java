package com.app.notekeeper.web;

import com.app.notekeeper.repository.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}

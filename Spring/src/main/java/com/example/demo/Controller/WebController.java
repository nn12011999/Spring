package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @PostMapping("/signin")
    public String signin(@RequestBody User user)
    {
        userRepository.save(user);
        return "success";
    }

    @GetMapping("/signin")
    public String sign() {

        return "index";
    }

}

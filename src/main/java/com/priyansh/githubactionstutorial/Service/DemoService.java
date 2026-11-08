package com.priyansh.githubactionstutorial.Service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String getDemoResults(String input) {
        return "Hi this is demo service with input "+input;
    }
}

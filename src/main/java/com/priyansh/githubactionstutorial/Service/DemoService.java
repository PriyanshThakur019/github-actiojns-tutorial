package com.priyansh.githubactionstutorial.Service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String getDemoResults() {
        return "Hi this is demo service v2 with input ";
    }
}

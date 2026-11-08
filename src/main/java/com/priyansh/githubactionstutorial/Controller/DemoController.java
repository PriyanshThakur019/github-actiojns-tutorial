package com.priyansh.githubactionstutorial.Controller;

import com.priyansh.githubactionstutorial.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/getDummyResult")
        public String getDummyResult(@RequestBody String input) {
        return demoService.getDemoResults(input);
    }
}

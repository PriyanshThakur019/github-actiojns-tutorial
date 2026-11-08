package com.priyansh.githubactionstutorial.Controller;

import com.priyansh.githubactionstutorial.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/getDummyResult")
    public ResponseEntity<String> getDummyResult() {
        return ResponseEntity
                .internalServerError()
                .body("Testing deployment rollback");
    }
}

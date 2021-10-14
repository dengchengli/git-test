package com.common.mod2.controller;



import com.common.mod1.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitTestController {

    @Autowired
    private TestService testService;
    @GetMapping("/test")
    public String firstRevert(){
        System.out.println("revert next");
        return testService.test();
    }
}

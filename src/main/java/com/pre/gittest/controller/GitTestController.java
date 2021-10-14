package com.pre.gittest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/git")
public class GitTestController {
    @GetMapping("/test")
    public String firstRevert(){
        System.out.println("revert next");
        return "success";
    }
}

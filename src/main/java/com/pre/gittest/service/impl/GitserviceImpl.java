package com.pre.gittest.service.impl;

import com.pre.gittest.service.GitService;

public class GitserviceImpl implements GitService {
    public String say(){
        System.out.println("say");
        return "";
    }

    public boolean check(){
        System.out.println("check");
        return true;
    }
}

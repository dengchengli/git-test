/**
 * File created at 2021-10-14 20:02:17
 * Copyright (c) 2021 linklogis.com all rights reserved.
 */

package com.common.mod1.impl;

import com.common.mod1.TestService;
import org.springframework.stereotype.Service;

/**
 * testService 实现类
 *
 * @Author dely
 * @Date 2021-10-14 20:02:17
 * @Version 1.0.0
 */

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return "success!";
    }
}
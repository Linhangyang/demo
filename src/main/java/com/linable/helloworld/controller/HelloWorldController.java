package com.linable.helloworld.controller;

import com.linable.helloworld.service.PushContext;
import com.linable.helloworld.service.impl.PushA;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author HangYang.Lin
 *         on 2017/5/9.
 */
@RestController
@Api(description = "课程类型管理")
public class HelloWorldController {



    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello,World!";
    }

    @RequestMapping(value = "/push", method = RequestMethod.GET)
    public String push(
        @RequestParam
        String title,
        @RequestParam
        String content,
        @RequestParam
        Map<String, String> extras,
        @RequestParam
        List<String> appIdList) {
        PushContext push = new PushContext(new PushA(appIdList, extras, content, title));
        push.push();
        return "Hello,World!";
    }

    @RequestMapping("/login")
    public String login() {
        return "Login";
    }

}

package com.linable.helloworld.controller;

import com.linable.helloworld.service.impl.PushA;
import com.linable.helloworld.service.PushContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author HangYang.Lin
 *         on 2017/5/9.
 */
@RestController
public class HelloWorldController {



    @RequestMapping("/index")
    public String sayHello() {
        return "Hello,World!";
    }

    @RequestMapping("/push")
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

}

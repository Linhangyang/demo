package com.linable.helloworld;

import com.linable.helloworld.controller.HelloWorldController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author HangYang.Lin
 *         on 2017/5/9.
 */
public class HelloWorldControllerTest {

    @Test
    public void testSayHello() {
        assertEquals("Hello,World!",new HelloWorldController().sayHello());
    }
}

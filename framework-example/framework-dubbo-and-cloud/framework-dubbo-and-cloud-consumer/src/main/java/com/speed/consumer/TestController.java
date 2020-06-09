package com.speed.consumer;

import com.speed.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jasonbiao
 * @date 2020-05-06 17:08
 * Description: <p>
 *
 * </p>
 */
@RestController
public class TestController {

    @Autowired
    private Application.EchoController echoController;

    @Reference
    private UserService userService;

    @GetMapping("/echo")
    public void echo() {
        echoController.echo();
    }

    @GetMapping("/userInfo")
    public String userInfo() {
       return userService.getUser();
    }
}

package com.app.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class MyController {

    @Value("${server.url:Unable to connect to config server}")
    private String url;

    @RequestMapping("/server/url")
    String getMsg() {
        return this.url;
    }

}

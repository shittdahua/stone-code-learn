package com.stone.code.learn.stonecode.demo;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo() {
        return JSON.toJSONString(this.getClass());
    }
}

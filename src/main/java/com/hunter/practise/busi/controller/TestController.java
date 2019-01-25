package com.hunter.practise.busi.controller;

import com.hunter.practise.busi.request.CheckUrlReq;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author 水木
 * @Date 2019-01-18  12:20
 */

@RestController
@RequestMapping("/test")
@Api(value = "TestController", description = "测试Controller")
public class TestController {

    @GetMapping("/check")
    public Object checkUrl() {
        System.out.println("test controller");
        return "success";
    }

    @PostMapping("/check1")
    public Object checkUrl1(String name, int age) {
        String hello = "name:" + name + "age:" + age;
        System.out.println(hello);
        return hello;
    }

    @PostMapping("/check2")
    public Object checkUrl2(@RequestBody @Valid CheckUrlReq checkUrlReq) {
        String hello = "name:" + checkUrlReq.getName() + "age:" + checkUrlReq.getAge();
        System.out.println(hello);
        return hello;
    }
}

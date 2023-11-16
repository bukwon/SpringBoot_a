package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Controller 기능
public class HelloController {
    @GetMapping("/hello")   // URL 연결
    @ResponseBody   // 메서드 응답 어노테이션
    public String hello() {
        return "Hello My name is you";
    }
}

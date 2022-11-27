package com.mobius.education.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("request/*")
public class RequestController {

//    강의 요청 목록
    @GetMapping("/list")
    public void list() {

    }

//    강의 상세 정보
    @GetMapping("/detail")
    public void detail() {

    }

//    강의 요청 작성
    @GetMapping("/ask")
    public void ask() {

    }

}

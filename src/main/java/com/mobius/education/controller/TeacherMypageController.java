package com.mobius.education.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("teacherMypage/*")
public class TeacherMypageController {

//    마이페이지
    @GetMapping("/mypage")
    public void mypage() {

    }

//    나의 강의 현황
    @GetMapping("/myLecture")
    public void myLecture() {

    }

//    진헹 중인 강의
    @GetMapping("/ongoingLecture")
    public void ongoingLecture() {

    }

//    진헹 예정 강의
    @GetMapping("/expectedLecture")
    public void expectedLecture() {

    }

//    강의 신청
    @GetMapping("/applyLecture")
    public void applyLecture() {

    }

//    나의 리뷰
    @GetMapping("/myReview")
    public void myReview() {

    }

//    나의 정보
    @GetMapping("/myInformation")
    public void myInformation() {

    }
}

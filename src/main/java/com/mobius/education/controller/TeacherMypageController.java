package com.mobius.education.controller;

import com.mobius.education.domain.vo.LectureVO;
import com.mobius.education.service.LectureService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("teacherMypage/*")
public class TeacherMypageController {
    private final LectureService lectureService;

//    마이페이지
    @GetMapping("/mypage")
    public void mypage(Model model) {
        model.addAttribute("countExpected", lectureService.countExpected());
        model.addAttribute("countFinished", lectureService.countFinished());
        model.addAttribute("countOngoing", lectureService.countOngoing());

    }

//    나의 강의 현황
    @GetMapping("/myLecture")
    public void myLecture() {

    }

//    진헹 중인 강의
    @GetMapping("/ongoing")
    public void ongoingLecture() {

    }

//    진헹 예정 강의
    @GetMapping("/expected")
    public void expectedLecture() {

    }

//    강의 신청
    @GetMapping("/apply")
    public void applyLecture(Model model) {
        model.addAttribute("apply", new LectureVO());
    }


    @PostMapping("/apply")
    public RedirectView applyLecture(LectureVO lectureVO, RedirectAttributes redirectAttributes){
        lectureVO.setLectureStatus("진행예정");
        lectureService.apply(lectureVO);
        return new RedirectView("/teacherMypage/mypage");
    }

//    나의 리뷰
    @GetMapping("/myReview")
    public void myReview() {

    }

//    나의 정보
    @GetMapping("/myInfo")
    public void myInformation() {

    }

}

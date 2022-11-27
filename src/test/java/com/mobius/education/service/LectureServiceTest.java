package com.mobius.education.service;

import com.mobius.education.domain.vo.LectureVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class LectureServiceTest {

    @Autowired
    private LectureService lectureService;

    @Test
    public void countExpectedTest() {
        log.info("ExpectedCount: " + lectureService.countExpected());
    }

    @Test
    public void countFinishedTest() {
        log.info("FinishedCount: " + lectureService.countFinished());
    }

    @Test
    public void countOngoingTest() {
        log.info("OngoingCount: " + lectureService.countOngoing());
    }

    @Test
    public void applyTest() {
        LectureVO lectureVO = new LectureVO();
        lectureVO.create("따라하며 배우는 리액트 A-Z", "프로그래밍", "이 강의를 통해 리액트 기초부터 중급까지 배우게 됩니다. 하나의 강의로 개념도 익히고 실습도 하며, 리액트를 위해 필요한 대부분의 지식을 한번에 습득할 수 있도록 만들었습니다.",
                "2022-11-29", Long.parseLong("10"), "Time c (19:00~22:00)", "진행예정");
        lectureService.apply(lectureVO);
    }
}
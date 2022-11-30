package com.mobius.education.service;

import com.mobius.education.domain.vo.LectureDTO;
import com.mobius.education.domain.vo.LectureFileVO;
import com.mobius.education.domain.vo.LectureThumbnailVO;
import com.mobius.education.domain.vo.LectureVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

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
        LectureDTO lectureDTO = new LectureDTO();
        LectureFileVO lectureFileVO = new LectureFileVO();
        LectureThumbnailVO lectureThumbnailVO = new LectureThumbnailVO();

        lectureDTO.create("파일테스트", "프로그래밍", "이 강의를 통해 리액트 기초부터 중급까지 배우게 됩니다. 하나의 강의로 개념도 익히고 실습도 하며, 리액트를 위해 필요한 대부분의 지식을 한번에 습득할 수 있도록 만들었습니다.",
                "2022-11-29", Long.parseLong("120"), "Time C (19:00~22:00)", "진행예정");
        lectureService.apply(lectureDTO);
    }

    @Test
    public void showTest() {
        lectureService.show(7L);
    }

    @Test
    public void modifyTest() {

    }
}
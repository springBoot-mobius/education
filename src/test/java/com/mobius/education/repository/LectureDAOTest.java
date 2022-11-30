package com.mobius.education.repository;

import com.mobius.education.domain.vo.LectureDTO;
import com.mobius.education.domain.vo.LectureVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class LectureDAOTest {

    @Autowired
    private LectureDAO lectureDAO;

    @Test
    public void findExpected() {
        log.info("Expected: " + lectureDAO.findExpected());
    }

    @Test
    public void findFinished() {
        log.info("Finished: " + lectureDAO.findFinished());
    }

    @Test
    public void findOngoing() {
        log.info("Ongoing: " + lectureDAO.findOngoing());
    }

    @Test
    public void saveTest() {
        LectureDTO lectureDTO = new LectureDTO();
        lectureDTO.create("쉽게 배우는 자바","프로그래밍", "초보자, 비전공자도 쉽게 배울 수 있는 자바 수업입니다!", "2022-11-30",
                Long.parseLong("27"), "Time A (09:00~12:00)", "진행중");
        lectureDAO.save(lectureDTO);
    }

    @Test
    public void removeTest() {
        lectureDAO.remove(Long.parseLong("25"));
    }

}
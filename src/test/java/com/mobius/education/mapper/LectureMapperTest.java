package com.mobius.education.mapper;

import com.mobius.education.domain.vo.LectureDTO;
import com.mobius.education.domain.vo.LectureVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class LectureMapperTest {

    @Autowired
    private LectureMapper lectureMapper;

    @Test
    public void expectedTest() {
        log.info("expected: " + lectureMapper.selectExpected());
    }

    @Test
    public void finishedTest() {
        log.info("finished: " + lectureMapper.selectFinished());
    }

    @Test
    public void OngoingTest() {
        log.info("ongoing: " + lectureMapper.selectOngoing());
    }

//    강의 추가
    @Test
    public void insertTest(){
        LectureDTO lectureDTO = new LectureDTO();
        lectureDTO.create("모두의 깃 & 깃허브", "프로그래밍", "개발자의 필수 교양이라 할 수 있는 깃을 명령어 없이, 명령어로 다루는 방법과 깃허브를 능수능란하게 다루는 방법을 배웁니다.",
                "2022-12-20", Long.parseLong("18"), "Time B (13:00~17:00)","진행예정");
        lectureMapper.insert(lectureDTO);
        log.info("number: " + lectureDTO.getLectureNumber());
        log.info("title: " + lectureDTO.getLectureTitle());
        log.info("category: " + lectureDTO.getLectureCategory());
    }

    @Test
    public void deleteTest() {
        LectureVO lectureVO = new LectureVO();
        lectureMapper.delete(Long.parseLong("21"));
    }


}
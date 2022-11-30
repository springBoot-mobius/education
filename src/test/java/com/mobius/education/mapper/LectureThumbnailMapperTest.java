package com.mobius.education.mapper;

import com.mobius.education.domain.vo.LectureDTO;
import com.mobius.education.domain.vo.LectureFileVO;
import com.mobius.education.domain.vo.LectureThumbnailVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class LectureThumbnailMapperTest {

    @Autowired
    private LectureThumbnailMapper lectureThumbnailMapper;

    @Test
    public void insertTest() {
        LectureDTO lectureDTO = new LectureDTO();
        lectureDTO.setLectureNumber(Long.parseLong("23"));
        LectureThumbnailVO lectureThumbnailVO = new LectureThumbnailVO();
        lectureThumbnailVO.create("테스트1", "2022/11/16", UUID.randomUUID().toString(), lectureDTO.getLectureNumber());
        lectureThumbnailMapper.insert(lectureThumbnailVO);
        log.info("name: " + lectureThumbnailVO.getLectureThumbnailName());
    }
}
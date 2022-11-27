package com.mobius.education.repository;

import com.mobius.education.mapper.LectureFileMapper;
import com.mobius.education.mapper.LectureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureFileDAO {
    private final LectureFileMapper lectureFileMapper;

}

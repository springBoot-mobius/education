package com.mobius.education.repository;

import com.mobius.education.mapper.LectureMapper;
import com.mobius.education.mapper.PlaceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureDAO {
    private final LectureMapper lectureMapper;

}

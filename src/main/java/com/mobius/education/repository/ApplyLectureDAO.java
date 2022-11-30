package com.mobius.education.repository;

import com.mobius.education.mapper.ApplyLectureMapper;
import com.mobius.education.mapper.LectureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ApplyLectureDAO {
    private final ApplyLectureMapper applyLectureMapper;

    // 현재 내가 들을 강의 수
    public int showUserExpectedLectureCount(Long userNumber){
        return applyLectureMapper.selectOnGoingLectureCount(userNumber);
    }
    // 현재 내가 완료한 강의 수
    public int showUserEndLectureCount(Long userNumber){
        return applyLectureMapper.selectEndLectureCount(userNumber);
    }

}

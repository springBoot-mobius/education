package com.mobius.education.repository;

import com.mobius.education.domain.vo.LectureDTO;
import com.mobius.education.domain.vo.LectureVO;
import com.mobius.education.mapper.LectureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LectureDAO {
    private final LectureMapper lectureMapper;

    //진행 예정 강의 개수
    public int findExpected() {
        return lectureMapper.selectExpected();
    }

    //진행 완료 강의 개수
    public int findFinished() {
        return lectureMapper.selectFinished();
    }

    //진행중 강의 개수
    public int findOngoing() {
        return lectureMapper.selectOngoing();
    }

    //강의 신청
    public void save(LectureDTO lectureDTO){
        lectureMapper.insert(lectureDTO);
    }

    //강의 삭제
    public void remove(Long lectureNumber) {
        lectureMapper.delete(lectureNumber);
    }

    //강의 수정
    public void modify(LectureDTO lectureDTO) {
        lectureMapper.update(lectureDTO);
    }

    //강의 조회
    public LectureVO findById(Long lectureNumber) {
        return lectureMapper.select(lectureNumber);
    }
}

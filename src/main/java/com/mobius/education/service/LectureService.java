package com.mobius.education.service;

import com.mobius.education.domain.vo.LectureVO;
import com.mobius.education.repository.LectureDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LectureService {
    private final LectureDAO lectureDAO;

    // 진행 예정 강의 개수
    public int countExpected() {
        return lectureDAO.findExpected();
    }

    // 진행 예정 강의 개수
    public int countFinished() {
        return lectureDAO.findFinished();
    }

    // 진행중 강의 개수
    public int countOngoing() {
        return lectureDAO.findOngoing();
    }

    // 강의 신청
    public void apply(LectureVO lectureVO) {
        lectureDAO.save(lectureVO);
    }
}

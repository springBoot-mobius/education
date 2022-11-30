package com.mobius.education.service;

import com.mobius.education.domain.vo.LectureDTO;
import com.mobius.education.domain.vo.LectureFileVO;
import com.mobius.education.domain.vo.LectureThumbnailVO;
import com.mobius.education.domain.vo.LectureVO;
import com.mobius.education.repository.LectureDAO;
import com.mobius.education.repository.LectureFileDAO;
import com.mobius.education.repository.LectureThumbnailDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LectureService {
    private final LectureDAO lectureDAO;
    private final LectureFileDAO lectureFileDAO;
    private final LectureThumbnailDAO lectureThumbnailDAO;

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
    @Transactional(rollbackFor = Exception.class)
    public void apply(LectureDTO lectureDTO) {
        lectureDAO.save(lectureDTO);
        LectureFileVO file = lectureDTO.getLectureFileVO();
        LectureThumbnailVO thumb = lectureDTO.getLectureThumbnailVO();

        if(file != null) {
            file.setLectureNumber(lectureDTO.getLectureNumber());
            lectureFileDAO.save(file);
        }

        if(thumb != null) {
            thumb.setLectureNumber(lectureDTO.getLectureNumber());
            lectureThumbnailDAO.save(thumb);
        }
    }

//    강의 조회
    public LectureDTO show(Long lectureNumber) {
        return lectureDAO.findById(lectureNumber);
    }

//    강의 전체 조회
    public List<LectureVO> showAll(Criteria criteria) {
        return lectureDAO.findAll(criteria);
    }

//  강의 전체 개수
    public int countAll() {
        return lectureDAO.countTotal();
    }
//    강의 삭제
    @Transactional(rollbackFor = Exception.class)
    public void remove(Long lectureNumber) {
        lectureFileDAO.remove(lectureNumber);
        lectureThumbnailDAO.remove(lectureNumber);
        lectureDAO.remove(lectureNumber);

    }

//    강의 수정
    @Transactional(rollbackFor = Exception.class)
    public void modify(LectureDTO lectureDTO) {
        lectureDAO.modify(lectureDTO);
        lectureFileDAO.remove(lectureDTO.getLectureNumber());
        lectureThumbnailDAO.remove(lectureDTO.getLectureNumber());

        LectureFileVO file = lectureDTO.getLectureFileVO();
        LectureThumbnailVO thumb = lectureDTO.getLectureThumbnailVO();

        if(file != null) {
            file.setLectureNumber(lectureDTO.getLectureNumber());
            lectureFileDAO.save(file);
        }

        if(thumb != null) {
            thumb.setLectureNumber(lectureDTO.getLectureNumber());
            lectureThumbnailDAO.save(thumb);
        }
    }

//    강의 조회
    public LectureDTO show(Long lectureNumber) {
        LectureDTO lectureDTO = new LectureDTO();
        lectureDTO.create(lectureDAO.findById(lectureNumber));
        lectureDTO.setLectureFileVO(lectureFileDAO.find(lectureNumber));
        lectureDTO.setLectureThumbnailVO(lectureThumbnailDAO.find(lectureNumber));
        return lectureDTO;

    }
}

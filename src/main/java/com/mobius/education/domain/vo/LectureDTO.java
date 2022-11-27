package com.mobius.education.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class LectureDTO {

    private Long lectureNumber;
    private String lectureTitle;
    private String lectureCategory;
    private String lectureContent;
    private String lectureDate;
    private Long lectureApplyNumber;
    private Long lectureMaximumNumber;
    private String lectureTime;
    private String lectureStatus;
    private Long teacherNumber;
    private Long placeNumber;

    private LectureFileVO lectureFileVO;
    private LectureThumbnailVO lectureThumbnailVO;


    public void create(LectureVO lectureVO) {
        this.lectureTitle = lectureTitle;
        this.lectureCategory = lectureCategory;
        this.lectureContent = lectureContent;
        this.lectureDate = lectureDate;
        this.lectureMaximumNumber = lectureMaximumNumber;
        this.lectureTime = lectureTime;
        this.lectureStatus = lectureStatus;
    }

    public void create(String lectureTitle, String lectureCategory, String lectureContent, String lectureDate, Long lectureMaximumNumber, String lectureTime, String lectureStatus) {
        this.lectureTitle = lectureTitle;
        this.lectureCategory = lectureCategory;
        this.lectureContent = lectureContent;
        this.lectureDate = lectureDate;
        this.lectureMaximumNumber = lectureMaximumNumber;
        this.lectureTime = lectureTime;
        this.lectureStatus = lectureStatus;
    }

    public void create(String lectureTitle, String lectureCategory, String lectureContent, String lectureDate, Long lectureMaximumNumber, String lectureTime, String lectureStatus, LectureFileVO lectureFileVO, LectureThumbnailVO lectureThumbnailVO) {
        this.lectureTitle = lectureTitle;
        this.lectureCategory = lectureCategory;
        this.lectureContent = lectureContent;
        this.lectureDate = lectureDate;
        this.lectureMaximumNumber = lectureMaximumNumber;
        this.lectureTime = lectureTime;
        this.lectureStatus = lectureStatus;
        this.lectureFileVO = lectureFileVO;
        this.lectureThumbnailVO = lectureThumbnailVO;
    }

}

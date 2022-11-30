package com.mobius.education.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LectureFileVO {
    private Long lectureFileNumber;
    private String lectureFileName;
    private String lectureFileUploadPath;
    private String lectureFileUuid;
    private Long lectureFileSize;
    private Long lectureNumber;

    public void create(String lectureFileName, String lectureFileUploadPath, String lectureFileUuid, Long lectureNumber) {
        this.lectureFileName = lectureFileName;
        this.lectureFileUploadPath = lectureFileUploadPath;
        this.lectureFileUuid = lectureFileUuid;
        this.lectureNumber = lectureNumber;
    }
}

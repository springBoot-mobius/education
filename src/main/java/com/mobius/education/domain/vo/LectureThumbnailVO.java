package com.mobius.education.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LectureThumbnailVO {
    private Long lectureThumbnailNumber;
    private String lectureThumbnailName;
    private String lectureThumbnailUploadPath;
    private String lectureThumbnailUuid;
    private Long lectureNumber;
}

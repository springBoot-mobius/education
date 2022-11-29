package com.mobius.education.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class ReviewVO {
    private Long reviewNumber;
    private String reviewTitle;
    private String reviewContent;
    private String reviewRegisterDate;
    private String reviewModifyDate;
    private Long lectureNumber;
    private Long userNumber;

    public void create(Long reviewNumber, String reviewTitle, String reviewContent, String reviewRegisterDate, String reviewModifyDate, Long lectureNumber, Long userNumber) {
        this.reviewNumber = reviewNumber;
        this.reviewTitle = reviewTitle;
        this.reviewContent = reviewContent;
        this.reviewRegisterDate = reviewRegisterDate;
        this.reviewModifyDate = reviewModifyDate;
        this.lectureNumber = lectureNumber;
        this.userNumber = userNumber;
    }
}

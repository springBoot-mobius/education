package com.mobius.education.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class RequestVO {
    private Long requestNumber;
    private String requestTitle;
    private String requestCategory;
    private String requestContent;
    private String requestRegisterDate;
    private String requestModifyDate;
    private Long userNumber;

    public void create(String requestTitle, String requestCategory, String requestContent) {
        this.requestTitle = requestTitle;
        this.requestCategory = requestCategory;
        this.requestContent = requestContent;
    }
}

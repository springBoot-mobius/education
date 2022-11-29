package com.mobius.education.service;

import com.mobius.education.repository.ApplyLectureDAO;
import com.mobius.education.repository.RequestDAO;
import com.mobius.education.repository.ReviewDAO;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserMypageService {
    private final ReviewDAO reviewDAO;
    private final ApplyLectureDAO applyLectureDAO;
    private final RequestDAO requestDAO;

    public void showMypageHome(Long userNumber){

    }

}

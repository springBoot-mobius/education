package com.mobius.education.repository;

import com.mobius.education.domain.vo.ReviewVO;
<<<<<<< HEAD
import com.mobius.education.domain.vo.UserVO;
=======
>>>>>>> 6b61d1280a708f5a3efcdc823b09ad05b3b0ab2e
import com.mobius.education.mapper.PlaceMapper;
import com.mobius.education.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReviewDAO {
    private final ReviewMapper reviewMapper;
    
    // 내가 작성한 리뷰 수
    public int showUserReviewCount(Long userNumber){
        return reviewMapper.selectUserReviewCount(userNumber);
    }

<<<<<<< HEAD
    // 내가 작성한 모든 리뷰 리스트
    public List<ReviewVO> showUserReviewAll(Long userNumber){
        return reviewMapper.selectAllMyReview(userNumber);
    }
=======
//    전체조회
    public List<ReviewVO> findAll(){
        return reviewMapper.selectAll();
}

>>>>>>> 6b61d1280a708f5a3efcdc823b09ad05b3b0ab2e
}

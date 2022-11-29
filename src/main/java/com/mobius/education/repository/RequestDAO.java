package com.mobius.education.repository;

import com.mobius.education.domain.vo.RequestVO;
<<<<<<< HEAD
=======
import com.mobius.education.mapper.LectureFileMapper;
>>>>>>> 6b61d1280a708f5a3efcdc823b09ad05b3b0ab2e
import com.mobius.education.mapper.RequestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RequestDAO {
    private final RequestMapper requestMapper;

<<<<<<< HEAD
//    내가 작성한 요청 수
    public int showMyRequestCount(Long userNumber){
        return requestMapper.selectUserRequestCount(userNumber);
    }

//    내가 작성한 요청 모두
    public List<RequestVO> showMYRequestAll(Long userNumber){
        return requestMapper.selectUserRequestAll(userNumber);
=======
//    추가
    public void save(RequestVO requestVO) {
        requestMapper.insert(requestVO);
    }

//    수정
    public void setRequestVO(RequestVO requestVO) {
        requestMapper.update(requestVO);
    }

//    삭제
    public void remove(Long requestNumber){
        requestMapper.delete(requestNumber);
    }

//    조회
    public RequestVO findById(Long requestNumber) {
        return requestMapper.select(requestNumber);
    }

//    전체조회
    public List<RequestVO> findAll(){
        return requestMapper.selectAll();
>>>>>>> 6b61d1280a708f5a3efcdc823b09ad05b3b0ab2e
    }
}

package com.mobius.education.repository;

import com.mobius.education.domain.vo.RequestVO;
import com.mobius.education.mapper.RequestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RequestDAO {
    private final RequestMapper requestMapper;

//    내가 작성한 요청 수
    public int showMyRequestCount(Long userNumber){
        return requestMapper.selectUserRequestCount(userNumber);
    }

//    내가 작성한 요청 모두
    public List<RequestVO> showMYRequestAll(Long userNumber){
        return requestMapper.selectUserRequestAll(userNumber);
    }
}

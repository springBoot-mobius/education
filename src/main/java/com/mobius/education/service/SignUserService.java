package com.mobius.education.service;

import com.mobius.education.domain.vo.UserVO;
import com.mobius.education.repository.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
//@Qualifier("sign") @Primary
public class SignUserService {
    private final UserDAO userDAO;

    //회원가입
    public void register(UserVO userVO){
        userDAO.save(userVO);
    }

    // 로그인
    public void login(Long userNumber){;}

}

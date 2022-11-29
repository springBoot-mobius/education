package com.mobius.education.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class RequestMapperTest {
    @Autowired
    private RequestMapper requestMapper;

    @Test
    public void selectUserRequestCountTest(){
        log.info("내가 작성한 요청수 : " + requestMapper.selectUserRequestCount(0L));

    }

    @Test
    public void selectUserRequestAllTest(){
        log.info("내가 작성한 요청 수 모두" + requestMapper.selectUserRequestAll(0L));
    }


}

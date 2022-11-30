package com.mobius.education.controller;

import com.mobius.education.domain.vo.UserVO;
import com.mobius.education.repository.UserDAO;
import com.mobius.education.service.SignUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/join/*")
@RequiredArgsConstructor
public class UserController {

    private final SignUserService signUserService;

    @GetMapping("/teacherJoin")
    public void teacherinsert(){;}




    @GetMapping("/userJoin")
    public void userinsert(){

        }

    @PostMapping("/userJoin")
    public String signUp(UserVO userVO){
        signUserService.register(userVO);
        return "/mainpage/index";
    }



}

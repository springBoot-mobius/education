package com.mobius.education.controller;

import com.mobius.education.domain.vo.LectureFileVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/lectureFile/*")
public class LectureFileController {
    @PostMapping("/upload")
    public void upload(List<MultipartFile> upload) throws IOException {
        String rootPath = "C:/upload";
        String uploadPath = getUploadPath();

        File uploadFullPath = new File(rootPath, uploadPath);
        if(!uploadFullPath.exists()){uploadFullPath.mkdirs();}

        for(MultipartFile multipartFile : upload){
            File fullPath = new File(uploadFullPath, multipartFile.getOriginalFilename());
            multipartFile.transferTo(fullPath);
        }
    }

    private String getUploadPath(){
        return new SimpleDateFormat("yyyy/MM/dd").format(new Date());
    }
}


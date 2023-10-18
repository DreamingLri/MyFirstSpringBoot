package com.dreaminglri.myfirstspringboot.contorller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileController {
    @PostMapping("/up")
    public String up(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException {
        //获取图片原始名称
        System.out.println(photo.getOriginalFilename());
        //获取图片文件类型
        System.out.println(photo.getContentType());
        System.out.println(System.getProperty("user.dir"));

        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
        saveFile(photo, path);
        return "上传成功";
    }

    public void saveFile(MultipartFile photo, String path) throws IOException {
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdir();
        }

        File file = new File(path+photo.getOriginalFilename());
        photo.transferTo(file);
    }
}

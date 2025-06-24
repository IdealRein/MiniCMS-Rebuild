package com.IdealRein.controller;

import com.IdealRein.pojo.Result;
import com.IdealRein.utils.AliyunUploader;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@RestController
@RequestMapping("/upload")  
@Tag(name = "File Upload")
public class FileUploadController {

    @Autowired
    private AliyunUploader aliOssUtil;

    @PostMapping
    @Operation(summary = "Upload file to OSS and return file URL")
    public Result<String> upload(@RequestParam("file") MultipartFile file) throws Exception {

        String originalFilename = file.getOriginalFilename();
        String filename = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));

        String url = aliOssUtil.uploadFile(filename, file.getInputStream()); 
        return Result.success(url);
    }
}

package com.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.ws.spi.http.HttpHandler;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URLEncoder;

@Controller
@RequestMapping("/file")
public class FileController {

    public static final String FILE_DIRECTORY = "E:\\CloudMusic\\download";

    @PostMapping("/upload")
    public String upload(MultipartFile myfile) {
        //得到上传过来的文件名
        String filename = myfile.getOriginalFilename();
        String path = FILE_DIRECTORY + File.separator + filename;
        File file = new File(path);

        try {
            //把文件上传到File（路径）
            myfile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ok";
    }

    @RequestMapping("/download")
    public ResponseEntity<InputStreamSource> download(String filename)throws IOException {
        String path = FILE_DIRECTORY + File.separator + filename;
        File file = new File(path);
        //这个guess方法是依据文件名来得到媒体类型也就是mime类型,
        // 比如常见有image/jpeg,application/json
        String mediaType = URLConnection.guessContentTypeFromName(filename);
        if (mediaType == null) {
            /*识别不了时,统统用这个,一般用来表示下载二进制数据
            * 比如视频，文件就用二进制数据*/
            mediaType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }
        HttpHeaders resHeaders = new HttpHeaders();
        //解析媒体类型
        resHeaders.setContentType(MediaType.parseMediaType(mediaType));
        //attachment :附件的意思,表示告诉浏览器弹出一个另存为窗口来下载文件,
        // inline是直接在浏览器中打开下载的文件,默认下载路径
        resHeaders.setContentDispositionFormData("attachment",
                URLEncoder.encode(filename, "UTF-8"));

        //用户请求 ->控制器处理后，第三方通过（输入流）把文件->给用户。
        InputStreamResource inputStreamResource =
                new InputStreamResource(new FileInputStream(file));
        return new ResponseEntity<>(inputStreamResource, resHeaders, HttpStatus.OK);
    }
}

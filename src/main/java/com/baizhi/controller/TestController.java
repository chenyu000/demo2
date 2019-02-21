package com.baizhi.controller;

import com.baizhi.entity.Album;
import com.baizhi.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test1")
public class TestController {
    @Autowired
    private AlbumService albumService;
    @RequestMapping("test1")
    public String test(){
        System.out.println("aaaaaa");
        System.out.println("aaaaaa");

        Album album = albumService.getById(10008);


        System.out.println("aaaaaa");
        System.out.println("aaaaaa");

        return  "index";
    }
}

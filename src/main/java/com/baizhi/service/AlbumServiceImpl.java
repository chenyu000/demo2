package com.baizhi.service;

import com.baizhi.dao.AlbumMapper;
import com.baizhi.entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AlbumServiceImpl implements AlbumService{
    @Autowired
    private AlbumMapper albumMapper;
    public Album getById(Integer id){
        Album album = albumMapper.selectByPrimaryKey(id);
        return album;
    }
}

package com.baizhi.entity;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Album implements Serializable {
    @JSONField(serialize = false)
    private Integer id;

    private String title;

    private Double score;

    private String author;

    private String broadcast;

    private Integer count;

    private String brief;

    private Date pulishtime;

    private String coverimg;

    private String status;

    private Date createdate;

}
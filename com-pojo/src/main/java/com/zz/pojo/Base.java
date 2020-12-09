package com.zz.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author zhangzhen
 * @Date 2020/12/7 19:44
 **/
@Data
public class Base implements Serializable {


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;          //创建时间
    private String createUserId;      //创建id
    private String createUserName;    //创建名称

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyTime;          //更新时间
    private String modifyUserId;      //更新id
    private String modifyUserName;    //更新名称

}

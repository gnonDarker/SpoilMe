package com.example.spoilme.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;//ID
    private String name;
    private String nickname;//昵称
    private String password;//密码
    private String avatar;//头像
    private Short sex;//用户性别
    @JsonFormat(pattern="yyyy-MM-dd")
    private Timestamp date;//生日
    private String mail;//邮箱
    private String phone;//手机
}

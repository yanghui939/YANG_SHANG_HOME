package com.yh.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String id;
    private String userName;
    private String password;
    private int isAdmin;

}

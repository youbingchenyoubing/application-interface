package com.common.tool.user;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Mr_chen
 * @date 2019/2/14
 * @Project application-interface
 **/
@Data
public class UserInfo implements Serializable {
    public String id;
    public String username;
    public String password;
    public String name;
    private String description;
    private Date updTime;
}

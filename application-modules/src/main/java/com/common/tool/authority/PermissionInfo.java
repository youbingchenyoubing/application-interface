package com.common.tool.authority;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Mr_chen
 * @date 2019/2/13
 * @Project application-interface
 **/
@Data
public class PermissionInfo  implements Serializable {
    private String code;
    private String type;
    private String uri;
    private String method;
    private String name;
    private String menu;
}

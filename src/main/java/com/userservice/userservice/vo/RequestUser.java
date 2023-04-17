package com.userservice.userservice.vo;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class RequestUser {
    private String email;
    private String name;
    private String pwd;
}

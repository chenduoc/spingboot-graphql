package com.mx.server.entity.input;

import lombok.Data;

@Data
public class AddUserInput {
    private String nickname;
    private String mail;
    private String password;
    private String description;
}

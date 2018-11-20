package com.mao.swagger.beans;

import lombok.Data;

/**
 * @author dgh
 * @date 18-11-15 下午8:40
 */
@Data
public class User {

    private String userId;

    private String userName;

    private String password;

    private String email;

    public User() {
        super();
    }

    public User(String userId, String userName, String password, String email) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }


}

package com.mao.swagger.beans;

import lombok.Data;

@Data
/**
 * @author dgh
 * @date
 */
public class ResObject {

    private int code;

    private Object data;

    private String desc;

    public ResObject(int code, String desc) {
        super();
        this.code = code;
        this.desc = desc;
    }

    public ResObject(int code, Object data) {
        super();
        this.code = code;
        this.data = data;
    }

    public ResObject(int code, Object data, String desc) {
        super();
        this.code = code;
        this.data = data;
        this.desc = desc;
    }

}
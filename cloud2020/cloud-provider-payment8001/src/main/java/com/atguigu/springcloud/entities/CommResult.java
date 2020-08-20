package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: wjgful
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommResult<T> {
    private Integer code;
    private  String message;
    private T data;

    public CommResult(Integer code,String message){
        this(code,message,null);
    }
}

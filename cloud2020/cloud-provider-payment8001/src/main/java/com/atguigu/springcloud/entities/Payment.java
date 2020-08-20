package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: wjgful
 * @date :2020-08-20 23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private static final long serialVersionUID = -2214092998831800672L;
    private long id;
    private String serial;
}

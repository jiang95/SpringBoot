package com.springboot.datajpa.domain;

import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author: lingjun.jlj
 * @date: 2018-12-26 16:56
 * @description:
 */
@Data
@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private Integer age;

    private String phone;

    private String card;

    private Integer status;

    private LocalDateTime createTime;


    private LocalDateTime updateTime;
}

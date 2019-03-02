package com.nizouba.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author zwxbest
 */
@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name="";

    private String password="";

    private String email="";

    @Column(name = "phone_number")
    private String phoneNumber="";

    private int status;

    @Column(name = "create_time")
    private Date createTime=new Date();

    @Column(name = "last_login_time")
    private Date lastLoginTime=new Date();

    @Column(name = "last_update_time")
    private Date lastUpdateTime=new Date();

    private String avatar="";




}

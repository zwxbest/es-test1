package com.nizouba.domain.po;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by 瓦力.
 */
@Entity
@Table(name = "role")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId = 0L;
    private String name ="";

}

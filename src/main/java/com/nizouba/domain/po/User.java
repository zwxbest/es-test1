package com.nizouba.domain.po;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author zwxbest
 */
@Entity
@Table(name = "user")
@Getter
@Setter
public class User  implements UserDetails{
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

    @Transient
    private List<GrantedAuthority> authorityList;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorityList;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

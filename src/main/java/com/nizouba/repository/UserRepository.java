package com.nizouba.repository;


import com.nizouba.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 瓦力.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String userName);
}

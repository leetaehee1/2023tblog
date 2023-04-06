// /sbootblog/src/main/java/com/sg/leo/repository/UserRepository.java

package com.sg.leo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.leo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
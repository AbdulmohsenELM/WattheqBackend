package com.ELM.stProject.Wattheq;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    @Override
    List<User> findAll();
}

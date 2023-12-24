package com.project.A1Furnitures.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.A1Furnitures.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

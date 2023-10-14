package com.github.youssfbr.dio.domain.repository;

import com.github.youssfbr.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}

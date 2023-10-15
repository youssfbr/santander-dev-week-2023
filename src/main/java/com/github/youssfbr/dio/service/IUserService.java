package com.github.youssfbr.dio.service;

import com.github.youssfbr.dio.domain.model.User;

public interface IUserService {
    User findById(Long id);
    User create(User userToCreate);
}

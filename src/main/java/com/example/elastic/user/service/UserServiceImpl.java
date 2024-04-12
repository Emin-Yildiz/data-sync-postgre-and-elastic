package com.example.elastic.user.service;

import com.example.elastic.domain.response.Page;
import com.example.elastic.user.model.UserElastic;
import com.example.elastic.user.model.UserPostgre;
import com.example.elastic.user.repository.UserElasticRepository;
import com.example.elastic.user.repository.UserRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UserServiceImpl{

    private final UserRepository userRepository;
    private final UserElasticRepository userElasticRepository;

    public UserServiceImpl(UserRepository userRepository, UserElasticRepository userElasticRepository) {
        this.userRepository = userRepository;
        this.userElasticRepository = userElasticRepository;
    }

    public Long getCount() {
        return userRepository.count();
    }

    public Long getElasticCount() {
        return userElasticRepository.count();
    }

    public Page<UserPostgre> getAllUser(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        var userList = userRepository.findAllBy(pageable);
        return new Page<>(
                userList.stream().collect(Collectors.toList()),
                pageable,
                userList.getTotalElements()
        );
    }

    public Page<UserElastic> getAllUserForElastic(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        var userList = userElasticRepository.findAllBy(pageable);
        return new Page<>(
                userList.stream().collect(Collectors.toList()),
                pageable,
                userList.getTotalElements()
        );
    }

    public UserElastic getUserByNameFromElastic(String name) {
        return userElasticRepository.findByName(name);
    }

    public UserPostgre getUserByName(String name) {
        return userRepository.findUserByName(name);
    }
}

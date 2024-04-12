package com.example.elastic.user.service;

import com.example.elastic.domain.response.Page;
import com.example.elastic.user.model.UserElastic;
import com.example.elastic.user.model.UserPostgre;


public interface UserService {

    Long getCount();
    Long getElasticCount();
    Page<UserPostgre> getAllUser(Integer page, Integer size);
    Page<UserElastic> getAllUserForElastic(Integer page, Integer size);

    UserElastic getUserByNameFromElastic(String name);

    UserPostgre getUserByName(String name);

}

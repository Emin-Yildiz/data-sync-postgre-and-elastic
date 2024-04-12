package com.example.elastic.user.repository;

import com.example.elastic.user.model.UserElastic;
import com.example.elastic.user.model.UserPostgre;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserPostgre,String> {

    Page<UserPostgre> findAllBy(Pageable pageable);

    @Query(value = "from UserPostgre u where u.username = ?1")
    UserPostgre findUserByName(String name);

}

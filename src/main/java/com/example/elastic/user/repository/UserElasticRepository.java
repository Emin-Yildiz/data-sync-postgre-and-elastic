package com.example.elastic.user.repository;

import com.example.elastic.user.model.UserElastic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserElasticRepository extends ElasticsearchRepository<UserElastic,String> {

    Page<UserElastic> findAllBy(Pageable pageable);

    @Query("{\"match\": {\"username\": {\"query\": \"?0\"}}}")
    UserElastic findByName(String name);
}

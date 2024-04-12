package com.example.elastic.user.job;

import com.example.elastic.user.model.UserPostgre;
import com.example.elastic.user.repository.UserRepository;
import com.github.javafaker.Faker;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UserJob {

    private final UserRepository userRepository;

    public UserJob(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Scheduled(fixedDelay = 50)
    public void saveDataInDb() {
        Faker faker = new Faker();
        UserPostgre user = new UserPostgre(null, faker.name().username(),faker.internet().emailAddress(),faker.name().firstName(),faker.name().lastName(),faker.date().birthday(),false);
        userRepository.save(user);
    }
}

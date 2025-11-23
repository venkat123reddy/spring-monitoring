package com.monitor.obs.service;

import com.monitor.obs.entity.User;
import com.monitor.obs.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.ThreadPoolExecutor;

@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(){



        log.info("UserService addUser");
        User user = new User();
        user.setPassword("123456");
        user.setName(UUID.randomUUID().toString());
        userRepository.save(user);
    }

}

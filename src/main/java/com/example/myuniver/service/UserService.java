package com.example.myuniver.service;

import com.example.myuniver.model.Users;
import com.example.myuniver.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Users addUser(Users users) {
        return userRepository.save(users);
    }

}

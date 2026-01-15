package com.expensetracker.service;

import org.springframework.stereotype.Service;

import com.expensetracker.entity.User;
import com.expensetracker.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }

}

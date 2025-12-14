package com.example.userapi.service;

import com.example.userapi.model.User;
import com.example.userapi.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;
    public UserService(UserRepository repository) { this.repository = repository; }

    public User save(User user) { return repository.save(user); }
    public List<User> getAll() { return repository.findAll(); }
    public User getById(Long id) { return repository.findById(id).orElse(null); }
}

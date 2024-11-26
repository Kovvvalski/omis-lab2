package by.kovalski.packagemanagement.service.impl;

import by.kovalski.packagemanagement.model.User;
import by.kovalski.packagemanagement.repository.UserRepository;
import by.kovalski.packagemanagement.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    @Autowired
    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean register(User user) {
        return true;
    }

    @Override
    public boolean login(String username, String password) {
        return true;
    }
}

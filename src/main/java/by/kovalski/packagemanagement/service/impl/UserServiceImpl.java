package by.kovalski.packagemanagement.service.impl;

import by.kovalski.packagemanagement.model.User;
import by.kovalski.packagemanagement.repository.UserRepository;
import by.kovalski.packagemanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void deleteByEmail(String email) {

    }
}

package by.kovalski.packagemanagement.service;

import by.kovalski.packagemanagement.model.User;

public interface UserService {
    void update(User user);

    void deleteByEmail(String email);
}

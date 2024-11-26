package by.kovalski.packagemanagement.service;


import by.kovalski.packagemanagement.model.User;

public interface AuthService {
    boolean register(User user);

    boolean login(String username, String password);
}

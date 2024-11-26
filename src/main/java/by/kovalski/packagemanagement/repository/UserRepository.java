package by.kovalski.packagemanagement.repository;

import by.kovalski.packagemanagement.model.User;

public interface UserRepository {
    User getUser(String email);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(String email);
}

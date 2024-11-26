package by.kovalski.packagemanagement.repository.impl;

import by.kovalski.packagemanagement.model.User;
import by.kovalski.packagemanagement.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User getUser(String email) {
        return null;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(String email) {

    }
}

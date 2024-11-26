package tech.reliab.course.samoylovaea.bank.service;

import tech.reliab.course.samoylovaea.bank.entity.User;
import tech.reliab.course.samoylovaea.bank.model.UserRequest;

import java.util.List;

public interface UserService {

    User createUser(UserRequest userRequest);

    User getUserById(int id);

    User getUserDtoById(int id);

    List<User> getAllUsers();

    User updateUser(int id, String name);

    void deleteUser(int id);
}

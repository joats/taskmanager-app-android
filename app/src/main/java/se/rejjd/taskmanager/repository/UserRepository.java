package se.rejjd.taskmanager.repository;

import java.util.List;

import se.rejjd.taskmanager.model.User;

public interface UserRepository {

    List<User> getUsers();

    User getUser(String id);

    Long addUser(User user);

}

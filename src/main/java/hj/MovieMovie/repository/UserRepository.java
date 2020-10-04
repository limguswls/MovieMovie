package hj.MovieMovie.repository;

import hj.MovieMovie.dto.User;

import java.util.Optional;

public interface UserRepository {
    void save(User user);
    Optional<User> findById(long userId);
}

package hj.MovieMovie.repository;

import hj.MovieMovie.dto.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MemoryUserRepository implements UserRepository {

    private static Map<Long, User> storage = new HashMap<>();
    private static long id = 0L;

    @Override
    public void save(User user) {
        user.setUserId(++id);
        storage.put(user.getUserId(), user);
    }

    @Override
    public Optional<User> findById(long userId) {
        return Optional.ofNullable(storage.get(userId));
    }
}

package ru.itis.repositories;

import ru.itis.models.User;

import java.util.Optional;

/**
 * 26.10.2020
 * 09. Spring
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersRepository extends CrudRepository<User, Long> {
    Optional<User> findOneByEmail(String email);
}

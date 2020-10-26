package ru.itis.repositories;

import java.util.List;
import java.util.Optional;

/**
 * 26.10.2020
 * 09. Spring
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface CrudRepository<T, ID> {
    void save(T entity);
    void delete(ID id);
    void update(T entity);
    Optional<T> findById(ID id);
    List<T> findAll();
}

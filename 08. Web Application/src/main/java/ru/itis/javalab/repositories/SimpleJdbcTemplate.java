package ru.itis.javalab.repositories;

import java.util.List;

/**
 * 05.10.2020
 * 08. Web Application
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SimpleJdbcTemplate {
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object ... args) {
        return null;
    }
}

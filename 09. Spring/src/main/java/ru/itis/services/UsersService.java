package ru.itis.services;

/**
 * 26.10.2020
 * 09. Spring
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersService {
    void signUp(String firstName, String lastName, String email, String password);
    void signIn(String email, String password);
}

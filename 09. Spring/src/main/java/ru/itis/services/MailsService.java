package ru.itis.services;

/**
 * 26.10.2020
 * 09. Spring
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface MailsService {
    void sendMail(String email, String message);
}

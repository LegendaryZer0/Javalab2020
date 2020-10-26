package ru.itis.services;

/**
 * 26.10.2020
 * 09. Spring
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MailsServiceMockImpl implements MailsService {
    @Override
    public void sendMail(String email, String message) {
        System.err.println("Сообщение <" + message + "> отправлено на : " + email);
    }
}

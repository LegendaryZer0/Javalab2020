package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.itis.repositories.UsersRepository;
import ru.itis.utils.PasswordCheckerUtil;

/**
 * 12.11.2020
 * 12. Spring Repeat
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
//@Component
@Service
public class UsersServiceImpl implements UsersService {

//    @Autowired
//    @Qualifier(value = "usersRepository")
    private UsersRepository usersRepository;

//    @Autowired
    private PasswordCheckerUtil passwordChecker;

    public UsersServiceImpl(UsersRepository usersRepository, PasswordCheckerUtil passwordChecker) {
        this.usersRepository = usersRepository;
        this.passwordChecker = passwordChecker;
    }
}

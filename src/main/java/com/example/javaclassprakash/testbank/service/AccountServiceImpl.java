package com.example.javaclassprakash.testbank.service;

import com.example.javaclassprakash.testbank.dao.AccountDao;
import com.example.javaclassprakash.testbank.models.CreateAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;

    @Override
    public CreateAccount createNewAccount(CreateAccount payload) {


        return accountDao.save(payload);
    }
}

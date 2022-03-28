package com.example.javaclassprakash.testbank.service;

import com.example.javaclassprakash.testbank.models.CreateAccount;
import org.springframework.stereotype.Service;


public interface AccountService {
    public CreateAccount createNewAccount(CreateAccount payload);

}

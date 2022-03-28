package com.example.javaclassprakash.testbank.dao;

import com.example.javaclassprakash.testbank.dto.AccountInfo;
import com.example.javaclassprakash.testbank.models.CreateAccount;
import com.example.javaclassprakash.testbank.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountDaoImpl implements AccountDao{
    @Autowired
    AccountRepo repo;
    @Override
    public CreateAccount save(CreateAccount payload) {

        Long ssn = payload.getSsn();
        String firstName = payload.getFirstName();
        String lastName = payload.getLastName();
        String address = payload.getAddress();
        Long mobile = payload.getMobileNumber();
        Long randomAccnum = System.currentTimeMillis();


        AccountInfo toSave = new AccountInfo();
        toSave.setSsn(ssn);
        toSave.setFirstName(firstName);
        toSave.setLastName(lastName);
        toSave.setAddress(address);
        toSave.setMobileNumber(mobile);
        toSave.setAccNum(randomAccnum);


        AccountInfo mySavaedDatafromDb = repo.save(toSave);


        CreateAccount response = new CreateAccount();
        response.setSsn(mySavaedDatafromDb.getSsn());
        response.setFirstName(mySavaedDatafromDb.getFirstName());
        response.setLastName(mySavaedDatafromDb.getLastName());
        response.setAddress(mySavaedDatafromDb.getAddress());
        response.setMobileNumber(mySavaedDatafromDb.getMobileNumber());
        response.setAccNum(mySavaedDatafromDb.getAccNum());




        return response;
    }
}

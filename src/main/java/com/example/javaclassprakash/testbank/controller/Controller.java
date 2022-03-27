package com.example.javaclassprakash.testbank.controller;

import com.example.javaclassprakash.testbank.models.BalanceChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/testbank")
public class Controller {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    //HashMap<String, String> mMap = new HashMap<>();

    @RequestMapping(value = "/checkbalance", method = RequestMethod.GET)
    public BalanceChecker  checkBalance(@RequestBody BalanceChecker payload) {

       logger.info("Logger is here");
       logger.info("balance here"+payload );
       return payload;
        //return mMap.get(key);

    }
}

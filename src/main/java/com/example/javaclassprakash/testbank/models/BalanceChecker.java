package com.example.javaclassprakash.testbank.models;

public class BalanceChecker {

    private String firstName ;
    private String lastName ;
    private int accNum ;

    public BalanceChecker(String firstName, String lastName, int accNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accNum = accNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    @Override
    public String toString() {
        return "BalanceChecker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accNum=" + accNum +
                '}';
    }
}

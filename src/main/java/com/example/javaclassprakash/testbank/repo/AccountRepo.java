package com.example.javaclassprakash.testbank.repo;


import com.example.javaclassprakash.testbank.dto.AccountInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<AccountInfo,Integer> {
}

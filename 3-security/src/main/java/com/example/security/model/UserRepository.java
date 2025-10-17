package com.example.security.model;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<DBUser, Integer> {
    public DBUser findByUsername(String username);
}

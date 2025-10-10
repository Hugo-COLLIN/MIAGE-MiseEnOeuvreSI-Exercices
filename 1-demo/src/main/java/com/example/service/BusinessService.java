package com.example.service;

import com.example.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService
{
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}

package com.example;

import com.example.model.HelloWorld;
import com.example.service.BusinessService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class HelloworldApplicationTests {

    @Autowired
    private BusinessService businessService;

    @Test
    void contextLoads() {
    }

    @Test
    void testBusinessService() {
        // Act
        HelloWorld helloWorld = businessService.getHelloWorld();

        // Assert
        assertNotNull(helloWorld, "L'objet HelloWorld ne doit pas être null");
        assertEquals("HelloWorld", helloWorld.getMaProp(),
                "La propriété maProp doit être 'HelloWorld'");
    }
}

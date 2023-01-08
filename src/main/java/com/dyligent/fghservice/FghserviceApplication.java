package com.dyligent.fghservice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FghserviceApplication extends SpringBootServletInitializer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FghserviceApplication.class, args);

    }

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
//        User user = new User();
//
//        user.setUsername("test");
//        user.setPassword("test");
//
//        entityManager.persist(user);

//        User user = entityManager.find(User.class, 1);
//        user.setPassword("11");
//        entityManager.persist(user);
    }
}

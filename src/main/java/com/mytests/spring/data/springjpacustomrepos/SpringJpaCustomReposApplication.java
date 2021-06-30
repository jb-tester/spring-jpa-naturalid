package com.mytests.spring.data.springjpacustomrepos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = NaturalRepositoryImpl.class)
public class SpringJpaCustomReposApplication implements CommandLineRunner {
@Autowired
ApplicationContext ctx;
@Autowired PersonRepository repository;
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaCustomReposApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************************");
        System.out.println(repository.findBySimpleNaturalId(100).toString());
        System.out.println("**********************************");
    }
}

package com.exemple.jaxrs;

import com.exemple.jaxrs.repository.CompteRepository;
import com.exemple.jaxrs.entity.Compte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class JaxrsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaxrsApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CompteRepository compteRepository){
        return args -> {
            compteRepository.save(new Compte(null,Math.random()*9000,new Date(),TypeCompte.EPARGNE));
            compteRepository. save(new Compte (null, Math.random()*9000,new Date(), TypeCompte.COURANT));
            compteRepository. save(new Compte (null, Math.random()*9000, new  Date(), TypeCompte.EPARGNE));
            compteRepository.findAll().forEach(c->{
                System.out.println(c.toString());
            });
        };
    }
}

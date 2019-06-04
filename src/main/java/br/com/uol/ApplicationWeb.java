package br.com.uol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.uol.repository.SolverRepository;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= {SolverRepository.class})
public class ApplicationWeb {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationWeb.class, args);
    }

}
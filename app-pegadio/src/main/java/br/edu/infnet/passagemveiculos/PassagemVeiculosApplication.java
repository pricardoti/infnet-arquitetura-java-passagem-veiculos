package br.edu.infnet.passagemveiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "br.edu.infnet.passagemveiculos.clients")
public class PassagemVeiculosApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassagemVeiculosApplication.class, args);
    }

}

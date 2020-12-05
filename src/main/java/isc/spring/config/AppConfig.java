package isc.spring.config;

import isc.spring.EmailService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import isc.spring.EmailService;

@Configuration
public class AppConfig {

    @Bean
    public EmailService emailService(){
        return new EmailService();
    }

    @Bean
    public EmailService2 emailService2(){
        return new EmailService2();
    }

    @Bean
    @Scope("prototype")
    public EmailService prototypeEmailService(){
        return new EmailService();
    }

}

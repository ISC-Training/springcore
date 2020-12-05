package isc.spring;

import isc.spring.config.AppConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

//        EmailService emailService = new EmailService();
//        emailService.sendEmail("test1@gmail.com", "Hi");

       // BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService1 = beanFactory.getBean("emailService", EmailService.class);
//        emailService1.sendEmail("test1@gmail.com", "Hi from BeanFactory");


//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        EmailService emailService1 = context.getBean("emailService", EmailService.class);
//        System.out.println("EmailService 1: "+ emailService1);
//        emailService1.sendEmail("test1@gmail.com", "Hi from XML");
//
//        EmailService emailService11 = context.getBean("emailService", EmailService.class);
//        System.out.println("EmailService 11: "+ emailService11);
//        emailService11.sendEmail("test2@gmail.com", "Hi from XML");


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmailService emailService1 = context.getBean("emailService", EmailService.class);
        System.out.println("EmailService 1: "+emailService1);
        emailService1.sendEmail("test@gmail.com", "Hello from Java Class!");
        EmailService emailService2 = context.getBean("emailService", EmailService.class);
        System.out.println("EmailService 2: "+emailService2);
        emailService2.sendEmail("test@gmail.com", "Hello from Java Class!");


//Annotation Configuration -> ComponentScan ...


//        EmailService emailService3 = context.getBean("prototypeEmailService", EmailService.class);
//        EmailService emailService4 = context.getBean("prototypeEmailService", EmailService.class);
//        System.out.println("EmailService 3: "+emailService3);
//        emailService3.sendEmail("test@gmail.com", "Hello from Java Class!");
//        System.out.println("EmailService 4: "+emailService4);
//        emailService4.sendEmail("test@gmail.com", "Hello from Java Class!");
//
//
//
//        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
//        EmailService eService1 = context1.getBean("emailService", EmailService.class);
//        System.out.println("eService1: "+eService1);
//        EmailService eService2 = context1.getBean("emailService", EmailService.class);
//        System.out.println("eService2: "+eService2);
//        EmailService eService3 = context1.getBean("prototypeEmailService", EmailService.class);
//        System.out.println("eService3: "+eService3);
//        EmailService eService4 = context1.getBean("prototypeEmailService", EmailService.class);
//        System.out.println("eService4: "+eService4);


    }
}

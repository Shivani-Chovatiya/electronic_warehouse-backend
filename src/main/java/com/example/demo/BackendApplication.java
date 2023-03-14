package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.Email.EmailSender;

//@EnableJpaRepositories("com.example.demo.repository")
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.product","com.example.demo.Email","com.example.demo.user","com.example.demo.login","com.example.demo.shipping","com.example.demo.order","com.example.demo.seller"})
public class BackendApplication {
	
	@Autowired
	private EmailSender emailsender; 

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void sendMail() {
//		emailsender.sendEmail("chovatiyashivani@gmail.com","Subject","Body");
//	}
}

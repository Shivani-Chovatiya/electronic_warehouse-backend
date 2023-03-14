package com.example.demo.Email;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.order.Order;
import com.example.demo.order.OrderItems;

@Service
public class EmailSender {

	@Autowired
	private JavaMailSender mailsender;
	
	
	
	public void sendEmail(String toEmail,String subject,String order,float order1,int order2) {
		SimpleMailMessage message=new SimpleMailMessage();
		
		message.setFrom("chovatiyashivani123@gmail.com");
		message.setTo(toEmail);
		
		String price = Float.toString(order1);
		String qty=Integer.toString(order2);
		
		String mes="Name: "+order+" Price: "+price+" Qty: "+qty;
		message.setText(mes);
		
		
		message.setSubject(subject);
	
		
		mailsender.send(message);
		
		System.out.println("Message sent successfully....");
	}
	
	
}

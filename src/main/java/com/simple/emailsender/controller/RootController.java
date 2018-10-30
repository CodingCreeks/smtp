package com.simple.emailsender.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simple.emailsender.SmtpMailSender;

@RestController
public class RootController {

	@Autowired
	private SmtpMailSender smtpMailSender;

	@RequestMapping("/send-mail")
	public String sendMail() throws MessagingException {

		smtpMailSender.send("halappa.manjunatha@gmail.com", "Test mail from spring", "Hooby");

		return "Email Sent Successfully";

	}

}

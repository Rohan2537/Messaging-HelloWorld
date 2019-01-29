package com.capgemini.messagingsender.senderresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.messagingsender.Sender;

@RestController
public class SenderResource {

	@Autowired
	private Sender sender;
	
	@RequestMapping("/")
	public void sayhello() {
	 	sender.send("Hello World !!!");
	}
}

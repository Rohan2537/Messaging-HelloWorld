package com.capgemini.messagingsender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component 
public class Sender {
	
@Autowired
RabbitMessagingTemplate template;
	
	
	/*
	 * public Sender(RabbitMessagingTemplate template){ this.template = template; }
	 */

	@Bean
	public Queue queue() {
		return new Queue("HWQueue", false);
	}
	
	public void send(String message){
		template.convertAndSend("HWQueue", message);
	}
}

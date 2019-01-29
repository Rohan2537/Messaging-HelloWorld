package com.capgemini.messagingreceiver.receiver;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@Bean
	public Queue queue() {
		return new Queue("HWQueue", false);
	}
	
	@RabbitListener(queues = "HWQueue")
	public void processMessage(String message) {
		System.out.println(message);
	}
}

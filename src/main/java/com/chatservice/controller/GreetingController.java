package com.chatservice.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.chatservice.model.Greeting;
import com.chatservice.model.Message;

@Controller
public class GreetingController {

	@MessageMapping("/hello")
	@SendTo("/topic/greeting")
	public Greeting greeting(Message message) throws Exception {
		Thread.sleep(1000);
		return new Greeting(message.getName());
	}

}

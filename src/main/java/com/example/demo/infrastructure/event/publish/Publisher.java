package com.example.demo.infrastructure.event.publish;

import java.nio.charset.StandardCharsets;
import lombok.AllArgsConstructor;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Service
public class Publisher {

  private final RabbitTemplate rabbitTemplate;

  public void sendMessage(String message) {
    rabbitTemplate.send(MessageBuilder.withBody(message.getBytes(StandardCharsets.UTF_8)).build());
  }



}
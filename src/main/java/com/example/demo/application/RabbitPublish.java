package com.example.demo.application;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.service.PublishRabbitService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RabbitPublish {

  public final PublishRabbitService publishRabbitService;

  public void publishRabbit(Carro messege) throws JsonProcessingException{
    publishRabbitService.publishRabbit(messege);
  }
}

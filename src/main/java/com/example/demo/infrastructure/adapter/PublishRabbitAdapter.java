package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.service.PublishRabbitService;
import com.example.demo.infrastructure.event.publish.Publisher;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PublishRabbitAdapter implements PublishRabbitService {

  private final Publisher pser;
  private final ObjectMapper objectMapper;

  @Override
  public void publishRabbit(Carro publisher) throws JsonProcessingException {
    pser.sendMessage(objectMapper.writeValueAsString(publisher));
  }

}

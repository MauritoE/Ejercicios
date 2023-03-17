package com.example.demo.domain.service;

import com.example.demo.domain.entities.Carro;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface PublishRabbitService {

  void publishRabbit(Carro publisher) throws JsonProcessingException;

}

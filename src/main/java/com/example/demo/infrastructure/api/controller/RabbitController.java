package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.RabbitPublish;
import com.example.demo.domain.entities.Carro;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path="/publisher")
@Slf4j
public class RabbitController {

  private final RabbitPublish rabbitPublish;

  @PostMapping
  public void publishRabbit(@RequestBody Carro carro) throws JsonProcessingException {
    rabbitPublish.publishRabbit(carro);
    log.info("Si se pudo" + carro);
  }

}

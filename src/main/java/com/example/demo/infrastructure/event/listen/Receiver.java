package com.example.demo.infrastructure.event.listen;

import com.example.demo.domain.entities.Carro;
import com.example.demo.infrastructure.api.controller.CarController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@Slf4j
@AllArgsConstructor
public class Receiver {

  private final ObjectMapper objectMapper;
  public static String RECEIVE_METHOD_NAME = "receiveMessage";
  public final CarController carController;

  public void receiveMessage(byte[] message) throws JsonProcessingException {
    String messageConvert = new String(message, StandardCharsets.UTF_8);
    Carro carro = objectMapper.readValue(messageConvert,Carro.class);

    carController.deleteCarro(carro.getPlaca());
    log.info("Received message [ {} ]", carro);

  }


}

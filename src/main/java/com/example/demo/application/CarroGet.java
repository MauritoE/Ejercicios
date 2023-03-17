package com.example.demo.application;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.service.CarroGetService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class CarroGet {

  private CarroGetService carroGetService;

  public Carro getCarro(String placa){
    Carro carro = carroGetService.getCarro(placa);
    if(carro== null){
      log.warn("No existe un carro con placa ingresada");
      return null;
    }
    return carro;
  }

}

package com.example.demo.application;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.service.CarroGetService;
import com.example.demo.domain.service.CarroSaveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class CarroSave {

  private final CarroSaveService carroSaveService;

  private final CarroGetService carroGetService;

  public Carro saveCarro(Carro carro){
    Carro existCarro = carroGetService.getCarro(carro.getPlaca());
    if(existCarro!=null){
      log.warn("Ya existe un carro con esta placa");
      return null;
    }
    return carroSaveService.save(carro);
  }
}

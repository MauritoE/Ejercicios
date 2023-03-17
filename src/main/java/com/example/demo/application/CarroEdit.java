package com.example.demo.application;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.service.CarroEditService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarroEdit {

  private final CarroEditService carroEditService;

  public void editCarro(Carro carro){
    carroEditService.editCarro(carro);
  }

}

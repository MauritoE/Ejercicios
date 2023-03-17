package com.example.demo.application;

import com.example.demo.domain.service.CarroDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarroDelete {

  private final CarroDeleteService carroDeleteService;

  public void deleteCarro(String placa){
    carroDeleteService.deleteCarro(placa);
  }
}

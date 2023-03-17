package com.example.demo.application;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.service.CarroGetService;
import com.example.demo.domain.service.MotoGetService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class MotoGet {

  private MotoGetService motoGetService;

  public Moto getMoto(String placa){
    Moto moto = motoGetService.getMoto(placa);
    if(moto== null){
      log.warn("No existe una moto con placa ingresada");
      return null;
    }
    return moto;
  }
}

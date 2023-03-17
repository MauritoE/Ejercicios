package com.example.demo.application;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.service.CarroGetService;
import com.example.demo.domain.service.CarroSaveService;
import com.example.demo.domain.service.MotoGetService;
import com.example.demo.domain.service.MotoSaveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class MotoSave {
  private final MotoSaveService motoSaveService;

  private final MotoGetService motoGetService;

  public Moto saveMoto(Moto moto){
    Moto existMoto = motoGetService.getMoto(moto.getPlaca());
    if(existMoto!=null){
      log.warn("Ya existe una moto con esta placa");
      return null;
    }
    return motoSaveService.save(moto);
  }
}

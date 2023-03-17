package com.example.demo.application;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.service.MotoEditService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoEdit {

  private final MotoEditService motoEditService;

  public void editMoto(Moto moto){
    motoEditService.editMoto(moto);
  }

}

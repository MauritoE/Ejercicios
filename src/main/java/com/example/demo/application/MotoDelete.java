package com.example.demo.application;

import com.example.demo.domain.service.MotoDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoDelete {

  private final MotoDeleteService motoDeleteService;

  public void deleteMoto(String placa){
    motoDeleteService.deleteMoto(placa);
  }
}

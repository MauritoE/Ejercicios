package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.service.CarroDeleteService;
import com.example.demo.infrastructure.repository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarroDeleteAdapter implements CarroDeleteService {

  private final CarroRepository carroRepository;

  @Override
  public void deleteCarro(String placa) {
    carroRepository.deleteById(placa);
  }

}

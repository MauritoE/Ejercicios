package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.service.CarroSaveService;
import com.example.demo.infrastructure.dto.CarroDto;
import com.example.demo.infrastructure.repository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarroSaveAdapter implements CarroSaveService {

  private final CarroRepository carroRepository;

  @Override
  public Carro save(Carro carro) {
    return buildCarro(carroRepository.save(buildCarroDto(carro)));
  }

  private CarroDto buildCarroDto(Carro carro) {
    return new CarroDto(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(),
        carro.getColor());
  }

  private Carro buildCarro(CarroDto carro) {
    return new Carro(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(),
        carro.getColor());
  }
}


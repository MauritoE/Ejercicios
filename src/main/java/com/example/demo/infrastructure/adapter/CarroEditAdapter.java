package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.service.CarroEditService;
import com.example.demo.infrastructure.repository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class CarroEditAdapter implements CarroEditService {

  private final CarroRepository carroRepository;

  @Transactional
  public void editCarro(Carro carro) {
    carroRepository.updateCarro(carro.getMarca(), carro.getPlaca(), carro.getModelo(),
        carro.getPrecio(), carro.getColor());
  }


}

package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Carro;
import com.example.demo.domain.service.CarroGetService;
import com.example.demo.infrastructure.dto.CarroDto;
import com.example.demo.infrastructure.repository.CarroRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarroGetAdapter implements CarroGetService {

  private final CarroRepository carroRepository;

  @Override
  public Carro getCarro(String placa) {
    Optional<CarroDto> carroDto = carroRepository.findById(placa);
    return carroDto.map(this::buildCarro).orElse(null);
  }

  private Carro buildCarro(CarroDto carro) {

    return new Carro(carro.getMarca(), carro.getPlaca(), carro.getColor(), carro.getPrecio(),
        carro.getModelo());
  }


}

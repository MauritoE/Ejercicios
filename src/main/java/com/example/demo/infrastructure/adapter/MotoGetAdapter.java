package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.service.MotoGetService;
import com.example.demo.infrastructure.dto.MotoDto;
import com.example.demo.infrastructure.repository.MotoRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoGetAdapter implements MotoGetService {

  private final MotoRepository motoRepository;

  @Override
  public Moto getMoto(String placa) {
    Optional<MotoDto> motoDto = motoRepository.findById(placa);
    return motoDto.map(this::buildMoto).orElse(null);
  }

  private Moto buildMoto(MotoDto moto) {

    return new Moto(moto.getMarca(), moto.getPlaca(), moto.getModelo(), moto.getPrecio(),
        moto.getColor(), moto.getCilindraje(),
        moto.getEsElectrica());
  }
}

package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.service.MotoSaveService;
import com.example.demo.infrastructure.dto.MotoDto;
import com.example.demo.infrastructure.repository.MotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoSaveAdapter implements MotoSaveService {

  private final MotoRepository motoRepository;

  @Override
  public Moto save(Moto moto) {
    return buildCarro(motoRepository.save(buildMotoDto(moto)));
  }

  private MotoDto buildMotoDto(Moto moto) {
    return new MotoDto(moto.getMarca(), moto.getPlaca(), moto.getModelo(), moto.getPrecio(),
        moto.getColor(),
        moto.getCilindraje(), moto.getEsElectrica());
  }

  private Moto buildCarro(MotoDto moto) {
    return new Moto(moto.getMarca(), moto.getPlaca(), moto.getModelo(), moto.getPrecio(),
        moto.getColor(),
        moto.getCilindraje(), moto.getEsElectrica());
  }
}

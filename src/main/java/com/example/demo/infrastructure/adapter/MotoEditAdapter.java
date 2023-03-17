package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Moto;
import com.example.demo.domain.service.MotoEditService;
import com.example.demo.infrastructure.repository.MotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class MotoEditAdapter implements MotoEditService {

  private final MotoRepository motoRepository;

  @Transactional
  public void editMoto(Moto moto) {
    motoRepository.updateMoto(moto.getMarca(), moto.getPlaca(), moto.getModelo(), moto.getPrecio(),
        moto.getColor(), moto.getCilindraje(), moto.getEsElectrica());
  }

}

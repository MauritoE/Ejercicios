package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.MotoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepository extends JpaRepository<MotoDto, String>,
    CrudRepository<MotoDto, String> {

  @Query(nativeQuery = true, value = "update moto_dto set marca = :marca, es_electrica = :esElectrica, modelo = :modelo, precio = :precio, color = :color, cilindraje = :cilindraje where placa = :placa")
  @Modifying
  void updateMoto(@Param("marca") String marca,
      @Param("placa") String placa,
      @Param("modelo") String modelo,
      @Param("precio") Double precio,
      @Param("color") String color,
      @Param("cilindraje") int cilindraje,
      @Param("esElectrica") Boolean esElectrica);

}


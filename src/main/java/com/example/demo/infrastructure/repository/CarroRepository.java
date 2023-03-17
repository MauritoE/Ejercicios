package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.CarroDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<CarroDto, String>,
    CrudRepository<CarroDto, String> {

  @Query(nativeQuery = true, value = "update carro_dto set marca = :marca, modelo = :modelo, precio = :precio, color = :color where placa = :placa")
  @Modifying
  void updateCarro(@Param("marca") String marca,
      @Param("placa") String placa,
      @Param("modelo") String modelo,
      @Param("precio") Double precio,
      @Param("color") String color);
}

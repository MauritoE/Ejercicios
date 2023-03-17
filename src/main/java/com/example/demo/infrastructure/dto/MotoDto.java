package com.example.demo.infrastructure.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class MotoDto extends VehiculoDto {

  private String color;
  private int cilindraje;
  private Boolean esElectrica;


  public MotoDto(String marca, String placa, String modelo, double precio, String color,
      int cilindraje, Boolean esElectrica) {
    super(marca, placa, modelo, precio);
    this.color = color;
    this.cilindraje = cilindraje;
    this.esElectrica = esElectrica;
  }

}

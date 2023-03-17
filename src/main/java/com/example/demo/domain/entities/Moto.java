package com.example.demo.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Moto extends Vehiculo {

  private String color;
  private int cilindraje;
  private Boolean esElectrica;

  public Moto(String marca, String placa, String modelo, Double precio, String color,
      int cilindraje, Boolean esElectrica) {
    super(marca, placa, modelo, precio);
    this.color = color;
    this.cilindraje = cilindraje;
    this.esElectrica = esElectrica;
  }

  @Override
  public String toString() {
    return super.toString() + "\nCilindraje: " + getCilindraje() + "\nElectrica: " + esElectrica;
  }


}
package com.example.demo.domain.entities;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public final class Carro extends Vehiculo {

  private String color;

  public Carro(String marca, String placa, String modelo, Double precio, String color) {
    super(marca, placa, modelo, precio);
    this.color = color;
  }

  @Override
  public String toString() {
    return super.toString() + " \nColor: " + getColor();
  }
}

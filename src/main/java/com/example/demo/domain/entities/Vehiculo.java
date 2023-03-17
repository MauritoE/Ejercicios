package com.example.demo.domain.entities;

import java.util.Objects;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Vehiculo implements Acelerar, Frenar, iniciarMarcha, Comparable<Vehiculo> {

  private String marca;
  private String placa;
  private String modelo;
  private Double precio;

  public Vehiculo(String marca, String placa, String modelo, Double precio) {
    this.marca = marca;
    this.placa = placa;
    this.modelo = modelo;
    this.precio = precio;
  }

  public String getPlaca() {
    return placa;
  }

  public String getModelo() {
    return modelo;
  }

  public Double getPrecio() {
    return precio;
  }

  @Override
  public String toString() {
    return "\nVehiculo: " + getClass().getSimpleName() + "\nMarca: " + getMarca() + "\nPlaca: "
        + getPlaca() +
        "\nModelo: " + getModelo() + "\nPrecio: " + getPrecio();
  }

  @Override
  public boolean equals(Object o) {
      if (this == o) {
          return true;
      }
      if (o == null) {
          return false;
      }
    Vehiculo vehiculo = (Vehiculo) o;
    return Objects.equals(marca, vehiculo.marca) && Objects.equals(placa, vehiculo.placa)
        && Objects.equals(modelo, vehiculo.modelo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marca, placa, modelo);
  }

  @Override
  public int compareTo(Vehiculo v) {
    return v.getPlaca().compareTo(this.getPlaca());
  }

}

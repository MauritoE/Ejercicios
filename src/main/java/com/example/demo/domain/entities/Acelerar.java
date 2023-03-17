package com.example.demo.domain.entities;

public interface Acelerar {

  default void acelerarVehiculo() {
    System.out.println("Acelenrando el vehículo.");
  }
}

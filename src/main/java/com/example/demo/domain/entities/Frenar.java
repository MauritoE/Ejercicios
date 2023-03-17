package com.example.demo.domain.entities;

public interface Frenar {

  default void frenar() {
    System.out.println("Frenando el Vehículo.");
  }

}

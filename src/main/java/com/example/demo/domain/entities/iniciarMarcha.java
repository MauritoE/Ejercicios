package com.example.demo.domain.entities;

public interface iniciarMarcha {

  default void iniciarMarcha() {
    System.out.println("Iniciando marcha");
  }
}

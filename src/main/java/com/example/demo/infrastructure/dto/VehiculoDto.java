package com.example.demo.infrastructure.dto;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@MappedSuperclass
public class VehiculoDto {

  private String marca;
  @Id
  private String placa;
  private String modelo;
  private double precio;
}

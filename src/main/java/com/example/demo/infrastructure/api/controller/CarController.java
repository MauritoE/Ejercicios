package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.CarroDelete;
import com.example.demo.application.CarroEdit;
import com.example.demo.application.CarroGet;
import com.example.demo.application.CarroSave;
import com.example.demo.domain.entities.Carro;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/car")
public class CarController {

  private final CarroSave carroSave;
  private final CarroGet carroGet;
  private final CarroDelete carroDelete;
  private final CarroEdit carroEdit;

  @GetMapping
  public ResponseEntity<Carro> getCar(@RequestParam String placa) {
    return ResponseEntity.ok(carroGet.getCarro(placa));
  }

  @PostMapping()
  public ResponseEntity<Carro> createCarro(@RequestBody Carro carro) {
    return new ResponseEntity<>(carroSave.saveCarro(carro), HttpStatus.CREATED);
  }

  @DeleteMapping
  public void deleteCarro(@RequestParam String placa) {
    carroDelete.deleteCarro(placa);
  }

  @PutMapping
  public void editCarro(@RequestBody Carro carro) {
    carroEdit.editCarro(carro);
  }

}


package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.MotoDelete;
import com.example.demo.application.MotoEdit;
import com.example.demo.application.MotoGet;
import com.example.demo.application.MotoSave;
import com.example.demo.domain.entities.Moto;
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
@RequestMapping(path = "/moto")
public class MotoController {

  private final MotoSave motoSave;
  private final MotoGet motoGet;
  private final MotoDelete motoDelete;

  private final MotoEdit motoEdit;

  @GetMapping
  public ResponseEntity<Moto> getMoto(@RequestParam String placa) {
    return ResponseEntity.ok(motoGet.getMoto(placa));
  }

  @PostMapping()
  public ResponseEntity<Moto> createMoto(@RequestBody Moto moto) {
    return new ResponseEntity<>(motoSave.saveMoto(moto), HttpStatus.CREATED);
  }

  @DeleteMapping
  public void deleteMoto(@RequestParam String placa) {
    motoDelete.deleteMoto(placa);
  }

  @PutMapping
  public void editMoto(@RequestBody Moto moto) {
    motoEdit.editMoto(moto);
  }

}

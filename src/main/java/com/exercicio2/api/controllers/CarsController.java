package com.exercicio2.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio2.api.dto.CarsDTO;

@RestController
@RequestMapping("/api/cars")

public class CarsController {

  @PostMapping
  public void create(@RequestBody CarsDTO req) {
    System.out.println(req.modelo());
    System.out.println(req.fabricante());
    System.out.println(req.dataFabricacao());
    System.out.println(req.valor());
    System.out.println(req.anoModelo());
  }
  
}

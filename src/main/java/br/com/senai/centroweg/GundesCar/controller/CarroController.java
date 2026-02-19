package br.com.senai.centroweg.GundesCar.controller;

import br.com.senai.centroweg.GundesCar.model.Carro;
import br.com.senai.centroweg.GundesCar.service.CarroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private final CarroService service;

    public CarroController(CarroService service){
        this.service=service;
    }

    @PostMapping("/add")
    public Carro addCarro(@RequestBody Carro carro){

       try{
           return service.cadastrarCarro(carro);
       }catch (SQLException e){
           throw new RuntimeException(e.getMessage());
       }
    }

    @GetMapping("/list")
    public List<Carro> getCarros(){
        try {
            return service.verCarros();

        }catch(SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping("/list/{marca}")
    public List<Carro> getCarrosFiltrados(@PathVariable String marca){
        try {
            return service.verCarrosFiltrados(marca);

        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @GetMapping("/comprar/{id}")
    public ResponseEntity<String> comprarCarro(@PathVariable int id){
        try{
            service.escolherCarro(id);
            service.comprarCarro(id);
            return ResponseEntity.status(201).body("Carro comprado com sucesso!");

        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }

}

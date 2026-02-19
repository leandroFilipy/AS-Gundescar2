package br.com.senai.centroweg.GundesCar.service;

import br.com.senai.centroweg.GundesCar.model.Carro;
import br.com.senai.centroweg.GundesCar.repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CarroService {

    private final CarroRepository carroRepository;

    public CarroService (CarroRepository carroRepository){
        this.carroRepository=carroRepository;
    }

    public Carro cadastrarCarro (Carro carro) throws SQLException, SQLException {
        return carroRepository.cadastrarCarro(carro);
    }

    public List<Carro> verCarros() throws SQLException{
        return carroRepository.verCarros();
    }

    public List<Carro> verCarrosFiltrados (String marca) throws SQLException {
        return carroRepository.verCarrosFiltrados(marca);
    }


    public Carro escolherCarro(int id) throws SQLException{
        return carroRepository.escolherCarro(id);
    }

    public void comprarCarro(int id) throws SQLException{
        carroRepository.comprarCarro(id);
    }
}

package br.com.senai.centroweg.GundesCar;

import br.com.senai.centroweg.GundesCar.model.Carro;

public interface RegraDeDesconto {

    boolean descontoSeAplica(int ano);
    double calcularDesconto(double preco);

}

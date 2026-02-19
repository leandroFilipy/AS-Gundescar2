package br.com.senai.centroweg.GundesCar.model.anos;

import br.com.senai.centroweg.GundesCar.RegraDeDesconto;
import org.springframework.stereotype.Component;

@Component
public class Ano2024 implements RegraDeDesconto {

    @Override
    public boolean descontoSeAplica (int ano) {
        return ano == 2024;
    }
    @Override
    public double calcularDesconto(double preco){
        return preco * 0.95;
    }
}

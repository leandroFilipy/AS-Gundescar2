package br.com.senai.centroweg.GundesCar.service;

import br.com.senai.centroweg.GundesCar.RegraDeDesconto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CalculadoraDeDesconto {

    private final List<RegraDeDesconto> regras;

    @Autowired
    public CalculadoraDeDesconto(List<RegraDeDesconto> regras){
        this.regras = regras;
    }

    public double calcularPrecoFinal(int ano, double precoOriginal) {
        return regras.stream()
                .filter(regra -> regra.descontoSeAplica(ano))
                .findFirst()
                .map(regra -> regra.calcularDesconto(precoOriginal))
                .orElse(precoOriginal);
    }
}

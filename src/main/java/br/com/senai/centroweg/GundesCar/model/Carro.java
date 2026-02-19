package br.com.senai.centroweg.GundesCar.model;

public class Carro {

    private int id;
    private String modelo;
    private int ano;
    private String marca;
    private String cor;
    private double preco;
    private double peso;

    public Carro(int id, String modelo,int ano, String marca, String cor, double preco, double peso){
        this.id = id;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
        this.peso = peso;
    }

    public Carro(String modelo,int ano, String marca, String cor, double preco, double peso){
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
        this.peso = peso;
    }

    public Carro(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
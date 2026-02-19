package br.com.senai.centroweg;

import br.com.senai.centroweg.model.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("GC-1", "ferrari", "Citroen", "Rosa", 2024, 9000000, 20000);


        double valorCarro = carro.getPreco();
        double taxa;

        if(carro.getModelo().equalsIgnoreCase("Picasso")){
            if(carro.getAno() == 2023){
                taxa = 1000;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2024){
                taxa = 500;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2025){
                taxa = 100;
                valorCarro -= taxa;
            }

        } else if (carro.getModelo().equalsIgnoreCase("Ferrari")) {
            if(carro.getAno() == 2023){
                taxa = 1000;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2024){
                taxa = 500;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2025){
                taxa = 100;
                valorCarro -= taxa;
            }

        } else if (carro.getModelo().equalsIgnoreCase("Lamborghini")){
            if(carro.getAno() == 2023){
                taxa = 1000;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2024){
                taxa = 500;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2025){
                taxa = 100;
                valorCarro -= taxa;
            }

        }  else if (carro.getModelo().equalsIgnoreCase("Belina")) {
            if(carro.getAno() == 2023){
                taxa = 1000;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2024){
                taxa = 500;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2025){
                taxa = 100;
                valorCarro -= taxa;
            }

        } else if (carro.getModelo().equalsIgnoreCase("Aircross")){
            if(carro.getAno() == 2023){
                taxa = 1000;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2024){
                taxa = 500;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2025){
                taxa = 100;
                valorCarro -= taxa;
            }

        } else if (carro.getModelo().equalsIgnoreCase("CIVIC")) {
            if(carro.getAno() == 2023){
                taxa = 1000;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2024){
                taxa = 500;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2025){
                taxa = 100;
                valorCarro -= taxa;
            }

        } else if (carro.getModelo().equalsIgnoreCase("Kwid")) {
            if(carro.getAno() == 2023){
                taxa = 1000;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2024){
                taxa = 500;
                valorCarro -= taxa;
            } else if(carro.getAno() == 2025){
                taxa = 100;
                valorCarro -= taxa;
            }
        }

        System.out.println("O valor do carro é: " + valorCarro);
    }
}
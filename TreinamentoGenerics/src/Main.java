import Carros.Carro;
import Carros.Chevrolet;
import Carros.Fiat;
import Carros.Peugeot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro<>(0, 0);
        Peugeot peugeot208 = new Peugeot(208, "Não identificado");
        Chevrolet tracker = new Chevrolet("Tracker", 2022);
        Fiat pulse = new Fiat("Pulse", 2023);

        List<Carro> carroList = new ArrayList<>();
        carroList.add(peugeot208);
        carroList.add(tracker);
        carroList.add(pulse);

        carro.imprimirCarros(carroList);


    }
}
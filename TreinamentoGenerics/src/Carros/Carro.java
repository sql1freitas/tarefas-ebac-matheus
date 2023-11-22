package Carros;

import java.util.List;

public class Carro <T, E>{

    private T modelo;
    private E ano;



    public Carro(T modelo, E ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public <T> void imprimirCarros(List<T> lista){
        for (T carro: lista) {
            System.out.println(carro);
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo=" + modelo +
                ", ano=" + ano +
                '}';
    }

    public T getModelo() {
        return modelo;
    }

    public void setModelo(T modelo) {
        this.modelo = modelo;
    }

    public E getAno() {
        return ano;
    }

    public void setAno(E ano) {
        this.ano = ano;
    }
}

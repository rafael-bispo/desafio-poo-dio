package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    //Atributos
    private LocalDate data;

    //Construtor
    public Mentoria() {
    }

    //Getters
    public LocalDate getData() {
        return data;
    }

    //Setters
    public void setData(LocalDate data) {
        this.data = data;
    }

    //toString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getTitulo() + '\'' +
                ", data=" + data +
                '}';
    }

    //Métodos
    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

}

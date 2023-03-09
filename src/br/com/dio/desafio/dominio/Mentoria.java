package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    //Atributos
    private String titulo;
    private String descricao;
    private LocalDate data;

    //Construtor


    public Mentoria() {
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //toString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}

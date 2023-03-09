package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    //Atributos
    private int cargaHoraria;

    //Construtor
    public Curso() {
    }

    //Getters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    //Setters
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //toString

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    //Métodos
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
}

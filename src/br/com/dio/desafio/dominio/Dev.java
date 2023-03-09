package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    //Atributos
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    //Getter e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //Equals e HashCode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    //Métodos (Regras de Negócio)
    public void inscreverBootcamp(Bootcamp bootcamp){
        //inscrevendo dev em todos os cursos do Bootcamp
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //inscrevendo o dev no bootcamp de modo geral.
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir(){
        //É tirar um conteúdo de inscrito e colocar em concluído
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        if(conteudo.isPresent()){
            //adição ao concluído
            this.conteudosConcluidos.add(conteudo.get());

            //remoção do inscrito
            this.conteudosInscritos.remove(conteudo.get());
        } else{
            System.err.println("Você não está matriculado em nenhum conteúdo! Contate o administrador");
        }
    }

    public double calcularTotalXp(){
        //Somatorio do XP do dev atual
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
    }
}

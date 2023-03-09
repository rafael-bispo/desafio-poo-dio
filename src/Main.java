import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Criando objeto curso1
        Curso curso1 = new Curso();

        //Atribuindo valores ao objeto por meio de set
        curso1.setTitulo("Programação Orientada a Objetos com Java");
        curso1.setDescricao("Curso para aprender orientação a objetos a partir da linguagem Java");
        curso1.setCargaHoraria(4);

        //Criando objeto curso2
        Curso curso2 = new Curso();

        //Atribuindo valores ao objeto por meio de set
        curso2.setTitulo("Debuggig Java");
        curso2.setDescricao("Curso para aprender debugging em IDE Java");
        curso2.setCargaHoraria(4);

        //Criando objeto curso2
        Mentoria mentoria1 = new Mentoria();

        //Atribuindo valores ao objeto por meio de set
        mentoria1.setTitulo("Mentoria em Java");
        mentoria1.setDescricao("Mentoria para desenvolver sua carreira como programador Java.");
        mentoria1.setData(LocalDate.now());


        //Criando a instanciando Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java OrangeTech");
        bootcamp.setDescricao("Bootcamp voltado a programação backend com Java.");

        //Adicionando os conteúdos
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        //Criando Devs e instanciando
        Dev dev1 = new Dev();
        dev1.setNome("Rafael Bispo");

        Dev dev2 = new Dev();
        dev2.setNome("Leticia Gois");

        //Mostrando conteúdos inscritos de Devs recém-criados
        System.out.println("Devs não matriculados:");
        System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("XP atual: " + dev1.calcularTotalXp());
        System.out.println("Conteúdos inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("XP atual: " + dev2.calcularTotalXp());

        //Matriculando Devs no Bootcamp
        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        //Mostrando conteúdos inscritos de Devs após matrícula
        System.out.println("\n\nConteúdos dos Devs após matrícula:");
        System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("XP atual: " + dev1.calcularTotalXp());
        System.out.println("Conteúdos inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("XP atual: " + dev2.calcularTotalXp());

        //Conteúdos concluídos sem ainda ter cursado
        System.out.println("\n\nConteúdos concluídos sem ainda ter cursado:");
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP atual: " + dev1.calcularTotalXp());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP atual: " + dev2.calcularTotalXp());

        //Fazendo progressão
        dev1.progredir();
        dev2.progredir();

        //Exibindo após progressão
        System.out.println("\n\nConteúdos concluídos após 1 progressão:");
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP atual: " + dev1.calcularTotalXp());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP atual: " + dev2.calcularTotalXp());
        System.out.println("\nConteúdos inscritos após 1 progressão:");
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());

        //Fazendo progressão apenas de dev1
        dev1.progredir();

        //Exibindo após progressão
        System.out.println("\n\nConteúdos concluídos:");
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP atual: " + dev1.calcularTotalXp());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP atual: " + dev2.calcularTotalXp());
        System.out.println("\nConteúdos inscritos:");
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());

        //Fazendo dev 2 concluir ocurso
        dev2.progredir();
        dev2.progredir();

        //Exibindo após progressão
        System.out.println("\n\nConteúdos concluídos:");
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP atual: " + dev1.calcularTotalXp());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP atual: " + dev2.calcularTotalXp());
        System.out.println("\nConteúdos inscritos:");
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());

        //Por fim dev1 concluindo também
        dev1.progredir();

        //Exibindo após progressão
        System.out.println("\n\nConteúdos concluídos:");
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP atual: " + dev1.calcularTotalXp());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP atual: " + dev2.calcularTotalXp());
        System.out.println("\nConteúdos inscritos:");
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());

        /*System.out.println(curso1);

        System.out.println(curso2);

        System.out.println(mentoria1);*/

    }

}
import br.com.dio.desafio.dominio.Curso;
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


        System.out.println(curso1);

        System.out.println(curso2);

        System.out.println(mentoria1);

    }

}
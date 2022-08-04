package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Mentoria mentoria1 = new Mentoria();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		
//		System.out.println(curso1);
//		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devWivson = new Dev();
		devWivson.setNome("Wivson");
		devWivson.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos concluídos Wivson" + devWivson.getConteudosInscritos());
		devWivson.progredir();
		devWivson.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos Wivson" + devWivson.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Wivson" + devWivson.getConteudosConcluidos());
		System.out.println("XP:" + devWivson.calcularTotalXp());
		
		System.out.println("-------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluídos João" + devWivson.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());
		
		
	}

}

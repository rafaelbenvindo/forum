package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<Topico> lista() {
		return Arrays.asList(
				new Topico("Duvida", "Duvida com Spring 1", new Curso("Spring", "Programacao")),
				new Topico("Duvida", "Duvida com Spring 2", new Curso("Spring", "Programacao")),
				new Topico("Duvida", "Duvida com Spring 3", new Curso("Spring", "Programacao"))
				);
	}
}
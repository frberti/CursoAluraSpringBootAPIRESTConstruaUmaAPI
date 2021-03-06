package br.com.alura.forum.controller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
	
	//Padrão Spring gerando a query
	List<Topico> findByCursoNome(String nomeCurso);
	
	//ou
	
	@Query("SELECT t FROM Topico t WHERE t.curso.nome= :nomeCurso")
	List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);


}

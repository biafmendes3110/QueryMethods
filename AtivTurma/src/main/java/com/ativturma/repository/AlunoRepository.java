package com.ativturma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ativturma.entity.Aluno;

public interface AlunoRepository  extends JpaRepository <Aluno, Long> {
	List<Aluno> findByCidade (String Cidade);
	List<Aluno> findByNome (String Nome);
	List<Aluno> findByRenda (String Renda);
	List<Aluno> findByRa (String Ra);
	List<Aluno> findByCidadeAndRenda (String Cidade, String Renda);
	
	

}

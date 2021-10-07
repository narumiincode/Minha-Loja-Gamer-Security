package br.org.generation.minhalojagamer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.minhalojagamer.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long > {
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}


package mx.tex.lab.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.tex.lab.entity.Dragon;

@Repository
public interface DragonRepository extends JpaRepository<Dragon, Long>{
	
}

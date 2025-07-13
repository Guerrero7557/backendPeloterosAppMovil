package pe.com.peloterosback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.peloterosback.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	

}

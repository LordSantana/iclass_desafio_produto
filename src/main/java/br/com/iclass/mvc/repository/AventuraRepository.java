package br.com.iclass.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.iclass.mvc.entity.Aventura;

@Repository
public interface AventuraRepository extends JpaRepository<Aventura, Long> {

}

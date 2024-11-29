package co.imp.tech.repository;

import co.imp.tech.model.Pertanggungan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PertanggunganRepository extends JpaRepository<Pertanggungan, Long> {
}
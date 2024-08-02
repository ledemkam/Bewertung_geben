package tech.ledemkam.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ledemkam.sa.entities.Gefühlt;

public interface GefühltRepository extends JpaRepository<Gefühlt, Integer> {
}

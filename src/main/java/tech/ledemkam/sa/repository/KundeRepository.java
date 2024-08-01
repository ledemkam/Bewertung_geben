package tech.ledemkam.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ledemkam.sa.entities.Kunde;

public interface KundeRepository extends JpaRepository<Kunde, Integer>{
}

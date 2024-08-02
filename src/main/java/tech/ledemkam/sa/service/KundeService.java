package tech.ledemkam.sa.service;

import org.springframework.stereotype.Service;
import tech.ledemkam.sa.entities.Kunde;
import tech.ledemkam.sa.repository.KundeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class KundeService {

    private KundeRepository kundeRepository;

    public KundeService(KundeRepository kundeRepository) {
        this.kundeRepository = kundeRepository;
    }

    public void createKunde(Kunde kunde) {
        Kunde kundeInDB = this.kundeRepository.findByEmail(kunde.getEmail());
        if (kundeInDB == null) {
            this.kundeRepository.save(kunde);
        }

    }

    public List<Kunde> suchen() {
        return this.kundeRepository.findAll();
    }

    public Kunde lesen(int id) {
        Optional<Kunde> optionalKunde = this.kundeRepository.findById(id);
        return optionalKunde.orElse(null);
    }
}

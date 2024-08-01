package tech.ledemkam.sa.service;

import org.springframework.stereotype.Service;
import tech.ledemkam.sa.entities.Kunde;
import tech.ledemkam.sa.repository.KundeRepository;

@Service
public class KundeService {

    private KundeRepository kundeRepository;

    public KundeService(KundeRepository kundeRepository) {
        this.kundeRepository = kundeRepository;
    }

    public void createKunde(Kunde kunde) {
        kundeRepository.save(kunde);
    }

}

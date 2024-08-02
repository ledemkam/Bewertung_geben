package tech.ledemkam.sa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.ledemkam.sa.entities.Kunde;
import tech.ledemkam.sa.service.KundeService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "kunde")
public class KundeController {

    private KundeService kundeService;

    public KundeController(KundeService kundeService) {
        this.kundeService = kundeService;
    }


    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void createKunde(@RequestBody Kunde kunde) {
         this.kundeService.createKunde(kunde);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Kunde> suchen() {
        return this.kundeService.suchen();
    }

    @GetMapping(path = "{id}",produces = APPLICATION_JSON_VALUE)
    public Kunde lesen(@PathVariable int id) {
        return this.kundeService.lesen(id);
    }
}

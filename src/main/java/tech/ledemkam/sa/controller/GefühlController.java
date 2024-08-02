package tech.ledemkam.sa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ledemkam.sa.entities.Gefühlt;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "gefühl", produces = APPLICATION_JSON_VALUE)
public class GefühlController {

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void  createGefühl(@RequestBody Gefühlt gefühl) {

    }
}

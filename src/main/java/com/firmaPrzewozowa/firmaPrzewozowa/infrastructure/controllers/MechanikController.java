package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.controllers;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Autobus;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Mechanik;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.MechanikWAutobusie;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.services.MechanikService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MechanikController {

    public MechanikService mechanikService;

    public MechanikController(MechanikService mechanikService) {
        this.mechanikService = mechanikService;
    }

    @CrossOrigin("*")
    @GetMapping("/mechanicy")
    public ResponseEntity<List<Mechanik>> getMechanicy() {
        List<Mechanik> znalezieniMechanicy = mechanikService.findAllMechanics();

        return new ResponseEntity<>(znalezieniMechanicy, HttpStatus.OK);
    }

    @CrossOrigin("*")
    @GetMapping("/mechanik/{id}")
    public ResponseEntity<Mechanik> oneTask(@PathVariable long id) {
        Optional<Mechanik> optionalMechanik = mechanikService.findById(id);

        if (optionalMechanik.isPresent()) {
            return new ResponseEntity<>(optionalMechanik.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//    @CrossOrigin("*")
//    @GetMapping("/mechanik/{id}/autobusy")
//    public ResponseEntity<MechanikWAutobusie[]> getAutobusyMechanika(@PathVariable long id){
//        Optional<MechanikWAutobusie[]> optionalAutobusy = mechanikService.findAutobusyMechanika(id);
//
//        if (optionalAutobusy.isPresent()){
//            return ResponseEntity<>(optionalAutobusy.get(), HttpStatus.OK);
//        }
//
//        return ResponseEntity<>(HttpStatus.NOT_FOUND)
//    }

}

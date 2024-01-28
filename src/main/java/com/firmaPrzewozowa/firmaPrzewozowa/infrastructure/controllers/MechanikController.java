package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.controllers;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Mechanik;
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

//    @CrossOrigin("*")
//    @GetMapping("/tasks/{id}")
//    public ResponseEntity<Mechanik> oneTask(@PathVariable long id) {
////        int testId = 1;
//        Optional<Mechanik> optionalTask = mechanikService.findById(id);
//
//        if (optionalTask.isPresent()) {
//            return new ResponseEntity<>(optionalTask.get(), HttpStatus.OK);
//        }
//
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
}

package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.controllers;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Autobus;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.requests.CreateAutobusInput;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.services.AutobusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AutobusController {
    public AutobusService autobusService;

    public AutobusController(AutobusService autobusService) {
        this.autobusService = autobusService;
    }

    @CrossOrigin("*")
    @PostMapping("/autobusy")
    public ResponseEntity<Autobus> createAutobus(@RequestBody CreateAutobusInput createAutobusInput) {
        Autobus autobusCreated = autobusService.create(createAutobusInput.ToAutobus());
        return new ResponseEntity <>(autobusCreated, HttpStatus.CREATED);
    }

    @CrossOrigin("*")
    @GetMapping("/autobusy")
    public ResponseEntity<List<Autobus>> getAutobus() {
        List<Autobus> znalezioneAutobusy = autobusService.findAll();

        return new ResponseEntity<>(znalezioneAutobusy, HttpStatus.OK);
    }

    @CrossOrigin("*")
    @GetMapping("/autobusy/{id}")
    public ResponseEntity<Autobus> oneTask(@PathVariable int id) {
        Optional<Autobus> optionalAutobus = autobusService.findById(id);

        if (optionalAutobus.isPresent()) {
            return new ResponseEntity<>(optionalAutobus.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

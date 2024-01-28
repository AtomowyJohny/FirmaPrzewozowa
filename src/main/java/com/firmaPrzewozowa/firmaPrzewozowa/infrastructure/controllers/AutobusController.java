package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.controllers;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Autobus;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.requests.CreateAutobusInput;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.services.AutobusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}

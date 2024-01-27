package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.controllers;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.Autobus;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.requests.CreateAutobusInput;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.services.AutobusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutobusController {
    public AutobusService autobusService;

    public AutobusController(AutobusService autobusService) {
        this.autobusService = autobusService;
    }


    @PostMapping("/autobusy")
    public ResponseEntity<Autobus> createAutobus(@RequestBody CreateAutobusInput createAutobusInput) {
        Autobus autobusCreated = autobusService.create(createAutobusInput.ToAutobus());
        return new ResponseEntity <>(autobusCreated, HttpStatus.CREATED);
    }


    @GetMapping("/autobusy")
    public ResponseEntity<List<Autobus>> getAutobus() {
        List<Autobus> znalezioneAutobusy = autobusService.findAll();

        return new ResponseEntity<>(znalezioneAutobusy, HttpStatus.OK);
    }
}

package com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.controllers;

import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.dto.AutobusDto;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.entities.*;
import com.firmaPrzewozowa.firmaPrzewozowa.infrastructure.services.MechanikService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class MechanikController {

    public MechanikService mechanikService;

    public ModelMapper mapper;

    public MechanikController(MechanikService mechanikService) {
        this.mechanikService = mechanikService;
        this.mapper = new ModelMapper();
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

    @CrossOrigin("*")
    @GetMapping("/mechanik/{id}/autobusy")
    public ResponseEntity<List<AutobusDto>> getAutobusyMechanika(@PathVariable long id){
        List<Autobus> autobusy = mechanikService.findAutobusyMechanika(id);

        return new ResponseEntity<>(
                autobusy.stream()
                        .map(this::fromEntity)
                        .toList(),
                HttpStatus.OK
        );
    }

    private AutobusDto fromEntity(Autobus autobus) {
        if(autobus instanceof AutobusElektryczny autobusElektryczny) {
            return new AutobusDto(
                    autobusElektryczny.getId(),
                    autobusElektryczny.getPrzebieg(),
                    autobusElektryczny.getRokProdukcji(),
                    autobusElektryczny.getModel(),
                    autobusElektryczny.getMocNetto(),
                    autobusElektryczny.getIloscMiejsc(),
                    autobusElektryczny.getIloscPakietowZasilajacych(),
                    autobusElektryczny.getPoziomNaladowania()
                );
        }

        if(autobus instanceof AutobusSilnikowy autobusSilnikowy) {
            return new AutobusDto(
                    autobusSilnikowy.getId(),
                    autobusSilnikowy.getPrzebieg(),
                    autobusSilnikowy.getRokProdukcji(),
                    autobusSilnikowy.getModel(),
                    autobusSilnikowy.getMocNetto(),
                    autobusSilnikowy.getIloscMiejsc(),
                    null,
                    null
            );
        }

        if(autobus instanceof AutobusHybrydowy autobusHybrydowy) {
            return new AutobusDto(
                    autobusHybrydowy.getId(),
                    autobusHybrydowy.getAutobusSilnikowy().getPrzebieg(),
                    autobusHybrydowy.getAutobusSilnikowy().getRokProdukcji(),
                    autobusHybrydowy.getAutobusSilnikowy().getModel(),
                    autobusHybrydowy.getAutobusSilnikowy().getMocNetto(),
                    autobusHybrydowy.getAutobusSilnikowy().getIloscMiejsc(),
                    autobusHybrydowy.getAutobusElektryczny().getIloscPakietowZasilajacych(),
                    autobusHybrydowy.getAutobusElektryczny().getPoziomNaladowania()
            );
        }
        throw new RuntimeException();
    }
}

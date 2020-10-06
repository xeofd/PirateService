package com.codeclan.example.PirateService.controllers;

import com.codeclan.example.PirateService.models.Raid;
import com.codeclan.example.PirateService.repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

    @GetMapping(value = "/raids")
    public ResponseEntity<List<Raid>> getAllShips() {
        return new ResponseEntity<>(raidRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping (value = "/raids/{id}")
    public ResponseEntity getShip(@PathVariable Long id) {
        return new ResponseEntity(raidRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/raids")
    public ResponseEntity<Raid> postShip(@RequestBody Raid raid) {
        raidRepository.save(raid);

        return new ResponseEntity<>(raid, HttpStatus.CREATED);
    }
}

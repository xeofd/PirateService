package com.codeclan.example.PirateService.repositories;

import com.codeclan.example.PirateService.models.Pirate;
import com.codeclan.example.PirateService.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

    List<Pirate> findPirateByShip(Ship ship);

    List<Pirate> findPiratesByAgeGreaterThan(int age);

}

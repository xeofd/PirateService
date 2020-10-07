package com.codeclan.example.PirateService.repositories;

import com.codeclan.example.PirateService.models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface RaidRepository extends JpaRepository<Raid, Long> {

    List<Raid> findRaidByLocation(String location);

}

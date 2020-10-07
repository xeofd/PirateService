package com.codeclan.example.PirateService;

import com.codeclan.example.PirateService.models.Pirate;
import com.codeclan.example.PirateService.models.Raid;
import com.codeclan.example.PirateService.models.Ship;
import com.codeclan.example.PirateService.repositories.RaidRepository;
import com.codeclan.example.PirateService.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.codeclan.example.PirateService.repositories.PirateRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PirateServiceApplicationTests {

	// Setup
	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	// Tests

	@Test
	void contextLoads() {
	}

	@Test // Test 1: Can save to db
	void createPirate() {
//		Pirate jack = new Pirate("Jack", "Sparrow", 32);
//		pirateRepository.save(jack);
	}

	@Test
	public void canFindPirateForShip() {
		Ship ship = shipRepository.getOne(1L);
		Pirate pirate1 = new Pirate("Joe", "Bla", 55, ship);
		Pirate pirate2 = new Pirate("Hector", "Barbosa", 69, ship);

		pirateRepository.save(pirate1);
		pirateRepository.save(pirate1);

		List<Pirate>  listOfPiratesFound = pirateRepository.findPirateByShip(ship);

		assertEquals(2, listOfPiratesFound.size());
	}

	@Test
	public void canFindPirateByAge() {
		List<Pirate> piratesFound = pirateRepository.findPiratesByAgeGreaterThan(30);

		assertEquals(7, piratesFound.size());
	}

	@Test
	public void findRaidByLocation() {
		List<Raid> foundRaid = raidRepository.findRaidByLocation("Tortuga");

		assertEquals("Tortuga", foundRaid.get(1).getLocation());
	}

}

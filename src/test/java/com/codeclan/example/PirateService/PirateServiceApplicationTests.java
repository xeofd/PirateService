package com.codeclan.example.PirateService;

import com.codeclan.example.PirateService.models.Pirate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.codeclan.example.PirateService.repositories.PirateRepository;

@SpringBootTest
class PirateServiceApplicationTests {

	// Setup
	@Autowired
	PirateRepository pirateRepository;

	// Tests

	@Test
	void contextLoads() {
	}

	@Test // Test 1: Can save to db
	void createPirate() {
//		Pirate jack = new Pirate("Jack", "Sparrow", 32);
//		pirateRepository.save(jack);
	}

}

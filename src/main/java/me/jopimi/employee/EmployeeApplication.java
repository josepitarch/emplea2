package me.jopimi.employee;

import lombok.RequiredArgsConstructor;
import me.jopimi.employee.repositories.UserPopulationJpaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class EmployeeApplication implements CommandLineRunner {

	private final UserPopulationJpaRepository userPopulationJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var response = userPopulationJpaRepository.findPopulation("COORDINATOR_C_PLT", 9999);
		int x = 2;
	}
}

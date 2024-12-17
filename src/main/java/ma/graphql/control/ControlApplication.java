package ma.graphql.control;

import ma.graphql.control.dto.EtudiantDTO;
import ma.graphql.control.service.EtudiantService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlApplication.class, args);
	}

	@Bean
	CommandLineRunner start(EtudiantService etudiantService) {
		return args -> {
			// Ajouter des chercheurs par défaut au démarrage
			etudiantService.saveEtudiants(
					List.of(
							new EtudiantDTO(),
							new EtudiantDTO() {{
								setNom("Doe");
								setEmail("john.doe@example.com");
								setDateNaissance(new Date(2000 - 1900, 1, 15));
							}},
							new EtudiantDTO() {{
								setNom("Doe");
								setEmail("john.doe@example.com");
								setDateNaissance(new Date(2000 - 1900, 1, 15));
							}},
							new EtudiantDTO() {{
								setNom("Doe");
								setEmail("john.doe@example.com");
								setDateNaissance(new Date(2000 - 1900, 1, 15));
							}},
							new EtudiantDTO() {{
								setNom("Doe");
								setEmail("john.doe@example.com");
								setDateNaissance(new Date(2000 - 1900, 1, 15));
							}}
					)
			);
		};
	}

}


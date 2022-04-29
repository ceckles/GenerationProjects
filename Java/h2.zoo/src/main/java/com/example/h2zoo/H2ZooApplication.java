package com.example.h2zoo;

import com.example.h2zoo.model.Avian;
import com.example.h2zoo.model.Mammals;
import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repositiry.AvianRepository;
import com.example.h2zoo.repositiry.MammalRepository;
import com.example.h2zoo.repositiry.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(H2ZooApplication.class, args);

		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);
		MammalRepository mammalRepository =
				configurableApplicationContext.getBean(MammalRepository.class);
		AvianRepository avianRepository =
				configurableApplicationContext.getBean(AvianRepository.class);

		//Reptile
		Reptile kingCobra = new Reptile("Kai","Snake","Black","Carnivore");
		Reptile lizard = new Reptile("Sally", "Lizard", "Green", "Omnivore");
		reptileRepository.saveAll(List.of(kingCobra,lizard));

		//Mammals
		Mammals blackBear = new Mammals("Bo-boo","Black Bear","Black","Omnivore");
		Mammals panda = new Mammals("Spot","Panda","Black & White", "Herbivore");
		mammalRepository.saveAll(List.of(blackBear,panda));

		//Avian
		Avian blueJ = new Avian("Buck", "Cyanocitta cristata","Blue & White & Black","Paleo");
		Avian vulture = new Avian("Wringles","Turkey Vulture","Brown & White", "Scavanger");
		avianRepository.saveAll(List.of(blueJ,vulture));
 	}

}

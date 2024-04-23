package com.tp.hospitalapp;

import com.tp.hospitalapp.entities.Patient;
import com.tp.hospitalapp.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalAppApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(HospitalAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null,"Othman",new Date(),false,36));
		patientRepository.save(new Patient(null,"Jubil",new Date(),false,5130));
		patientRepository.save(new Patient(null,"Moha",new Date(),true,147));
	}
}

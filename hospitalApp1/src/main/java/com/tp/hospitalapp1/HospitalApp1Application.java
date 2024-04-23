package com.tp.hospitalapp1;

import com.tp.hospitalapp1.entities.Patient;
import com.tp.hospitalapp1.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalApp1Application {

    public static void main(String[] args) {
        SpringApplication.run(HospitalApp1Application.class, args);
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(new Patient(null,"Othman",new Date(),false,536));
            patientRepository.save(new Patient(null,"Jubil",new Date(),false,5130));
            patientRepository.save(new Patient(null,"Moha",new Date(),true,147));
        };
    }

}

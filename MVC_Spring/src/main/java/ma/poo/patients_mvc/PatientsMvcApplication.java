package ma.poo.patients_mvc;

import ma.poo.patients_mvc.entities.Patient;
import ma.poo.patients_mvc.repositories.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication implements CommandLineRunner {
    @Autowired
    PatientRepo patientRepo;


    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        patientRepo.save(new Patient(null,"Hassan",new Date(),false,12));
//        patientRepo.save(new Patient(null,"Mohammed",new Date(),true,321));
//        patientRepo.save(new Patient(null,"Yasmine",new Date(),false,65));
//        patientRepo.save(new Patient(null,"Karima",new Date(),true,44));
//        patientRepo.save(new Patient(null, "Ali", new Date(), true, 78));
//        patientRepo.save(new Patient(null, "Amina", new Date(), false, 150));
//        patientRepo.save(new Patient(null, "Khaled", new Date(), true, 45));
//        patientRepo.save(new Patient(null, "Fatima", new Date(), false, 300));
//        patientRepo.save(new Patient(null, "Sara", new Date(), true, 120));
//        patientRepo.save(new Patient(null, "Youssef", new Date(), false, 210));
//        patientRepo.save(new Patient(null, "Zineb", new Date(), true, 60));
//        patientRepo.save(new Patient(null, "Rachid", new Date(), false, 85));
//        patientRepo.save(new Patient(null, "Laila", new Date(), true, 175));
//        patientRepo.save(new Patient(null, "Said", new Date(), false, 250));
//        patientRepo.save(new Patient(null, "Imane", new Date(), true, 90));
//        patientRepo.save(new Patient(null, "Omar", new Date(), false, 155));
//        patientRepo.save(new Patient(null, "Nadia", new Date(), true, 180));
//        patientRepo.save(new Patient(null, "Mourad", new Date(), false, 95));
//        patientRepo.save(new Patient(null, "Siham", new Date(), true, 135));
//        patientRepo.save(new Patient(null, "Yassine", new Date(), false, 65));
//        patientRepo.save(new Patient(null, "Samira", new Date(), true, 220));
//        patientRepo.save(new Patient(null, "Badr", new Date(), false, 40));
//        patientRepo.save(new Patient(null, "Karim", new Date(), true, 110));
//        patientRepo.save(new Patient(null, "Ilham", new Date(), false, 190));
//        patientRepo.save(new Patient(null, "Anas", new Date(), true, 175));
//        patientRepo.save(new Patient(null, "Sanaa", new Date(), false, 145));
//        patientRepo.save(new Patient(null, "Hakim", new Date(), true, 205));
//        patientRepo.save(new Patient(null, "Meryem", new Date(), false, 300));
//        patientRepo.save(new Patient(null, "Farid", new Date(), true, 100));
//        patientRepo.save(new Patient(null, "Latifa", new Date(), false, 210));
//        patientRepo.save(new Patient(null, "Ahmed", new Date(), true, 85));
//        patientRepo.save(new Patient(null, "Hind", new Date(), false, 275));
//        patientRepo.save(new Patient(null, "Nour", new Date(), true, 55));
//        patientRepo.save(new Patient(null, "Mustapha", new Date(), false, 95));
//        patientRepo.save(new Patient(null, "Salma", new Date(), true, 240));
//        patientRepo.save(new Patient(null, "Ismail", new Date(), false, 125));
        patientRepo.findAll().forEach(patient -> {
            System.out.println(patient.getName());
        });
    }
}

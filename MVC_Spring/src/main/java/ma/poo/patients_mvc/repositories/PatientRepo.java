package ma.poo.patients_mvc.repositories;

import ma.poo.patients_mvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Long> {
    Page<Patient> findByNameContainsIgnoreCase(String kw, Pageable pageable);
}

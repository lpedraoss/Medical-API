package med.voll.api.controller;

import lombok.Setter;
import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorRepository;
import med.voll.api.doctor.MedicalRecordData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class DoctorController {
    @Autowired
    private DoctorRepository doctorRepository;
    @PostMapping
    public void registerDoctor(@RequestBody MedicalRecordData medicalRecordData){
        System.out.println(medicalRecordData);
        doctorRepository.save(new Doctor(medicalRecordData));
    }
}

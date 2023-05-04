package med.voll.api.controller;

import med.voll.api.doctor.MedicalRecordData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class DoctorController {
    @PostMapping
    public void registerDoctor(@RequestBody MedicalRecordData medicalRecordData){
        System.out.println(medicalRecordData);
    }
}

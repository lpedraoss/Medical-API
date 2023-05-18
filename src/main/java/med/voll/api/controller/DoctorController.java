package med.voll.api.controller;

import jakarta.validation.Valid;
import lombok.Setter;
import med.voll.api.doctor.DataListDoctor;
import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorRepository;
import med.voll.api.doctor.MedicalRecordData;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class DoctorController {
    @Autowired
    private DoctorRepository doctorRepository;
    @PostMapping
    public void registerDoctor(@RequestBody @Valid MedicalRecordData medicalRecordData){
        System.out.println(medicalRecordData);
        doctorRepository.save(new Doctor(medicalRecordData));
    }
    @GetMapping
    public List<DataListDoctor> doctorList(){
        return doctorRepository.findAll().stream().map(DataListDoctor::new).toList();
    }
    @GetMapping("/sorter")
    public Page<DataListDoctor> doctorListOrder(Pageable paginacion){
        return doctorRepository.findAll(paginacion).map(DataListDoctor::new);
    }
}

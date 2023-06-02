/**
 * Created By Krishna Shinde
 * Date : 01-06-2023
 * Time : 11:55
 * Project: SpringbootApplication
 **/

package com.mahagan.SpringbootApplication.service;

import com.mahagan.SpringbootApplication.domain.Patient;
import com.mahagan.SpringbootApplication.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;


    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> fecthPatientList() {
        return (List<Patient>) patientRepository.findAll();
    }

    @Override
    public Patient updatePatient(Patient patient, int patient_Id) {
        Patient patient1 = patientRepository.findById(patient_Id).get();
        if (Objects.nonNull(patient.getPatient_Id()) && !"".equalsIgnoreCase(patient.getPatient_Name())) {
            patient1.setPatient_Name(patient.getPatient_Name());
        }
        if (Objects.nonNull(patient.getPatient_Id()) && !"".equalsIgnoreCase(patient.getPatient_Address())) {
            patient1.setPatient_Address(patient.getPatient_Address());
        }
        if (Objects.nonNull(patient.getPatient_Id()) && !"".equalsIgnoreCase(patient.getPatient_Contact_No())) {
            patient1.setPatient_Contact_No(patient.getPatient_Contact_No());
        }
        return patientRepository.save(patient1);
    }


    @Override
    public void deletePatientById(int patient_Id) {
        patientRepository.deleteById(patient_Id);

    }
}



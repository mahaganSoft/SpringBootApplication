/**
 * Created By Krishna Shinde
 * Date : 01-06-2023
 * Time : 11:45
 * Project: SpringbootApplication
 **/

package com.mahagan.SpringbootApplication.service;

import com.mahagan.SpringbootApplication.domain.Patient;

import java.util.List;

public interface PatientService {

    Patient savePatient(Patient patient);

    List<Patient> fecthPatientList();

    Patient updatePatient(Patient patient,int patient_Id);

    void deletePatientById(int patient_Id);


}

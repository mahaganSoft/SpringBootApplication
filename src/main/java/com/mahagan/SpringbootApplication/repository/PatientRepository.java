/**
 * Created By Krishna Shinde
 * Date : 01-06-2023
 * Time : 11:42
 * Project: SpringbootApplication
 **/

package com.mahagan.SpringbootApplication.repository;

import com.mahagan.SpringbootApplication.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}

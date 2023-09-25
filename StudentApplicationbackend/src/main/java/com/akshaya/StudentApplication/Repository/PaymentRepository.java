package com.akshaya.StudentApplication.Repository;

import com.akshaya.StudentApplication.model.Payment;
import com.akshaya.StudentApplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentRepository  extends JpaRepository<Payment, Long> {

    List<Payment> findAllByStudent(Student student);

}
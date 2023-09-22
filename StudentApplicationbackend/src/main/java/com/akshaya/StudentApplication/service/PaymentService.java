package com.akshaya.StudentApplication.service;

import com.akshaya.StudentApplication.model.Payment;
import com.akshaya.StudentApplication.model.Student;

import java.util.List;

public interface PaymentService {

    List<Payment> getAllPaymentsByStudent(Student student);
    List<Payment> getAll();
    void savePayment(Payment payment);

}
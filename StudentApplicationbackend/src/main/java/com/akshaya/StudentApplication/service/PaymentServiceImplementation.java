package com.akshaya.StudentApplication.service;

import com.akshaya.StudentApplication.Repository.PaymentRepository;
import com.akshaya.StudentApplication.model.Payment;
import com.akshaya.StudentApplication.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImplementation implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPaymentsByStudent(Student student) {
        return paymentRepository.findAllByStudent(student);
    }

    @Override
    public List<Payment> getAll() {
        return paymentRepository.findAll();
    }

    @Override
    public void savePayment(Payment payment) {
        paymentRepository.save(payment);
    }

}
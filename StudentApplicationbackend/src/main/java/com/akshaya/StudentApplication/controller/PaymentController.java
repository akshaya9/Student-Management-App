package com.akshaya.StudentApplication.controller;

import com.akshaya.StudentApplication.model.Payment;
import com.akshaya.StudentApplication.model.Student;
import com.akshaya.StudentApplication.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
@CrossOrigin
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/add")
    public void add(@RequestBody Payment payment){
        paymentService.savePayment(payment);
    }

    @GetMapping("/getAll")
    public List<Payment> getAllPayments(){
        return paymentService.getAll();
    }

    @GetMapping("/getStudentPayments")
    public List<Payment> getStudentPayments(@RequestBody Student student){
        return paymentService.getAllPaymentsByStudent(student);
    }

}
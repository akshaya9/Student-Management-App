package com.akshaya.StudentApplication.Repository;

import com.akshaya.StudentApplication.model.Lesson;
import com.akshaya.StudentApplication.model.Payment;
import com.akshaya.StudentApplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository  extends JpaRepository<Payment, Long> {

    List<Payment> findAllByStudent(Student student);

    List<Payment> findAllByLesson(Lesson lesson);

}
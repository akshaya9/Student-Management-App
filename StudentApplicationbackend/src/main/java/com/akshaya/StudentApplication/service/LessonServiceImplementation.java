package com.akshaya.StudentApplication.service;

import com.akshaya.StudentApplication.Repository.LessonRepository;
import com.akshaya.StudentApplication.model.Lesson;
import com.akshaya.StudentApplication.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class LessonServiceImplementation implements LessonService {

    @Autowired
    LessonRepository lessonRepository;

    @Override
    public void saveLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    @Override
    public List<Lesson> findAllByStudent(Student student) {
        return lessonRepository.findAllByStudent(student);
    }

    @Override
    public List<Lesson> findAllByStudentAndScheduledDateTimeBetween(Student student, LocalDateTime start, LocalDateTime end) {
        return lessonRepository.findAllByStudentAndScheduledDateTimeBetween(student, start, end);
    }

}
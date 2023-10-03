package com.akshaya.StudentApplication.service;

import com.akshaya.StudentApplication.model.Lesson;
import com.akshaya.StudentApplication.model.Student;
import java.time.LocalDateTime;
import java.util.List;

public interface LessonService {

    void saveLesson(Lesson lesson);

    List<Lesson> findAllByStudent(Student student);

    List<Lesson> findAllByStudentAndScheduledDateTimeBetween(Student student, LocalDateTime start, LocalDateTime end);

}
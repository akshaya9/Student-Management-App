package com.akshaya.StudentApplication.Repository;

import com.akshaya.StudentApplication.model.Lesson;
import com.akshaya.StudentApplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {

    List<Lesson> findAllByStudent(Student student);

    List<Lesson> findAllByStudentAndScheduledDateTimeBetween(Student student, LocalDateTime startScheduledDateTime,
                                                             LocalDateTime endScheduledDateTime);

}
package com.akshaya.StudentApplication;

import com.akshaya.StudentApplication.model.Lesson;
import com.akshaya.StudentApplication.model.Student;
import com.akshaya.StudentApplication.service.LessonService;
import com.akshaya.StudentApplication.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.LocalDateTime;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class StudentApplicationTests {

	@Autowired
	StudentService studentService;

	@Autowired
	LessonService lessonService;

	@Test
	void testServiceImplementations() {
		Student student = new Student();
		student.setName("John");
		studentService.saveStudent(student);

		List<Student> allStudents = studentService.getAllStudents();
		assertFalse(allStudents.isEmpty());

		Lesson lesson = new Lesson();
		lesson.setStudent(student);
		LocalDateTime now = LocalDateTime.now();
		lesson.setScheduledDateTime(now);
		lessonService.saveLesson(lesson);

		assertFalse(lessonService.findAllByStudent(student).isEmpty());

		LocalDateTime then = LocalDateTime.now();

		assertFalse(lessonService
				.findAllByStudentAndScheduledDateTimeBetween(student, now, then)
				.isEmpty());


	}

}
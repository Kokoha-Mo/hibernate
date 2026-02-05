package tw.lab.h1.tutor;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import tw.lab.h1.dao.SCDao;
import tw.lab.h1.entity.Course;
import tw.lab.h1.entity.Student;

public class Lab16 {

	public static void main(String[] args) {
		SCDao dao = new SCDao();
		Student s1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Student ID:");
		long sid = scanner.nextLong();
		s1 = dao.getStudentById(sid);
		System.out.printf("Welcome,%s\n", s1.getStudentName());
		while (true) {
			List<Course> courses = dao.getAllCourse();
			for (Course course : courses) {
				if (!isExist(s1, course.getStudents())) {
					System.out.printf("%d. %s\n", course.getCourseId(), course.getCourseName());
				}
			}
			System.out.println("-----");
			System.out.println("Which? (0: for EXIST):");
			long cid = scanner.nextLong();

			if (cid <= 0)
				break;

			s1.addCourse(dao.getCourseById(cid));
			s1 = dao.update(s1);
		}

	}

	static boolean isExist(Student s, Set<Student> students) {
		return students.stream()
				.anyMatch(student -> student.getStudentId().equals(s.getStudentId()));
	}

}

package tw.lab.h1.tutor;

import java.util.List;
import java.util.Scanner;

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
		System.out.printf("Welcome,%s\n",s1.getStudentName());
		List<Course> courses = dao.getAllCourse();
		for(Course course:courses) {
			System.out.printf("%d.%s\n",course.getCourseId(),course.getCourseName());
		}
		System.out.println("----");
		System.out.println("Choose one");
		long cid = scanner.nextLong();
		s1.addCourse(dao.getCourseById(cid));
		dao.update(s1);
	}

}

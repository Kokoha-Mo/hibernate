package tw.lab.h1.tutor;

import java.util.List;
import java.util.Scanner;

import tw.lab.h1.dao.SCDao;
import tw.lab.h1.entity.Course;
import tw.lab.h1.entity.Student;

public class Lab16_test {

	public static void main(String[] args) {
		SCDao dao = new SCDao();
		Student s1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Student ID:");
		long sid = scanner.nextLong();
		s1 = dao.getStudentById(sid);
		System.out.printf("Welcome,%s\n",s1.getStudentName());
		boolean keepChoose = true;
		List<Course> courses = dao.getAllCourse();
		for(Course course:courses) {
			System.out.printf("%d.%s\n",course.getCourseId(),course.getCourseName());
		}
		courses.remove(dao.getCourseById(1L));
		for(Course course:courses) {
			System.out.printf("%d.%s\n",course.getCourseId(),course.getCourseName());
		}
	}
//		do {
//			
//			}
//			System.out.println("----");
//			System.out.println("Choose one");
//			long cid = scanner.nextLong();
//			scanner.nextLine();
//			s1.addCourse(dao.getCourseById(cid));
//			dao.update(s1);
//			courses.remove((int)cid-1);
//			System.out.println("----");
//			System.out.println("keepChoose?Y/N");
//			String ans = scanner.nextLine();
//			if(ans.equals("N"))keepChoose = false;			
//		}while(keepChoose);
//		
		

}

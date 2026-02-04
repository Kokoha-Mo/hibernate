package tw.lab.h1.tutor;

import tw.lab.h1.dao.SCDao;
import tw.lab.h1.entity.Student;

public class Lab14 {

	public static void main(String[] args) {
		SCDao dao = new SCDao();
		dao.save(new Student("Lab"));
		dao.save(new Student("Andy"));
		dao.save(new Student("Peter"));
		dao.save(new Student("Mark"));
	}

}

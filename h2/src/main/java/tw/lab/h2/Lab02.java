package tw.lab.h2;

import tw.lab.h2.dao.CustomerDao;
import tw.lab.h2.entity.Customer;

public class Lab02 {

	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		Customer c1 = dao.getById("ANTON");
		System.out.println(c1.getCname() + ":" + c1.getPhone());
	}

}

package tw.lab.h2.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import tw.lab.h2.entity.Customer;
import tw.lab.h2.entity.Employee;
import tw.lab.h2.entity.Order;
import tw.lab.h2.entity.OrderDetail;
import tw.lab.h2.entity.OrderDetailPK;
import tw.lab.h2.entity.Product;


public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration config = new Configuration();
			config.configure("hi.cfg.xml");
			
			config.addAnnotatedClass(Customer.class);
			config.addAnnotatedClass(Employee.class);
			config.addAnnotatedClass(Order.class);
			config.addAnnotatedClass(OrderDetail.class);
			config.addAnnotatedClass(Product.class);
			config.addAnnotatedClass(OrderDetailPK.class);

			sessionFactory = config.buildSessionFactory();
		}
		return sessionFactory;
	}
}

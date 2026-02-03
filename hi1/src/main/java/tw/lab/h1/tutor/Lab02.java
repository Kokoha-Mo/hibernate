package tw.lab.h1.tutor;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import tw.lab.h1.entity.Member;
import tw.lab.h1.utils.HibernateUtil;

public class Lab02 {

	public static void main(String[] args) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction transaction = session.beginTransaction();
			
			
			String sql = """
					INSERT INTO member
						(email,passwd,name)
					VALUES
						(:email,:passwd,:name)
					""";
			NativeQuery<Member> query = session.createNativeQuery(sql,Member.class);
			query.setParameter("email", "test1@lab.tw");
			query.setParameter("passwd", "12345678");
			query.setParameter("name", "Test1");
			
			int n = query.executeUpdate();			
			
			transaction.commit();
			System.out.println(n);
		}

	}

}

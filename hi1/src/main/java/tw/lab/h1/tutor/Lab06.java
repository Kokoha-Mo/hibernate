package tw.lab.h1.tutor;

import java.util.List;

import tw.lab.h1.dao.MemberDao;
import tw.lab.h1.entity.Member;
import tw.lab.h1.utils.BCrypt;

public class Lab06 {

	public static void main(String[] args) {
//		Member m1 = new Member();
//		m1.setEmail("test3@lab.tw");
//		m1.setPasswd(BCrypt.hashpw("12345678", BCrypt.gensalt()));
//		m1.setName("Test3");
		
		MemberDao dao = new MemberDao();
//		dao.addMember(m1);
//		
//		Member m2 = dao.findById(11);
//		if(m2 != null) {
//			dao.delMember(m2);
//		}
//		
//		List<Member> members = dao.findAll();
//		for(Member member:members) {
//			System.out.println(member.getEmail());
//		}
		
		List<Member> members = dao.findByLike("克");
		for(Member member:members) {
		System.out.println(member.getEmail());
		}
	}

}

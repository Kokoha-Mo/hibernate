package tw.lab.h1.tutor;

import tw.lab.h1.dao.MemberDao;
import tw.lab.h1.entity.Member;
import tw.lab.h1.entity.MemberInfo;

public class Lab08 {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		Member m1 = dao.findById(6);
		if(m1 != null) {
			MemberInfo i1 = m1.getMemberinfo();
			if(i1 != null) {
				System.out.printf("%d. %s　: %s\n",m1.getId(),m1.getName(),i1.getBirthday());
				i1.setBirthday("2000-07-06");
			}else {
				i1 = new MemberInfo();
				i1.setBirthday("2026-11-11");
				i1.setMale(false);
				m1.setMemberinfo(i1);
				
			}
			dao.updateMember(m1);
		}else {
			System.out.println("Id NOT EXSIST");
		}

	}

}

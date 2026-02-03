package tw.lab.h1.tutor;

import tw.lab.h1.dao.MemberDao;
import tw.lab.h1.entity.Member;

public class Lab09 {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
		Member member = dao.findById(12);
		if(member != null) {
			System.out.printf("%d. %s :%s\n",
					member.getId(),
					member.getEmail(),
					member.getMemberinfo()!=null?member.getMemberinfo().getBirthday():"no info");
			dao.delMember(member);
			System.out.println("Delete Success");
		}else {
			System.out.println("Id NOT FOUND");
		}
	}

}

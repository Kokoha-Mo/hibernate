package tw.lab.h1.tutor;

import tw.lab.h1.dao.MemberDao;
import tw.lab.h1.entity.Member;
import tw.lab.h1.entity.MemberInfo;
import tw.lab.h1.utils.BCrypt;

public class Lab07 {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		
		Member member = new Member();
		member.setEmail("forDel@hhh.tw");
		member.setPasswd(BCrypt.hashpw("12345678", BCrypt.gensalt()));
		member.setName("Del2");
		
		MemberInfo info = new MemberInfo();
		info.setBirthday("1999-01-02");
		info.setMale(false);
		
		member.setMemberinfo(info);
		
		dao.addMember(member);
	}

}
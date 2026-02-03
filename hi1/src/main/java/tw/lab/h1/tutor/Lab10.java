package tw.lab.h1.tutor;

import java.util.List;

import tw.lab.h1.dao.MemberDao;
import tw.lab.h1.entity.Member;
import tw.lab.h1.entity.MemberInfo;

public class Lab10 {
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		List<Member> members =  dao.findAll();
		for(Member member:members) {
			System.out.printf("%d. %s(%s)\n",member.getId(),member.getName(),member.getEmail());
			MemberInfo info = member.getMemberinfo();
			if(info != null) {
				System.out.printf("\t%s:%s\n",info.getBirthday(),info.isMale()?"Male":"Female");
			}
		}
	}
}

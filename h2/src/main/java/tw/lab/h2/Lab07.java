package tw.lab.h2;

import tw.lab.h2.entity.User;
import tw.lab.h2.entity.User.UserBuilder;

public class Lab07 {

	public static void main(String[] args) {
		User user = new User.UserBuilder("Lab")
					.id(1)
					.gender(true)
					.age(18)
					.bulid();
		
		System.out.printf("%d. %s:%s:%s\n",user.getId(),user.getName(),user.isGender()?"Male":"Female",user.getAge());
		System.out.println("---------------");
		User user2 = User.builder("Lab2")
					.id(1)
					.gender(false)
					.age(18)
					.bulid();
		
		System.out.printf("%d. %s:%s:%s\n",user2.getId(),user2.getName(),user2.isGender()?"Male":"Female",user2.getAge());
		
	}

}

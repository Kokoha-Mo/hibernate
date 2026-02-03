package tw.lab.h1.tutor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import tw.lab.h1.entity.Person;

public class Lab05 {

	public static void main(String[] args) throws Exception{
		 Class<String> stringCls = String.class;
		 Class<Person> memberCls = Person.class;
		 
		 System.out.println(stringCls.getName());
		 System.out.println(memberCls.getName());
		 System.out.println("-----");
		 for(Constructor<?> c:stringCls.getDeclaredConstructors()) {
			 System.out.println(c);
		 }
		 System.out.println("-----");
		 for(Field f:memberCls.getDeclaredFields()) {
			 System.out.printf("%s:%s:%s\n",
					 f.getModifiers(),
					 f.getType().getSimpleName(),
					 f.getName());
		 }
		 System.out.println("-----");
		 for(Method m:memberCls.getDeclaredMethods()) {
			 System.out.println(m);
		 }
		 System.out.println("-----");
		 Class<?> mClass = Class.forName("tw.lab.h1.entity.Person");
		 Constructor<?> c = mClass.getDeclaredConstructor(long.class,String.class,String.class);
		 Object obj = c.newInstance(12L,"lol@lab.tw","LOLs");
		 Method m = mClass.getMethod("getEmail");
		 Object result = m.invoke(obj);
		 System.out.println(result);
	}

}

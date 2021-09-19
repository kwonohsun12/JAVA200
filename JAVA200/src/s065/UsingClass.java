package s065;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;



//class를 이용하여 클래스에 선언된 메서드와 생성자를 확인해보자.
//class에는 모든 생성자와 모든 메서드를 반환하는 메서드가 있다.

public class UsingClass {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Class classes = obj1.getClass();
		System.out.println(classes.getName()); //클래스 이름
		System.out.println("------constructor------");
		Constructor[] constructor = classes.getDeclaredConstructors();
		for(Constructor con: constructor) {
			System.out.println(con.getName());
		}
		System.out.println("------Method------");
		Method[]method = classes.getMethods();
		for(Method me: method) {
			System.out.println(me.getName());
		}
		
	}

}

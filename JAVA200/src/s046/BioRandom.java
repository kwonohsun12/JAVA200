package s046;


//서로 다른 세 정수를 만들어 보자.
//임의의 정수는 math.random()을 이용한다.
//break
public class BioRandom {
	public static void main(String[] args) {
		int range = 10;
		int start = 1;
		int a = 0, b = 0, c = 0;
		while (true) {
			a = (int)(range * Math.random() + start);
			b = (int)(range * Math.random() + start);
			c = (int)(range * Math.random() + start);
			if(a != b && b != c && c != a) break;
		}
		System.out.printf("%d\n%d\n%d", a, b, c);
	}
	
	
	
}

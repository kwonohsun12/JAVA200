package s050_0713_1;

//shit 연산자를 이용하여 10진수 정수를 2진수 문자열로 변환해 보자.
public class BitNShiftMain {
	//10진수 정수를 2진수 문자열(스트링)로 변환
	public static String shifts(int a) {
		String s="";
		for (int i = 0; i < 100; i++) {
			int aa = a % 2;
			s = (aa >= 0)? aa + s : (-aa) + s;
			a >>= 1;
			
		}
		return s;
	}
	
	
	
	
	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%d : %s%n", intNums1, shifts(intNums1));
		System.out.printf("%d : %s%n", intNums2, shifts(intNums2));
	}

}

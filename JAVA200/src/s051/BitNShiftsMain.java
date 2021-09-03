package s051;

public class BitNShiftsMain {
	public static int BITMASK = 1;

	// 10진수를 2진수 문자열(스트링)로 변환
	public static String shifts(int a) {
		int BITMASK = 1;
		String s = "";
		for (int i = 0; i < 10; i++) {
			s = (a & BITMASK) + s;
			a >>= 1;
		}
		return s;
	}

	public static void main(String[] args) {
		int intNums1 = 12;
		int intNums2 = -13;
		System.out.printf("%d : %s%n", intNums1, shifts(intNums1));
		System.out.printf("%d : %s%n", intNums2, shifts(intNums2));

	}

}

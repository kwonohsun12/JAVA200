package s049_07;

//입력받은 수가 소수인지 판별해보자.
//제곱근을 구하는 math.sqrt()를 이용하면 반복횟수를 줄일 수 있다.

public class PrimMath {
	public static boolean isPrime(int n) {
		boolean isS = true;
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if(n % i == 0) {
				isS = false;
				break;
			}
		}
		return isS;
	}
	public static void main(String[] args) {
		int number = 5;
		boolean ifPrime = isPrime(number); //
		if(ifPrime) {
			System.out.printf("%d는 1과 자신으로만 나눠떨어지는 소수다.", number);
		}else {
			System.out.printf("%d은 소수가 아니다.", number);
		}
	}
	
}

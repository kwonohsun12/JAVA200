package s049_07;

//�Է¹��� ���� �Ҽ����� �Ǻ��غ���.
//�������� ���ϴ� math.sqrt()�� �̿��ϸ� �ݺ�Ƚ���� ���� �� �ִ�.

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
			System.out.printf("%d�� 1�� �ڽ����θ� ������������ �Ҽ���.", number);
		}else {
			System.out.printf("%d�� �Ҽ��� �ƴϴ�.", number);
		}
	}
	
}

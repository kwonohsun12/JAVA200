package s054;

// 향상된 for를 이용하여 배열을 출력해보자

public class ForeachLotto {
	public static void main(String[] args) {
		int[]mm = {1, 6, 16, 22, 23, 34};
		for (int m : mm) {
			System.out.printf(m + "\t");
		}
		System.out.println();
	}
}

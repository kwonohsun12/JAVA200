package s062;

//정수를 입력 받을 때 발생할 수 있는 예외 처리하기
//try catch를 이용하여 예외를 처리한다.

public class FormatTryCatch {
	public static void main(String[] args) {
		String sNum = "아";
		String nNum = "h";
		try {
			int a = Integer.parseInt(sNum);
			System.out.println(a);
		} catch (NumberFormatException ee) {
			System.out.println("int인지 확인해 봐!");
			System.out.println(ee.getMessage());
		} catch (Exception ee) {
			System.out.println("야 잘 좀 넣어");
		} finally {
			System.out.println("난 수행되어야만 해!!");
		}

	}
}

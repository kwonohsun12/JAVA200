package s055;

public class ForEachLotto2 {
	// var args variable arguments
	public static void main(int ... mm) {
		for(int m : mm) {
			System.out.printf(m + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[]mm = {1, 6, 16, 22, 23, 33};
		print(mm);
		int a = 1, b = 6, c = 16;
		print(a);
		print(a, b);
		print(a, b, c);
	}
	private static void print(int[] mm) {
		// TODO Auto-generated method stub
		
	}
	private static void print(int a, int b, int c) {
		// TODO Auto-generated method stub
		
	}
	private static void print(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	private static void print(int a) {
		// TODO Auto-generated method stub
		
	}

}

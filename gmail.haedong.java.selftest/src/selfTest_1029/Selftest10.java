package selfTest_1029;

public class Selftest10 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

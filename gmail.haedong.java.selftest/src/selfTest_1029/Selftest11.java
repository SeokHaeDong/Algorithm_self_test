package selfTest_1029;

public class Selftest11 {
	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for(int j = 2; j >= 0; j--) {
				if (i >= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		for(int i = 2; i > 0; i--) {
			for(int j = 2; j >= 0; j--) {
				if( i > j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
			
			
			
			
		}
	}


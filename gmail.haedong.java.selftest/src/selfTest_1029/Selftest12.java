package selfTest_1029;

public class Selftest12 {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			for( int j = 3*(i-1)+1; j <= 3*i; j++) {
				if(j >= 2*i + 1) {
					System.out.print(i >=2 ? j-3 : j-2);
				}else {
					System.out.print(" ");
				}
				
			}
			
			System.out.print("\n");
		}
		
		for(int i = 2; i >= 1; i--) {
			for(int j = 3*(i-1)+1; j <= 3*i; j++) {
				if(j >= 2*i + 1) {
					System.out.print(i <= 1 ? j+6 : j+2);
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
			
	}
}

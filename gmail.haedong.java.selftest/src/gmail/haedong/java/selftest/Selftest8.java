package gmail.haedong.java.selftest;

public class Selftest8 {
	public static void main(String[] args) {
		
		int i = 0;
		while(i < 10) {
			System.out.println("data" + i);
			i += 1;
		}
		
		System.out.println("---------------------------------");
		
		i = 0;
		do {
			System.out.println("data" + i);
			i += 1;
		}while(i < 10);
		
		System.out.println("---------------------------------");
		i = 0;
		for(i = 0; i < 10; i+=1) {
			System.out.println("data" + i);
		}
		
		
		
		System.out.println("---------------------------------");
		
	}
}

package gmail.haedong.java.selftest;

public class Selftest17 {
	public static void main(String[] args) {

		int cnt = 0;
		for(int i = 2; i <= 1000; i++) {
			int j_sum = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0) {
					j_sum += j;
					
	
				}
			}
			if(i == j_sum) {
				cnt += 1;
			}
			
		}
		System.out.println(cnt);
		
		
	}
}

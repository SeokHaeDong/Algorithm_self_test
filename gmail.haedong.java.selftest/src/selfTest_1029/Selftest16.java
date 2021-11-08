package gmail.haedong.java.selftest;

public class Selftest16 {
	public static void main(String[] args) {
		int total_cnt = 0;
		for(int i = 2; i <= 1000; i++) {
//			boolean flag = true;
			int cnt = 0;
			for(int j = 1; j <= i; j++) {
				if (i % j == 0) {
//					flag = !flag;
//					break;
					cnt += 1;
				}
				
			}
//			if(flag == true) {
//				cnt += 1;
//			}
			if(cnt == 2) {
				total_cnt += 1;
			}
			
		}
		System.out.println(total_cnt);
		
		
		
		
		
		
	}
}

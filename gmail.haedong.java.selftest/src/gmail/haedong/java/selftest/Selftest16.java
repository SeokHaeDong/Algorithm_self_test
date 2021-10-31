package gmail.haedong.java.selftest;

public class Selftest16 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 2; i <= 1000; i++) {
			for(int j = i; j < i/2+1; j++) {
				if (i % j != 0) {
					cnt += 1;
				}
			}
		}
	}
}

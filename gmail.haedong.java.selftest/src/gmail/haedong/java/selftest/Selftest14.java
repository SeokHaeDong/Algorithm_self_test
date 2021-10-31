package gmail.haedong.java.selftest;

public class Selftest14 {
	public static void main(String[] args) {
		String [] names = {"hae", "dong", "seok"};
		int [] scores = {93, 76, 67};
		
		int max_data = scores[0];
		
		for(int dummy_data : scores) {
			if(dummy_data > max_data) {
				max_data = dummy_data;
			}
		}
		
		System.out.println(max_data);
	}
}

package gmail.haedong.java.selftest;

public class Selftest15 {
	public static void main(String[] args) {
		String [] names = {"hae", "dong", "seok"};
		int [] scores = {93, 76, 67};
		
		int max_data = scores[0];
		int len = scores.length;
		int max_index = 0;
		
		for(int i = 0; i < len; i++) {
			if(max_data < scores[i]) {
				max_data = scores[i];
				max_index = i;
			}
		}
		
		System.out.println(names[max_index]);
	}
}

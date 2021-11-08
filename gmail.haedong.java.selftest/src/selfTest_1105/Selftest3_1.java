package selfTest_1105;

public class Selftest3_1 {
	public static int ascii_num;
	public static int r = 0, o = 0, s = 0, e = 0;
	
	public static int ascii_equals(String str) {
		ascii_num = 0;
		for (int i = 0; i < str.length(); i++) {
			ascii_num += (int)str.charAt(i);
		}
		System.out.println(ascii_num);
		return ascii_num;
	}
	
	
	public static void anagram_check(int ascii_num,int ascii_num1) {
		if(ascii_num == ascii_num1) {
			System.out.println("anagram");
		}else {
			System.out.println("Not anagram");
		}
	}
	
	public static int string_cnt(String str) {
		for(int i = 0; i < str.length(); i++) {
			char cnt = str.charAt(i);
			switch(cnt) {
			case 'r':
				r++;
				break;
			case 'o':
				o++;
				break;
			case 's':
				s++;
				break;
			case 'e':
				e++;
				break;
			}
		}
		return r;
	}
	
	
	
	
	

}

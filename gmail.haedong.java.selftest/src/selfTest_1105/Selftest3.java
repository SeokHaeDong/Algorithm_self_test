package selfTest_1105;

public class Selftest3 {
	public static void main(String[] args) {
		String str1 = "rose";
		String str2 = "eros";
		String str3 = "orse";
		int ascii_num_str1 = 0, ascii_num_str2 = 0, ascii_num_str3 = 0;
		
		
		/*
		 * System.out.println(Selftest3_1.ascii_equals(str1)); Selftest3_1.ascii_num =
		 * 0; System.out.println(Selftest3_1.ascii_equals(str2)); Selftest3_1.ascii_num
		 * = 0; System.out.println(Selftest3_1.ascii_equals(str3));
		 */		
		
		
		ascii_num_str1 = Selftest3_1.ascii_equals(str1);
		ascii_num_str2 = Selftest3_1.ascii_equals(str2);
		ascii_num_str3 = Selftest3_1.ascii_equals(str3);
		
		if(str1.length() != str2.length()) {
			System.out.println("Not anagram");
		}else if(ascii_num_str1 != ascii_num_str2) {
			System.out.println("Not anagram");
		}
		
		
	}
}

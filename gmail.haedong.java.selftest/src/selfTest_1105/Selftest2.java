package selfTest_1105;

public class Selftest2 {
	public static void main(String[] args) {
		String print_Hello = "Hello World";
		String copy_print = new String();
		StringBuilder str = new StringBuilder(10);

		for(int i = 0; i < print_Hello.length(); i = i+1) {
			if(print_Hello.charAt(i) == print_Hello.charAt(5)) {
				continue;
			}else {
				str.append(print_Hello.charAt(i));
				copy_print += print_Hello.charAt(i);
				System.out.print(print_Hello.charAt(i));
			}
		}
		
		System.out.println("\n" + str);
		System.out.println(copy_print);
		
	}
}

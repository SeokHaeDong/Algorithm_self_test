package selfTest_1029;

public class Selftest4 {
	public static void main(String[] args) {
		String name = "haedong";
		int age = 25;
		double height = 165;
		double weight = 50;
		double bmi = weight / (height/100 * height/100);
		
		double bmi_round2 = (int)((bmi * 10) + 0.5) / 10; 
				
		System.out.println(bmi_round2);
	}
}

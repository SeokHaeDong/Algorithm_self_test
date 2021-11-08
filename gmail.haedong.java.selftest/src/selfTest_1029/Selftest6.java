package selfTest_1029;

public class Selftest6 {
	public static void main(String[] args) {
		String name = "haedong";
		int age = 25;
		double height = 165;
		double weight = 50;
		double bmi = weight / (height/100 * height/100);
		
		double bmi_round2 = (int)((bmi * 10) + 0.5) / 10; 
				
		if(bmi > 23) {
			System.out.println("과체충 입니다.");
		}else {
			System.out.println("정상입니다.");
		}
		
	}
}

package selfTest_1105;

public class Selftest4 {
	public static void main(String[] args) {
		String dna_str = "GGCDGCCGDDGCCGCCGDDCKGCCGKK";
		int gccg = 0;
		String check_dna = "GCCG";

		for (int i = 0; i < dna_str.length() - 3; i++) {
			String dummy_dna = "";
			for (int j = 0 + i; j <= i + 3; j++) {
				dummy_dna += dna_str.charAt(j);
			}
			System.out.println(dummy_dna);
//			if (dummy_dna == check_dna) {
//				gccg += 1;
//			}
			switch(dummy_dna) {
			case "GCCG":
				gccg++;
				break;
			}
			
		}

		System.out.println(gccg);

		/*
		 * String check_dna = "GCCG"; int acsii_dna = 0;
		 * 
		 * for (int i = 0; i < check_dna.length(); i++) { acsii_dna +=
		 * check_dna.charAt(i); }
		 * 
		 * for (int i = 0; i < dna_str.length() - 3; i++) { int dummy_dna = 0; for (int
		 * j = 0 + i; j <= i + 3; j++) { dummy_dna += (int) dna_str.charAt(j); } if
		 * (dummy_dna == acsii_dna) { gccg += 1; } }
		 * 
		 * System.out.println(gccg);
		 */

		/*
		 * for (int i = 0; i < dna_str.length() / 4; i++) { String dummy_dna = ""; for
		 * (int j = 4*i; j <= 4*i + 3; j++) { dummy_dna += dna_str.charAt(j); }
		 * System.out.println(dummy_dna); if (dummy_dna == check_dna) { gccg += 1; } }
		 */

	}
}

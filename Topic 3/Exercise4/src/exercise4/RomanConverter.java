package exercise4;

public class RomanConverter {
	// Create a Roman Number conversion (both ways, either int to Roman or
	// Roman to int).
	
	public int convert(String roman) {
		int arabic = 0;
		for (int j = 0; j < roman.length(); j++) {

			switch (roman.charAt(j)) {

			case 'M':
				 arabic = arabic + 1000;
				 break;
			case 'D':
				 arabic = arabic + 500;
				 break;
			case 'C':
				if (j+1 < roman.length() && (roman.charAt(j+1) == 'D' || roman.charAt(j+1) == 'M'))
					 arabic = arabic - 100;
				else
				 arabic = arabic + 100;
				break;
			case 'L':
				 arabic = arabic + 50;
				 break;
			case 'X':
				if (j+1 < roman.length() && (roman.charAt(j+1) == 'L' || roman.charAt(j+1) == 'C'))
					 arabic = arabic - 10;
				else
				 arabic  = arabic+ 10;
				break;
			case 'V':
				 arabic = arabic + 5;
				 break;
			case 'I':
				if (j+1 < roman.length() && (roman.charAt(j+1) == 'V' || roman.charAt(j+1) == 'X'))
					 arabic = arabic - 1;
				else
				 arabic = arabic + 1;
				break;
			}
		}
		return arabic;
	}

	
	public String convert(int i) {
		String stringNumber = Integer.toString(i);

		switch (stringNumber.length()) {
		case 1:

			return decimalToText(i);

		case 2:
			// 10 - 99
			return tenToString(Integer.parseInt(stringNumber.charAt(0) + "0"))
					+ decimalToText(Integer.parseInt(stringNumber.charAt(1) + ""));
		case 3:
			// 100 - 999
			return hundredToString(Integer.parseInt(stringNumber.charAt(0) + "00"))
					+ tenToString(Integer.parseInt(stringNumber.charAt(1) + "0"))
					+ decimalToText(Integer.parseInt(stringNumber.charAt(2) + ""));
		case 4:
			// 1000 - 3999
			return thousandthToString(Integer.parseInt(stringNumber.charAt(0) + "000"))
					+ hundredToString(Integer.parseInt(stringNumber.charAt(1) + "00"))
					+ tenToString(Integer.parseInt(stringNumber.charAt(2) + "0"))
					+ decimalToText(Integer.parseInt(stringNumber.charAt(3) + ""));
		default:
			break;
		}
		return "getText - Error";
	}

	public String decimalToText(int i) {
		// TODO Auto-generated method stub
		switch (i) {
		case 0:
			return "";
		case 1:
			return "I";
		case 2:
			return "II";
		case 3:
			return "III";
		case 4:
			return "IV";
		case 5:
			return "V";
		case 6:
			return "VI";
		case 7:
			return "VII";
		case 8:
			return "VIII";
		case 9:
			return "IX";

		default:
			return "decimal To Text error";
		}
	}

	public String tenToString(int i) {

		switch (i) {
		case 10:
			return "X";
		case 20:
			return "XX";
		case 30:
			return "XXX";
		case 40:
			return "XL";
		case 50:
			return "L";
		case 60:
			return "LX";
		case 70:
			return "LXX";
		case 80:
			return "LXXX";
		case 90:
			return "XC";
		default:
			return "Ten To Text error";
		}
	}

	public String hundredToString(int i) {

		switch (i) {
		case 100:
			return "C";
		case 200:
			return "CC";
		case 300:
			return "CCC";
		case 400:
			return "CD";
		case 500:
			return "D";
		case 600:
			return "DC";
		case 700:
			return "DCC";
		case 800:
			return "DCCC";
		case 900:
			return "CM";
		default:
			return "Ten To Text error";
		}
	}

	public String thousandthToString(int i) {

		switch (i) {
		case 1000:
			return "M";
		case 2000:
			return "MM";
		case 3000:
			return "MMM";
		default:
			return "thousandth To Text error";
		}
	}

}

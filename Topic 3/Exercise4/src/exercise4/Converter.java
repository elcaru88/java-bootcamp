package exercise4;

public class Converter {

	private double number;

	public void setNumber(double number) {
		// TODO Auto-generated method stub
		this.number = number;
	}

	public String getText() {
		// TODO Auto-generated method stub
		String stringNumber = Double.toString(number) + "0";
		/*
		 * 100 - a-hundred - cien 1,000 - a-thousand - 10,000 - ten-thousand
		 * 100,000 - a-hundred-thousand - 1000000 - a-million and 04/100 dollars
		 * 1000000,04 - a-million and 04/100 dollars
		 */
		switch (stringNumber.length()) {
		case 3:

			return decimalToText((int) number) + " and "
					+ stringNumber.charAt(2) + "0/100 dollars";
		case 4:

			return decimalToText((int) number) + " and "
					+ stringNumber.charAt(2) + stringNumber.charAt(3)
					+ "/100 dollars";
		case 5:

			return decimalToText((int) number) + " and "
					+ stringNumber.charAt(3) + stringNumber.charAt(4)
					+ "/100 dollars";
		case 6:
			// hundred
			return decimalToText(Integer.parseInt(stringNumber.charAt(0) + ""))
					+ " hundred "
					+ decimalToText((int) number
							- (Integer.parseInt(stringNumber.charAt(0) + "") * 100))
					+ " and " + stringNumber.charAt(4) + stringNumber.charAt(5)
					+ "/100 dollars";
		case 7:
			// thousand
			if (stringNumber.charAt(1) != '0') {
				return decimalToText(Integer.parseInt(stringNumber.charAt(0)
						+ ""))
						+ " thousand "
						+ decimalToText(Integer.parseInt(stringNumber.charAt(1)
								+ ""))
						+ " hundred "
						+ decimalToText((int) number
								- (Integer
										.parseInt(stringNumber.charAt(0) + "") * 1000)
								- (Integer
										.parseInt(stringNumber.charAt(1) + "") * 100))
						+ " and "
						+ stringNumber.charAt(5)
						+ stringNumber.charAt(6) + "/100 dollars";
			} else
				return decimalToText(Integer.parseInt(stringNumber.charAt(0)
						+ ""))
						+ " thousand "
						+ decimalToText((int) number
								- (Integer
										.parseInt(stringNumber.charAt(0) + "") * 1000))
						+ " and "
						+ stringNumber.charAt(5)
						+ stringNumber.charAt(6) + "/100 dollars";

		case 8:
			// ten-thousand
			if (stringNumber.charAt(2) != '0') {
				return decimalToText(Integer.parseInt(stringNumber.charAt(0)
						+ "" + stringNumber.charAt(1) + ""))
						+ " thousand "
						+ decimalToText(Integer.parseInt(stringNumber.charAt(2)
								+ ""))
						+ " hundred "
						+ decimalToText((int) number
								- (Integer.parseInt(stringNumber.charAt(0) + ""
										+ stringNumber.charAt(1) + "") * 1000)
								- (Integer
										.parseInt(stringNumber.charAt(2) + "") * 100))
						+ " and "
						+ stringNumber.charAt(6)
						+ stringNumber.charAt(7) + "/100 dollars";
			} else
				return decimalToText(Integer.parseInt(stringNumber.charAt(0)
						+ "" + stringNumber.charAt(1) + ""))
						+ " thousand "
						+ decimalToText((int) number
								- (Integer.parseInt(stringNumber.charAt(0) + ""
										+ stringNumber.charAt(1) + "") * 1000))
						+ " and "
						+ stringNumber.charAt(6)
						+ stringNumber.charAt(7) + "/100 dollars";

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
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		case 20:
			return "twenty";
		case 30:
			return "thirty";
		case 40:
			return "forty";
		case 50:
			return "fifty";
		case 60:
			return "sixty";
		case 70:
			return "seventy";
		case 80:
			return "eighty";
		case 90:
			return "ninety";

		default:
			return compositeNumber(i);
		}
	}

	public String compositeNumber(int i) {
		// TODO Auto-generated method stub
		String st = Integer.toString(i);

		switch (st.charAt(0)) {
		case '2':
			return "twenty-"
					+ decimalToText(Integer.parseInt(st.charAt(1) + ""));
		case '3':
			return "thirty-"
					+ decimalToText(Integer.parseInt(st.charAt(1) + ""));
		case '4':
			return "forty-"
					+ decimalToText(Integer.parseInt(st.charAt(1) + ""));
		case '5':
			return "fifty-"
					+ decimalToText(Integer.parseInt(st.charAt(1) + ""));
		case '6':
			return "sixty-"
					+ decimalToText(Integer.parseInt(st.charAt(1) + ""));
		case '7':
			return "seventy-"
					+ decimalToText(Integer.parseInt(st.charAt(1) + ""));
		case '8':
			return "eighty-"
					+ decimalToText(Integer.parseInt(st.charAt(1) + ""));
		case '9':
			return "ninety-"
					+ decimalToText(Integer.parseInt(st.charAt(1) + ""));
		default:
			break;
		}
		return "Composite Number error";

	}

}

package Roman;

public class ConvertRoman {
	
	final static char symbol[] = {'M','D','C','L','X','V','I'};
	final static int   value[] = {1000,500,100,50,10,5,1};

	public static int convertRomanToInt(String roman)
	{
		roman = roman.toUpperCase();
		if(roman.length() == 0) return 0;
		for(int i = 0; i < symbol.length; i++)
		{
			int pos = roman.indexOf(symbol[i]) ;
			if(pos >= 0)
				return value[i] - convertRomanToInt(roman.substring(0,pos)) + convertRomanToInt(roman.substring(pos+1));
		}
		throw new IllegalArgumentException("Invalid Roman Symbol.");
	}

	private static int[]    numbers = { 1000,  900,  500,  400,  100,   90,  
		50,   40,   10,    9,    5,    4,    1 };

	private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC",
		"L",  "XL",  "X",  "IX", "V",  "IV", "I" };


	public static String convertToRoman(int N)
	{
		String roman = "";
		for (int i = 0; i < numbers.length; i++) {
			while (N >= numbers[i]) {
				roman += letters[i];
				N -= numbers[i];
			}
		}
		return roman;
	}
	
	static class RomanDemo{
		public static void main(String[] args) {
			ConvertRoman cr = new ConvertRoman();
			System.out.println(cr.convertRomanToInt("dlv"));
			
			ConvertRoman cr2 = new ConvertRoman();
			System.out.println(cr.convertToRoman(1350));
			
		}
		
	}

}

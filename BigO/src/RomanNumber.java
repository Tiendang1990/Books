
public class RomanNumber {
	public static void main (String[] args) {
		String str = "X";
		int result = romanToInt(str);
		System.out.println(result);
		System.out.println("Time complexity is O (n) + 4");
	}
	
	public static char getRomanString(char c){
		if (c == 'I') {
			return 1;
		}
		if (c == 'V') {
			return 5;
		}
		if (c == 'L') {
			return 50;
		}
		if (c == 'X') {
			return 10;
		}
		if (c == 'C') {
			return 100;
		}
		if (c == 'D') {
			return 500;
		}
		if (c == 'M') {
			return 1000;
		}
		else {
			return 0;
		}
	}
	public static int romanToInt(String s) {
		int sum =0;
		int firstNumber = getRomanString(s.charAt(0));
		for (int i=0; i<s.length(); i++) {
			int secondNumber = getRomanString(s.charAt(i));
			
			if (firstNumber < secondNumber) {
				sum -= firstNumber;
			}else {
				sum +=firstNumber;
			}
			firstNumber = secondNumber;
	}
		return sum+=firstNumber;
}
}
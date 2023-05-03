import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
			System.out.println("Please input your number: ");
			double num = input.nextDouble();

			double sqrt1 = squareRoot(num);
			System.out.println("Square root of your data is: " + sqrt1);
		}
	

	public static double squareRoot(double num) {
		double temp;
		double sqrt = num / 2;
		if (num < 0) {
			System.out.println("Please input your data again");
		} else {
			do {
				temp = sqrt;
				sqrt = (temp + (num / temp) / 2);
			} while ((temp - sqrt) != 0);
			return sqrt;
		}
		return 0;
	}
}

package wee2.day1;

public class Palindrome {

	public static void main(String[] args) {
		int input = 12345;
		int output = 0;

		for (int i = input; i > 0; i = i / 10) {
			int rem = i % 10;
			output = output * 10 + rem;
			
		}
		if (input == output) {
			System.out.println(output + "  is a palindrome");

		}else {
			System.out.println(output + "  is not a palindrome");
		}

	}

}

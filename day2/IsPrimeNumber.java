package week1.day2;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int n = 17;
		boolean isprime = true;

		if (n <= 1) {
			isprime = false;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isprime = false;

				}

			}
		}
		if (isprime) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}
}

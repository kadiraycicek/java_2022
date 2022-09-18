package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = -2;

		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayi asal degildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Gecersiz sayi");
			return;
		}

		for (int i = 2; i < number; i++) {
			int remainder = number % i;
			if (number % 2 == 0) {
				isPrime = false;
			}

		}
		
		if(isPrime) {
			System.out.println("Sayi asaldir");
		}else {
			System.out.println("Sayi asal degildir");
		}

	}

}

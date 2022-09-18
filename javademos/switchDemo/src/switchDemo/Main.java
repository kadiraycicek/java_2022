package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'Z';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Gectiniz");
			break;
		case 'B':
			System.out.println("Cok Güzel : Gectiniz");
			break;
		case 'C':
			System.out.println("İyi : Gectiniz");
			break;
		case 'D':
			System.out.println("Fena Degil : Gectiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldiniz");
			break;
		default:
			System.out.println("Gecersiz not girdiniz");

		}

	}

}

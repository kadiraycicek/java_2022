package recapDemo1;

public class Main {

	public static void main(String[] args) {
	int sayi1 = 31;
	int sayi2 = 34;
	int sayi3 = 33;
	
	if(sayi1>sayi2) {
		if(sayi1>sayi3) {
			System.out.println("En büyük sayi 1dir");
		}else {
			System.out.println("En bnüyük sayi 3dir");
		}
	}else {
		if(sayi2>sayi3) {
			System.out.println("En büyük sayi 2dir");
		}else {
			System.out.println("En büyük sayi 3dir");
		}
	}
	
	}

}

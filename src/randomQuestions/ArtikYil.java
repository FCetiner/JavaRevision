package randomQuestions;

import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int yil=scan.nextInt();
		
		artikYilHesapla(yil);
		scan.close();
	}

	private static void artikYilHesapla(int yil) {
		
		boolean artikYilmi = yil % 4 == 0;
		artikYilmi = artikYilmi && yil % 100 != 0;
		artikYilmi = artikYilmi || yil % 400 == 0;
		artikYilmi = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);
	
	if (artikYilmi) {
		System.out.println(yil +" artik yil ");
	} else {
		System.out.println(yil + " artik yil deðil");
	}
	}

}

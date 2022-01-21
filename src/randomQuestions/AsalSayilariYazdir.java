package randomQuestions;

public class AsalSayilariYazdir {

	public static void main(String[] args) {

		int sinir=50;
		
		asalSayiBul(sinir);
	}



	private static void asalSayiBul(int sinir) {
		int sayi=2;
		while (sayi<sinir) {
			boolean asalMi=true;
			for (int i = 2; i <= sayi/2; i++) {
				if (sayi%i==0) {
					asalMi=false;
					break;
				}
			}
			if (asalMi) {
				System.out.println(sayi+" ");
			}
			sayi++;
		}
	
	
	}

}

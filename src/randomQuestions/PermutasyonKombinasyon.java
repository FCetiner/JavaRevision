package randomQuestions;

public class PermutasyonKombinasyon {

	public static void main(String[] args) {
		  /*  Problem Tanimi
        Verilen iki sayinin kombinasyonunu bulan kodu yaziniz.
        Hatirlatma C(n,r) = n! / (r!(n-r)!)

        Verilen iki sayinin permutasyonunu bulan kodu yaziniz.
        Hatirlatma P(n,r) = n! / (n-r)!

        Ekran ciktisi
        Birinci sayiyi giriniz: 15
        Ikinci sayiyi giriniz: 4
        Kombinasyon: 1365
        permutasyon: 32760

        Birinci sayiyi giriniz: 5
        Ikinci sayiyi giriniz: 3
        Kombinasyon: 10
        permutasyon: 60
      */
		int n=5;
		int r=3;
		
		permutasyon(n,r);
		kombinasyon(n,r);
		faktoriyelBul(n);

	}
	private static int faktoriyelBul(int n) {
		int faktoriyel=1;
		for (int i = 1; i <= n; i++) {
			faktoriyel*=i;
		}
		return faktoriyel;
		
	}
	//C(n,r) = n! / (r!(n-r)!)
	private static int kombinasyon(int n, int r) {
		 if (n > 0 && r > 0 && n >= r) {
	            return (faktoriyelBul(n) / (faktoriyelBul(n - r) * faktoriyelBul(r)));
	        } else return 0;
		
	}
	//P(n,r) = n! / (n-r)!
	private static int permutasyon(int n, int r) {
		 if (n > 0 && r > 0 && n >= r) {
	            return (faktoriyelBul(n) / faktoriyelBul(n - r));
	        } else return 0;
	}

}

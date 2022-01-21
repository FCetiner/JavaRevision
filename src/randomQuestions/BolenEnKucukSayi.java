package randomQuestions;

public class BolenEnKucukSayi {

	public static void main(String[] args) {
		
		System.out.println(bolenEnKucukSayi(27));
		
	}
	public static int bolenEnKucukSayi(int num) {
		int bolen=2;
		int enKucukBolen=0;
		while(bolen<=num/2) {
			if(num%bolen==0) {
				enKucukBolen= bolen;
				break;
			}
			bolen++;
		}
		return enKucukBolen;
	}
}

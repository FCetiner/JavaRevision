package randomQuestions;

public class EBOB {

	public static void main(String[] args) {


		int a=10;
		int b=15;
		
		int ebob=0;
		int bolen=2;
		while (bolen<a&&bolen<b) {
			if (a%bolen==0&&b%bolen==0) {
				ebob=bolen;
			}
			bolen++;
		}
		System.out.println(a+" ve "+b+" ebobu: " + ebob);

	}

}

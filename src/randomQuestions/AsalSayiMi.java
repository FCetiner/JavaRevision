package randomQuestions;

import java.util.Scanner;
import java.util.stream.IntStream;

public class AsalSayiMi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		
	System.out.println(asalSayiMi(num));	
		
	}

		
	

	private static boolean asalSayiMi(int num){
	return	IntStream.rangeClosed(2, num/2).noneMatch(i -> num%i == 0);
		
	}

}

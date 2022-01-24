package randomQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrOrtalamaUzeriGoster {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Oluþturmak istediginiz arrayin uzunlugunu girin");
		int uzunluk=scan.nextInt();
		int arr[]=new int[uzunluk];
		
		int sayac=1;
		while (sayac<uzunluk) {
			System.out.println(uzunluk +" adet sayi girin");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(sayac +". elemani girin :");
				arr[i]=scan.nextInt();
				sayac++;
			}
			
		}
		
		ortalamaBul(arr);
		ortalamaUzeriniGoster(arr,ortalamaBul(arr));

	}

	private static void ortalamaUzeriniGoster(int[] arr, int ortalamaBul) {
		List<Integer> list=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>ortalamaBul) {
				list.add(arr[i]);
			}
		}
		System.out.println("Ortalama : "+ ortalamaBul+ "\nListin ortalamanin uzerindeki elemanlari : " + list);
	}

	private static int ortalamaBul(int[] arr) {
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		return toplam/(arr.length);
	}

}

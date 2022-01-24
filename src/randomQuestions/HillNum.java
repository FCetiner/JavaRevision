package randomQuestions;

public class HillNum {

	public static void main(String[] args) {
		  /*
        Problem Tanimi :
        parametre olarak Integer Arraylist alan ve return type int olan hillNum isminde br method yaziniz
        method ; kendinden onceki sayidan kucuk kendinden sonrakinden buyuk olan sayiyi yazdirsin
        Test data:
        input : ArrayList 5,4,6,2,1
        output : 2
        2; 6 dan kucuk 1 den buyuk
         */

		int arr[]= {5,4,6,2,1};
		System.out.println(hillNum(arr));
	}
	
	public static int hillNum(int[] arr) {
		int num=0;
		for (int i = 1; i < arr.length-1; i++) {
			if(arr[i-1]>arr[i]&&arr[i]>arr[i+1]) {
				num=arr[i];
			}
		}
		return num;
	}

}

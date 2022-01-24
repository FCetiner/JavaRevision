package randomQuestions;

public class Palindrome {

	public static void main(String[] args) {
		String str="Madammadam";

			System.out.println(isPalindrome(str));
			System.out.println(isPalindrome2(str)); 
	}

	private static boolean isPalindrome2(String str) {
		String tersStr="";
		
		for (int i = (str.length()-1); i >=0 ; i--) {
			tersStr+=str.charAt(i);
		}
		return str.equalsIgnoreCase(tersStr);
	}

	private static boolean isPalindrome(String str) {
		StringBuilder sb=new StringBuilder(str.toLowerCase());
		System.out.println(sb.reverse());
		return sb.toString().equalsIgnoreCase((sb.reverse()).toString());
	}

}

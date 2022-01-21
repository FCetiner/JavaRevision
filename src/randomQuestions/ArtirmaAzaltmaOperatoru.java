package randomQuestions ;

public class ArtirmaAzaltmaOperatoru {
	public static void main(String[] args) {
		int i = 3; // final int i = 3; dersek i ye artï¿½k yeni deï¿½er atanamaz.
		int j = 3;
		i++;
		j--;
		System.out.println(i);	//4

		System.out.println(j);//2

		i = 3;
		j = 3;
		++i;
		--j;
		System.out.println(i);

		System.out.println(j);

		int var = 10;
		int a = var;

		System.out.println(a);//10

		var = 5;
		System.out.println(a);//5

		a = var++; // var ++ = a'ya var atandýktan sonra
		System.out.println(a);//5
		System.out.println(var);//6

		int b = 2;
		int var2 = 5;

		b = ++var2;// ++var2 = b' 
		System.out.println(b);
		System.out.println(var2);

		i = 5;
		i = ++i + i++ + ++i + ++i;
		System.out.println("i = " + i);

	}

}

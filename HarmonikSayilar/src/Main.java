import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double result = 0;
		int num;
		Scanner deger = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz: ");
		num=deger.nextInt();
		for (int i = 1; i <= num; i++) {
			result = (1.0 / i) + result;
		}
		System.out.println("sonucunuz: "+result);
	}

}

import java.util.Scanner;

public class largestNum_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three the number ");
		a= input.nextInt();
		b= input.nextInt();
		c= input.nextInt();
		if((a>b)&&(a>c)) {
			System.out.println("a is the largest number");
		}
		else if (b>c) {
			System.out.println("b is the largest number");
		}
		else {
			System.out.println("c is the largest number");
		}
	}
}

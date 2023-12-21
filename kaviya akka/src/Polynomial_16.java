import java.util.Scanner;

public class Polynomial_16 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int number,x,result=0;
	
	System.out.print("Enter the number : ");
	number = input.nextInt();
	int[] a= new int[number+1];
	for(int i=0;i<=number;i++) {
		System.out.print("X^"+i+":");
		a[i]=input.nextInt();
	}
	System.out.print("Enter the value of x: ");
	x= input.nextInt();
	for(int i=0;i<number;i++) {
		result = result + (a[i]*x^i);
	}
	System.out.print(result);
}
}

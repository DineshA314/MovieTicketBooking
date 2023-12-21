import java.util.Scanner;

public class largestElement_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = new int [100];
		System.out.println("How many number you want");
		int num = input.nextInt();
		System.out.println("Enter the number ");
		for(int i=0;i<num;i++) {
			
			a[i] = input.nextInt();
		}
		for(int i=1;i<num;i++) {
		    if(a[0]<=a[i]) {
		    	a[0]= a[i];
		    }
		}
		System.out.println(a[0]);
	}
}

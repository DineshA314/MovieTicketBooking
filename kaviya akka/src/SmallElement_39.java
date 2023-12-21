import java.util.Scanner;

public class SmallElement_39 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[] = new int [100];
		System.out.println("How many number you want");
		int num = input.nextInt();
		System.out.println("Enter the number ");
		for(int i=0;i<num;i++) {
			
			a[i] = input.nextInt();
		}
		for(int i=0;i<num;i++) {
		    if(a[num-1]>=a[i]) {
		    	a[num-1]= a[i];
		    }
		}
		System.out.println(a[num-1]);
	}
}

import java.util.Scanner;
import java.util.Scanner;

public class multiple_Table {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);			
	System.out.print("enter the number : " );
	int number = input.nextInt();
	int end = input.nextInt();
	int i;
	for(i=1;i<=end;i++) {
		System.out.printf(number+"*"+i+"=" +(number*i)).println();
	}
			
}
}

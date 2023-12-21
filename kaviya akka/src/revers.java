import java.util.Scanner;

public class revers {
 public static void main (String[] args) {
	 Scanner input = new Scanner(System.in);
	 int number = input.nextInt();
	 int a,temp=0;
	 while(number!=0) {
		 a=number%10;
		 temp = temp*10+a;
		 number/=10;
		 
	 }
	 System.out.println(temp);
 }
}

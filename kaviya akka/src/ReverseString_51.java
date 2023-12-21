import java.util.Scanner;
public class ReverseString_51 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
    while(a>0) {
    	System.out.print(a%10);
    	a = a/10;
    }
	
}
}

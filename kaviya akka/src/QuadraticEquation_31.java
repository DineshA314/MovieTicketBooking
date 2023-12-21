import java.util.Scanner;
public class QuadraticEquation_31 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a,b,c,s;
	a = input.nextInt();
	b = input.nextInt();
	c = input.nextInt();
   s = b*b-4*a*c;
   System.out.println((-b+Math.sqrt(s))/(2*a));
   System.out.println((-b-Math.sqrt(s))/(2*a));
	
	
}
}

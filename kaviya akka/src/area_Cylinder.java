import java.util.Scanner;
public class area_Cylinder {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int radius,high;
	System.out.print("Enter the radius : ");
	radius = input.nextInt();
	System.out.print("Enter the high : ");
	high= input.nextInt();
	System.out.print(2*3.14*radius*high+2*3.14*radius*2);
}
}

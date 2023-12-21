import java.util.Scanner;
public class X_12345 {
	public static void main (String[] args) {
		 Scanner input = new Scanner(System.in);
		 String a ;
		 int b,c;
		 a = input.nextLine();
		 b=a.length();
		 c=b;
		 for(int i=0;i<b;i++) {
			for(int j=0;j<b;j++) { 
				if((i==j)||(c-1==j)) {
					System.out.print(a.charAt(i));
				}
				else {
					System.out.print(" ");
				}
			}
			c--;
			System.out.println();
		 }
}
}
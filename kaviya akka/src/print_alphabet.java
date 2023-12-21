import java.util.Scanner;
public class print_alphabet {
	public static void main (String[] args) {
		 Scanner input = new Scanner(System.in);
		// char ch = input.next().charAt(0);
		 char ch = input.next().charAt(0);
		 for(int i=ch;i>=65;i--) {
			 for(int j=i;j>=65;j--) {
				 System.out.print((char)i);
			 }
			 System.out.println();
		 }
}
}
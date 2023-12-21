import java.util.Scanner;
public class ReverseString_52 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	String a= input.nextLine();
	
	
	for(int i=a.length()-1;i>=0;i--) {
		if((a.charAt(i)==' ')||(a.charAt(i)==a.charAt(0)))
				{
			for(int j=i+1;j<a.length();j++) {
				if(a.charAt(j)==' ') {
				    break;
				}
				else {
					System.out.print(a.charAt(j));
				}
			}
			System.out.print(" ");
		}
	}
	
}
}

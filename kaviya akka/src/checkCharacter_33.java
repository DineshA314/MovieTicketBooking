import java.util.Scanner;

public class checkCharacter_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char a;
		a = input.next().charAt(0);
		if((a>=65)&&(a<=90)||(a>=97)&&(a<=122)){
			System.out.println("this is a alphabet");
		}
		else {
		System.out.println("not a alphabet");
		}
	}

}

import java.util.Scanner;
public class Vowels_29 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	char a;
	
	a = input.next().charAt(0);
	if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')) {
		System.out.print("Are the vowel");
	}
	else {
	System.out.print("consonant");
	}
}
}

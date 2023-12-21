import java.util.Scanner;
public class add_reversnumber {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  int num = input.nextInt();
	  int temp,a;
	  int rev=0;
	  a=num;
	  while(num!=0) {
		  temp = num%10;
		  rev = rev*10+temp;
		  num/=10;
	  }
	  System.out.println(a-rev);
  }
}

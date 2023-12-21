import java.util.Scanner;
public class factorialSum_35 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a,sum=1,p=0;
	a = input.nextInt();
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=i;j++) {
			sum *= j;
		}
		p +=sum;
		sum =1;
	}
	System.out.println(p);
}
}

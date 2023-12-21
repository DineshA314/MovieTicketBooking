
public class Pyramid12345_50 {
public static void main(String[] args) {
	int a=1,b=9,p=8,s=1,k=1,q=2;
	for(int i=a;i<=b;i++) {
		for(int j=0;j<=16;j++) {
			if(j==p) {
				k=1;
				while(k<=s)
				{
					if(k<=i) {
				
				    System.out.print(k);
					}
					else {
						System.out.print(k-q);
						q+=2;
					}
					
				    k++;
				}
				p--;
			}
			else 
			{
				System.out.print(" ");
			}
		}
		s+=2;
		q=2;
		System.out.println();
	}
}
}

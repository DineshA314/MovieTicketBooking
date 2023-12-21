
public class starPattern1234 {
public static void main(String[] args) {
	int a=9,b=1,p=16,s=0,x=0;
	
	for(int i=a;i>=b;i--) {
		
		for(int j=0;j<=p;j++) {
			 if(i%2==1) 
			 {
				 if(j<x) {
					 System.out.print(" ");
				 }
				 else if(j%2==0) {
						System.out.print(i);
					}
					else {
						System.out.print(" ");
					}
			 }
			 else
			 {
				 if(j<x) {
					 System.out.print(" ");
				 }
				 else if(j%2==1) {
					 System.out.print(i);
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
		}
		System.out.println();
		p--;
		x++;
	}
}
}

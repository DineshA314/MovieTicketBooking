
public class PyramidStar {
public static void main(String[] args) {
	int a=0,b=9,j=0,p=16;
	for(int i=a;i<b;i++) {
		for( j=0;j<=p;j++) {
			if(i%2==0) 
			{
				if(j<i) 
				{
					System.out.print(" ");
				}
				else if(j%2==0) 
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
				}
				
			}
		  else
			{
			  if(j<i) {
				  System.out.print(" ");
			  }
			  else if(j%2==1) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
		}
		
		System.out.println();
		p--;
	
	}
}
}

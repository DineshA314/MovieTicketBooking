import java.util.Scanner;

public class numbers12345 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  String[] a = new String[100];
	    
	    int i,b,j,c,k;
	   
	    b=a.length;
	    
	    c=b;
	    for(i=0;i<b;i++)
	    {
	        for(j=0;j<b;j++)
	        {
	           if(a[j]==a[i])
	         
	           {
	        	   System.out.println(a[j]);
	           }
	           else
	           if(a[j]==a[b-1])
	           {
	        	   System.out.println(a[j]);
	               
	           }
	           else
	           {
	        	   System.out.print(" ");
	           }
	        }
	        b--;
	    }
	 System.out.println();
	    
	    
	     for(k=i-2;k>=0;k--)
	    {
	        for(j=0;j<c;j++)
	        {
	            if(a[j]==a[k])
	           {
	               
	            	 System.out.println(a[j]);
	           }
	           else if(a[j]==a[b+1])
	           {
	        	   System.out.println(a[j]);
	               
	           }
	           else
	           {
	        	   System.out.print(" ");
	           }
	        }
	        System.out.println();
	        b++;
	        
	       
	    }
  }
}

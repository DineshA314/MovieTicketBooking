import java.util.Scanner;
public class letters {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   char ch = input.next().charAt(0);
  
   int i;
   
   for(i=ch ;i<=90;i++) {
	     System.out.print((char)i);
   //System.out.println(i);
   }
 }
}

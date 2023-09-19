package booking;
import java.util.Scanner;
public class movie1 {
 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	int status =1;
	movie movlist [] = null;
	
	do
	{
		System.out.println("Welcome to the cinema hall");
		System.out.println("1. add movie details");
		System.out.println("2.search and book");
		System.out.println("3. view all");
		System.out.println("enter yoyr choice");
		int ch = in.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("enter no. of movies : ");
			int no = in.nextInt();
			movlist= new movie[no];
			for(int i=0; i<movlist.length;i++)
			{
				int j=i;
				System.out.println("Enter movie "+ ++j +"details");
				movlist[i]= new movie();
				
			}
			System.out.println("Data saved..");
			break;
		case 2:
			boolean flag = true;
			in.nextInt();
			System.out.println("Enter the movie name : ");
			String name= in.nextLine();
			for(int i=0; i<movlist.length;i++)
			{
				if(movlist[i].getName().equals(name))
				{
					movlist[i].viewAllDetails();
					flag = true ;
					System.out.println(" Would you like to book tickets for this movie:");
					System.out.println("Enter 1 to book and 2 to exit :");
					int c= in.nextInt();
					if(c==1)
					{
						System.out.println("Enter the no. of tickets: ");
						int tick = in.nextInt();
						int tc= movlist[i].getcost()*tick;
						System.out.println("The bill comes up to : "+tc);
						
					}
					else
						break;
					
				}
				else
				    flag = false;
				
			}
			if(flag==false)
				System.out.println("not found");
			break;
			
		case 3:
			for(int i=0; i<movlist.length;i++) {
				movlist[i].viewAllDetails();
			}
			default : System.out.println("worng choice");
			
			}
		System.out.println("Do you want to continue (1.yes / 2.no) : ");
		status = in.nextInt();
	}
	while(status==1);
	{
		System.out.println("Execution completed succefully");
	}
		
		
	
 }
}

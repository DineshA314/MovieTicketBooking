package booking;
import java.util.Scanner;
public class movie {
	private String name;
	private String theatername;
	private int nooftickets;
	private int cost;
	
	movie()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the of the movie:");
		this.name = in.nextLine();
		System.out.println("Enter the theaters name: ");
		this.theatername = in.nextLine();
		System.out.println("Enter the no. of tickets: ");
		this.nooftickets = in.nextInt();
		System.out.println("Enter the cost per ticket : ");
		this.cost = in.nextInt();
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	String getName() {
		return name;
	}
	void settheatername(String heatername)
	{
		this.theatername = theatername;
	}
	String getheatername() {
		return theatername;
	}
	void setnooftickets(int nooftickets)
	{
		this.nooftickets= nooftickets;
	}
	int getcost() {
		return nooftickets;
	}
	void setcost(int cost)
	{
		this.cost= cost;
	}
    void StoreAllDetails(String name , String brand, int memory, int camera, double price)
    {
    	this.name = name;
    	this.theatername = theatername;
    	this.nooftickets = nooftickets;
    	this.cost = cost;
    	
    }
    
    void viewAllDetails()
    {
    	System.out.println("name : "+name);
    	System.out.println("theaternamename : "+theatername);
    	System.out.println("no. of tickets : "+nooftickets);
    	System.out.println("cost of the ticket : "+cost);
    }
}

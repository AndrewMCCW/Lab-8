import java.util.Scanner;

public class SystemInterface {
	
	public static void main (String [] args)
	{
		//Creates scanner to read user inputs
		Scanner reader = new Scanner(System.in);
		
		//Creates Aggregator and Invoker
		Aggregator test = new Aggregator();
		Invoker invoker = new Invoker();
		
		//Creates Command Functions
		CMDAddAsset adda;
		CMDAddLiability addl;
		CMDGetNetWorth n;
		
		//Creates user vars to be inputted into the aggregator
		String desc;
		double price;
		
		//Creates decision var & while loop ender
		int decision;
		boolean end = false;
		
		
		while (end != true)
		{
			//Prints out options
			System.out.println("1 - Add New Asset");
			System.out.println("2 - Add New Liability");
			System.out.println("3 - Find Net Worth");
			System.out.println("0 - Exit");
			decision = reader.nextInt();
			reader.nextLine();
			
			if(decision == 1)
			{
				System.out.println("Name of Asset?");
				desc = reader.nextLine();
				System.out.println("Amount of Asset?");
				price = reader.nextDouble();
				adda = new CMDAddAsset(desc, price, test);
				invoker.addAsset(adda);
			}
			if (decision == 2) 
			{
				System.out.println("Name of Liability?");
				desc = reader.nextLine();
				System.out.println("Amount of Liability?");
				price = reader.nextDouble();
				addl = new CMDAddLiability(desc, price, test);
				invoker.addLiability(addl);
			}
			
			if (decision == 3)
			{
				n = new CMDGetNetWorth(test);
				invoker.getNetWorth(n);
			}
			
			if (decision == 0)
				end = true;
				
		}
		
		reader.close();
		
		
		
	}
}

package main;

import java.util.*;

public class DirectoryEditor {
	static LinkedList<Employee> collection = new LinkedList<Employee>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ENDO = false;
		Scanner console = new Scanner(System.in);
		String in;
		
		System.out.println("enter a command CLR , ADD, END");
		while(!ENDO)
		{	
			in = console.nextLine();
			if(in.equalsIgnoreCase("ADD"))
			{
				boolean ENDI = false;
				while(ENDI)
				{
					System.out.println("Enter <Your First name>  <Last name>  <Department Name>  <Phone number> //( or end to stop)");
					in = console.nextLine();
					if(in.equalsIgnoreCase("END"))
					{
						ENDI = true;
						break;
					}
					String[] splitted = in.split("\\s+");
					if(splitted.length == 4)
					{
					Employee name = new Employee(in);
					collection.add(name);
					}
					else
					{
					
						System.out.println("invalid format");
					}
				}
			}
			else if(in.equalsIgnoreCase("CLR"))
			{
				
			}
			else if(in.equalsIgnoreCase("PRINT"))
			{
				//for(Employee i: collection)
				{
					
				}
			}
			else if(in.equalsIgnoreCase("END"))
			{
				break;
			}
			
		}
	}

}

package main;

import java.util.*;

public class DirectoryEditor {
static LinkedList<Employee> collection = new LinkedList<Employee>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean END = false;
		Scanner console = new Scanner(System.in);
		String in;
		while(!END)
		{
			System.out.println("Enter <Your First name>  <Last name>  <Department Name>  <Phone number>");
			in = console.nextLine();
			Employee name = new Employee(in);
			collection.add(name);
			name.print();
		}
	}

}

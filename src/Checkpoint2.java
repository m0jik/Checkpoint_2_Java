import java.util.*;
import java.lang.*;

public class Checkpoint2
{
	private static ArrayList<Warehouse> warehouses;
	
	public Checkpoint2()
	{
		warehouses = new ArrayList<Warehouse>();
	}
	
	public static void main(String[] args)
	{
		Checkpoint2 test = new Checkpoint2();
		
		Scanner prompt = new Scanner(System.in);
		String[] options = {"a. Add new record", "b. Edit/delete record", "c. Search", "quit. Quit"};
		String selection = "";
		
		while (!selection.equals("quit"))
		{
			displayOptions(options);
			System.out.print("Choose an option: ");
			selection = prompt.nextLine();
		
			switch (selection)
			{
			case "a":
				test.warehouses.add(addRecord(prompt));
				break;
			case "b":
				editRecord(prompt, test);
				break;
			case "c":
				search();
				break;
			default:
				System.out.println("Invalid Selection");
				break;
			}
		}
		
		prompt.close();
	}
	
	public static void displayOptions(String[] options)
	{
		for (String s : options)
		{
			System.out.println(s);
		}
	}
	
	public static void displayWarehouses(Checkpoint2 test)
	{
		for (Warehouse w : test.warehouses)
		{
			System.out.println(test.warehouses.indexOf(w) + ". " + w);
		}
	}
	
	public static Warehouse addRecord(Scanner prompt)
	{
		Warehouse newWarehouse = new Warehouse();
		
		System.out.print("Enter city: ");
		newWarehouse.setCity(prompt.nextLine());
		
		System.out.print("Enter address: ");
		newWarehouse.setAddress(prompt.nextLine());
		
		System.out.print("Enter phone number: ");
		newWarehouse.setPhoneNumber(prompt.nextLine());
		
		System.out.print("Enter manager: ");
		newWarehouse.setManager(prompt.nextLine());
		
		System.out.print("Enter storage capacity: ");
		newWarehouse.setStorageCapacity(Integer.parseInt(prompt.nextLine()));
		
		System.out.print("Enter drone capacity: ");
		newWarehouse.setDroneCapacity(Integer.parseInt(prompt.nextLine()));
		
		return newWarehouse;
	}
	
	public static void editRecord(Scanner prompt, Checkpoint2 test)
	{
		displayWarehouses(test);
		System.out.print("Choose a warehouse: ");
		Warehouse chosen = test.warehouses.get(Integer.parseInt(prompt.nextLine()));
		
		System.out.println("a. City");
		System.out.println("b. Address");
		System.out.println("c. Phone Number");
		System.out.println("d. Manager");
		System.out.println("e. Storage Capacity");
		System.out.println("f. Drone Capacity");
		System.out.println("g. Delete Warehouse");
		System.out.print("What would you like to do? ");
		
		String selection = prompt.nextLine();
		switch(selection)
		{
		case "a":
			System.out.print("Enter new City: ");
			chosen.setCity(prompt.nextLine());
			break;
		case "b":
			System.out.print("Enter new Address: ");
			chosen.setAddress(prompt.nextLine());
			break;
		case "c":
			System.out.print("Enter new Phone Number: ");
			chosen.setPhoneNumber(prompt.nextLine());
			break;
		case "d":
			System.out.print("Enter new Manager: ");
			chosen.setManager(prompt.nextLine());
			break;
		case "e":
			System.out.print("Enter new Storage Capacity: ");
			chosen.setStorageCapacity(Integer.parseInt(prompt.nextLine()));
			break;
		case "f":
			System.out.print("Enter new Drone Capacity: ");
			chosen.setDroneCapacity(Integer.parseInt(prompt.nextLine()));
			break;
		case "g":
			test.warehouses.remove(chosen);
			break;
		default:
			System.out.println("Invalid selection");
			break;
		}
	}
	
	public static void search()
	{
		
	}
}
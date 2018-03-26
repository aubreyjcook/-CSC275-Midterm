import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Midterm {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Midterm();
	}

	// This will act as our program switchboard
	public Midterm() {
		
		ArrayList<Item> cargohold = new ArrayList<Item>();
		
		System.out.println("Welcome to the BlackStar Cargo Hold interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");

		while (true) {
			// Give the user a list of their options
			System.out.println("1: Add an item to the cargo hold.");
			System.out.println("2: Remove an item from the cargo hold.");
			System.out.println("3: Sort the contents of the cargo hold.");
			System.out.println("4: Search for an item.");
			System.out.println("5: Display the items in the cargo hold.");
			System.out.println("0: Exit the BlackStar Cargo Hold interface.");

			// Get the user input
			int userChoice = input.nextInt();
			input.nextLine();
			
			switch (userChoice) {
				case 1:
					addItem(cargohold);
					break;
				case 2:
					removeItem(cargohold);
					break;
				case 3:
					sortItems(cargohold);
					break;
				case 4:
					searchItems(cargohold);
					break;
				case 5:
					displayItems(cargohold);
					break;
				case 0:
					System.out.println("Thank you for using the BlackStar Cargo Hold interface. See you again soon!");
					System.exit(0);
				default:
					System.out.println("Invalid value. Choose a number 0-5 only.");
					break;
			}
		}

	}

	private void addItem(ArrayList<Item> cargohold) {
		Item tempItem = new Item();
		System.out.println("Enter the Item's name");
		String userInput = input.nextLine();
		tempItem.setItemName(userInput);
		System.out.println("Enter the Item's weight");
		userInput = input.nextLine();
		if ((getCargoholdWeight(cargohold) + Integer.parseInt(userInput)) > 25) {
			System.out.println("The cargohold cannot hold the additional Item's weight.");
			System.out.println("Remove an item from the cargohold to lower it's weight below 25 or add an item of lower weight.");
			return;
		};
		
		tempItem.setItemWeight(Integer.parseInt(userInput));
		System.out.println("Enter the Item's value");
		userInput = input.nextLine();
		tempItem.setItemValue(userInput);
		System.out.println("Enter the Item's durability");
		userInput = input.nextLine();
		tempItem.setItemDurability(userInput);
		System.out.println("Enter the Item's ID");
		userInput = input.nextLine();
		tempItem.setItemID(userInput);
		
		cargohold.add(tempItem);
		System.out.println("Item added successfully");
		return;
	}

	private void removeItem(ArrayList<Item> cargohold) {
		if(cargohold.size() == 0) {
			System.out.println("The cargohold has no items to remove!");
			return;
		} else {
			System.out.println("Enter the name of the item to be removed.");
			String userInput = input.nextLine();
			
			for(int i = 0; i < cargohold.size(); i++) {
				cargohold.get(i);
				if(Item.name.equals(userInput)) {
					cargohold.remove(i);
					
					System.out.println("Item removed.");
					break;
				} else if (i == cargohold.size() - 1) {
					System.out.println("That item is not in the cargohold.");
				}
			}
			return;		
		}
	}

	private void sortItems(ArrayList<Item> cargohold) {
		
		Collections.sort(cargohold, Item.ItemNameComparator);
		
		System.out.println("cargohold sorted.");
		return;
	}

	private void searchItems(ArrayList<Item> cargohold) {
		while(true) {
			// Give the user a list of their options
			System.out.println("1: Search: Name");      
			System.out.println("2: Search: Value");
                                                                              
			// Get the user input                                             
			int userChoice = input.nextInt();                                 
			input.nextLine();                                                 
			switch(userChoice) {
				case 1:
					System.out.println("Enter the name of the item.");
					String userInput = input.nextLine();
					
					for(int i = 0; i < cargohold.size(); i++) {
						cargohold.get(i);
						if(Item.name.equals(userInput)) {
							System.out.println("The item was found at section number " + (i + 1));
							break;
						} else if (i == cargohold.size() - 1) {
							System.out.println("That item is not in the cargohold.");
						}
					}
					return;
				case 2:
					System.out.println("Enter the value of the item.");
					String userInput1 = input.nextLine();
					
					for(int i = 0; i < cargohold.size(); i++) {
						cargohold.get(i);
						if(Item.value.equals(userInput1)) {
							System.out.println("The item was found at section number " + (i + 1));
							break;
						} else if (i == cargohold.size() - 1) {
							System.out.println("That item is not in the cargohold.");
						}
					}
					return;
				default:
					System.out.println("Invalid value. Choose a number 1-2 only.");
					break;
			}
		}
	}

	private void displayItems(ArrayList<Item> cargohold) {
		while (true) {
			// Give the user a list of their options
			System.out.println("1: Display all items in the cargohold");
			System.out.println("2: Display a specific item in the cargohold");

			// Get the user input
			int userChoice = input.nextInt();
			input.nextLine();
			
			switch (userChoice) {
				case 1:
					//simple output
					for(int i = 0; i < cargohold.size(); i++) {
						cargohold.get(i);
						System.out.println(Item.name);
						cargohold.get(i);
						System.out.println(Item.weight);
						cargohold.get(i);
						System.out.println(Item.value);
						cargohold.get(i);
						System.out.println(Item.durability);
						cargohold.get(i);
						System.out.println(Item.ID);
					
					}
					return;
				case 2:
					
					return;
				default:
					System.out.println("Invalid value. Choose a number 1-2 only.");
					break;
			}
		}
	}
	
	private float getCargoholdWeight(ArrayList<Item> cargohold) {
		float cargoholdWeight = 0;
		for(int i = 0; i < cargohold.size(); i++) {
			cargohold.get(i);
			cargoholdWeight = cargoholdWeight + Item.weight;
		};
		
		return cargoholdWeight;
	}
}

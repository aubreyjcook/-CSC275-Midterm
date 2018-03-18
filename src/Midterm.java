import java.util.ArrayList;
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
		cargohold.add(new Item());
		int index = cargohold.size(); 
		Item tempItem = new Item();
		System.out.println("Enter the Item's name");
		String userInput = input.nextLine();
		tempItem.setItemName(userInput);
		System.out.println("Enter the Item's weight");
		userInput = input.nextLine();
		tempItem.setItemWeight(userInput);
		System.out.println("Enter the Item's value");
		userInput = input.nextLine();
		tempItem.setItemValue(userInput);
		System.out.println("Enter the Item's durability");
		userInput = input.nextLine();
		tempItem.setItemDurability(userInput);
		System.out.println("Enter the Item's ID");
		userInput = input.nextLine();
		tempItem.setItemID(userInput);
		
		cargohold.set(index - 1, tempItem);
		System.out.println("Item added successfully");
		return;
	}

	private void removeItem(ArrayList<Item> cargohold) {
		int index = cargohold.size();
		
		if(index == 0) {
			System.out.println("The cargohold has no items to remove!");
			return;
		} else {
			
			System.out.println("Enter the name of the item to be removed.");
			String userInput = input.nextLine();
			
			for(int i = 0; i < cargohold.size(); i++) {
				cargohold.get(i);
				if(Item.name.equals(userInput)) {
					cargohold.get(i);
					Item.name = "none";
					cargohold.get(i);
					Item.weight = "none";
					cargohold.get(i);
					Item.value = "none";
					cargohold.get(i);
					Item.durability = "none";
					cargohold.get(i);
					Item.ID = "none";
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
		/*int index = cargohold.size();
		
		if(index <= 1) {
			System.out.println("The cargohold has too few items to sort.");
			return;
		} else {
			System.out.println(compareTo(cargohold.get(1), cargohold.get(2)));
		}*/
		/*
		for(int x = 0; x < 5; x++) { //this for loop repeats the sorting process according to the length of the array to enhance sorting accuracy
			for (int i = 0; i < cargohold.size(); i++) {
				int minimum = i;
				//System.out.println(minimum);
				for (int j = i + 1; j < cargohold.length; j++) {
					//System.out.println(j);
					//System.out.println(cargohold[i].compareTo(cargohold[minimum]));
					if(!cargohold[j].name.equals("none")) {
						if(cargohold[j].name.compareTo(cargohold[minimum].name) < 0) {
							minimum = j;
							//Debug Note: Outputs array reassignments in real time. 
							//System.out.println("Swapping " + cargohold[i] + " with " + cargohold[minimum]);
							//System.out.println(Arrays.asList(cargohold));
							Item transfer = cargohold[i];
							cargohold[i] = cargohold[minimum];
							cargohold[j] = transfer;
						}
					}
				}
			}
		}
		System.out.println("cargohold sorted.");*/
		
		return;
	}

	private void searchItems(ArrayList<Item> cargohold) {
		System.out.println("Enter the name of the item you wish to search for.");
		String userInput = input.nextLine();
		
		for(int i = 0; i < cargohold.size(); i++) {
			if (userInput.equals(cargohold.get(i).name)) {
				System.out.println("The item was found at section number " + (i + 1));
				return;
			}
		}
		System.out.println("The item was not found in the cargo hold.");
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
}

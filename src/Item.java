import java.util.Comparator;

public class Item {
	static String name = "none";
	static float weight = 0;
	static String value = "none";
	static String durability = "none";
	static String ID = "none";
			
	Item(){}
	
	//constructor
	public Item(String itemName, float itemWeight, String itemValue, String itemDurability, String itemID) {
		Item.name = itemName;
		Item.weight = itemWeight;
		Item.value = itemValue;
		Item.durability = itemDurability;
		Item.ID = itemID;
	}
	
	//setter methods
	public void setItemName(String newItemName) {
		Item.name = newItemName;
	}
	
	public void setItemWeight(float newItemWeight) {
		Item.weight = newItemWeight;
	}
	
	public void setItemValue(String newItemValue) {
		Item.value = newItemValue;
	}
	
	public void setItemDurability(String newItemDurability) {
		Item.durability = newItemDurability;
	}
	
	public void setItemID(String newItemID) {
		Item.ID = newItemID;
	}
	
	//getter methods
	public String getItemName() {
		return name;
	}
	
	public float getItemWeight() {
		return weight;
	}
	
	public String getItemValue() {
		return value;
	}
	
	public String getItemDurability() {
		return durability;
	}
	
	public String getItemID() {
		return ID;
	}

	public static Comparator<Item> ItemNameComparator = new Comparator<Item>() {

		public int compare(Item i1, Item i2) {
		   String itemName1 = i1.getItemName().toUpperCase();
		   String itemName2 = i2.getItemName().toUpperCase();

		   //ascending order
		   //return itemName1.compareTo(itemName2);

		   //descending order
		   return itemName2.compareTo(itemName1);
	    }
	};
}
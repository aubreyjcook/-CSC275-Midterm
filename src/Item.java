

public class Item {
	static String name = "none";
	static String weight = "none";
	static String value = "none";
	static String durability = "none";
	static String ID = "none";
			
	Item(){}
	
	//constructor
	public Item(String itemName, String itemWeight, String itemValue, String itemDurability, String itemID) {
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
	
	public void setItemWeight(String newItemWeight) {
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
	
	public String getItemWeight() {
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
	
	
	//comparison object
	
	public class ComparableItem extends Item
	implements Comparable<ComparableItem> {
		public ComparableItem(String itemName, String itemWeight, String itemValue, String itemDurability, String itemID) {
			super(name, weight, value, durability, ID);
		}
	}
	
	public int compareTo(ComparableItem o) {
		return this.getItemName().compareTo(o.getItemName());
	}
	
}

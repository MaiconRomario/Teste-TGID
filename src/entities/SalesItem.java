package entities;

public class SalesItem {
	
	private Integer ItemId;


	public SalesItem(Integer itemId) {
		super();
		ItemId = itemId;
	}

	public Integer getItemId() {
		return ItemId;
	}

	public void setItemId(Integer itemId) {
		ItemId = itemId;
	}
	
}

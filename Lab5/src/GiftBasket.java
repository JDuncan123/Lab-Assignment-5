
public class GiftBasket {
	private int ID;
	private String Type;
	private float Cost;
	
	public GiftBasket() {
		ID=0;
		Type="";
		Cost=0;
		
	}
	public GiftBasket(int iD, String type, float cost) {
		super();
		ID = iD;
		Type = type;
		Cost = cost;
	}
	 public GiftBasket(GiftBasket gift) {
		 ID=gift.ID;
		 Type=gift.Type;
		 Cost=gift.Cost;
	 }
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public float getCost() {
		return Cost;
	}
	public void setCost(float cost) {
		Cost = cost;
	}
	
	public void display() {
		String result = toString();
		System.out.println(result);
	}
	@Override
	public String toString() {
		return "GiftBasket [ID=" + ID + ", Type=" + Type + ", Cost=" + Cost + "]";
	}
	
	
	
	

}

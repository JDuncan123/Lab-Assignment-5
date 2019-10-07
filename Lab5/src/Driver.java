
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiftList list = new GiftList();

		System.out.println("Creating 3 gifts.....");
		for(int i=1;i<4;i++) {
			GiftBasket basket= new GiftBasket(i+5,"Large",i*5);
			//list.addGiftBasketToEnd(basket);
		}
		list.showAllGiftBaskets();
		
		
		
	}

}

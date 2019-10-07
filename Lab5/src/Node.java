
public class Node {
	private GiftBasket Data;
	private Node Next;
	
	public Node() {
		Data=null;
		Next=null;
	}
	public Node(GiftBasket data, Node next) {
		super();
		Data = data;
		Next = next;
	}
	public GiftBasket getData() {
		return Data;
	}
	public void setData(GiftBasket data) {
		Data = data;
	}
	public Node getNext() {
		return Next;
	}
	public void setNext(Node next) {
		Next = next;
	}
	
	

}

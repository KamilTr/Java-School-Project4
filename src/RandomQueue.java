import java.util.*;

public class RandomQueue {
	private Node header;
	private static int size;
	
	public RandomQueue(){
		header = new Node(null);
		size = 0;
	}
	public boolean isEmpty(){
		if(size == 0)
			return true;
		return false;
	}
	public void enqueue(Object o){
		Node newN = new Node(o);
		Node temp = header;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newN;
		size++;
	}
	public static Object dequeu(){
		int random = (int)(Math.random() * size);
		System.out.println(random);
		return null;
	}
	
	public void main(String[] args){
		
		size = 30;
		for(int i = 0; i < 40; i++){
			RandomQueue.dequeu();
		}
		
	}
}

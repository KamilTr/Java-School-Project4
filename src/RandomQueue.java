







import java.util.*;

public class RandomQueue {
	private Node header;
	private int size;
	
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
	public  Object dequeu(){
		if(size > 0){
			int random = (int)(Math.random() * size + 1);
			int counter =  1;
			
			Node temp = header;
			while(temp.next != null){
				if(counter >= random){
					Node newTemp = temp.next;
					size--;
					System.out.println("Random: "+random+" \nCounter: "+counter); //Användes för att felsöka
					temp.next = temp.next.next;
					return newTemp.obj;
				}
				counter++;
				temp = temp.next;
			}
			System.out.println("Random; " + random);		//	<--------- Användes för att felsöka 
			System.out.println("Counter: " + counter);		//   <---'
			String fk = "out of loop";						//  <--'
			return fk;
		}
		return null;
	}
	public Object[] print(){	//Skapade metoden för att kunna felsöka.
		Object[] result = new Object[size+1];
		Node temp = header;
		int counter = 0;
		while(temp != null){
			if(counter < size+1)result[counter] = temp.obj;
			temp = temp.next;
			counter++;
		}
		
		return result;
	}
	
	public static void main(String[] args){//Main används för att testa metoderna.
		RandomQueue test = new RandomQueue();
		
		for(int i = 0; i < 30; i++){
				test.enqueue(i);
			
		}
		
		for(int i = 0; i < 10; i++){
			System.out.println(Arrays.toString(test.print()));
			System.out.println("Removed: " + test.dequeu());
			System.out.println(Arrays.toString(test.print()));
			System.out.println("-----------------------");
		}
		
		RandomQueue test2 = new RandomQueue();
		test2.enqueue("2");
		test2.enqueue(2);
		System.out.println(test2.isEmpty());
		test2.dequeu();
		test2.dequeu();
		System.out.println(test2.isEmpty());
		
		
	}
}

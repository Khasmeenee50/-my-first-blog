import java.util.ArrayList;
import java.util.Scanner;
public class Bag {
        private Scanner sc;
	private ArrayList<Item> items;
	private int maxItem;

	public Bag(){
		items = new ArrayList<Item>();
                sc = new Scanner(System.in);
		maxItem = 10;
	}

	public boolean addItem(Item item){
                int n=0;
		if(items.size() < maxItem){
			items.add(item);
			return true;
		}else if(items.size() == maxItem){
                    System.out.println("Bag is FULL");
                }
		return false;
	}
        public boolean DeleteItem(Item item){
            System.out.println("Are you sure to delete ? (y/n)");
            char continued = sc.next().charAt(0);
            if(continued != 'y')
                return false;
            items.remove(item);
            return true;
        }
	public void printBag(){
                System.out.println("Item Size: "+items.size());
		if(items.size() == 0){
			System.out.println("Bag is empty");
			return;
		}
                
		System.out.println("Item in Bag");
		for(Item item: items){
			System.out.println(" - " + item);//.getName() + " hp: " + item.getHp());
		}
                
	}


    

}


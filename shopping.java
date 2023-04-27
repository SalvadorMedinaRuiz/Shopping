package lab;
import java.util.Scanner;
public class shopping {
	public static void main (String[] args) {
		//variables
		Scanner kb = new Scanner(System.in);
		String customerAns= "Placeholder";
		String itemName= "Placeholder";
		double itemPrice= 0.0;
		int itemAmount= 0;
		ShoppingCart cart= new ShoppingCart();
		
		System.out.println("Welcome to the store of everything that has ever existed!");
		System.out.println("Let us start shopping!");
				
		do {
			System.out.println("What is the name of the item you would like to add?");
			itemName=kb.nextLine();
			System.out.println("WHat is the Price of the item?");
			itemPrice=kb.nextDouble();
			System.out.println("How much of this item are you getting?");
			itemAmount= kb.nextInt();
			
			cart.addToCart(itemName, itemPrice, itemAmount);
			
			System.out.println(cart.toString());
			
			kb.nextLine();
			System.out.println("Would you like to keep shopping? Type STOP to stop shopping");
			customerAns=kb.nextLine();
		}while(!customerAns.equalsIgnoreCase("stop"));	
		System.out.println("Please pay the amount of $" + cart.getTotalPrice());
	}
}

package org.tns.acc.c2tc.javabasics;

public class Opps {
	
	//varaible
		String name;
		double price;
		String category;
		
		//method
		
		void displayDetails()
		{
			System.out.println("Food Name :"+ name);
			System.out.println("Price :"+price);
			System.out.println("Category :"+category);
			System.out.println("---");
		}

	public static void main(String[] args) {
	  
		Opps fooditem1=new Opps();
		fooditem1.name="Burger";
		fooditem1.price=299.99;
		fooditem1.category="Fast Food";
		
		fooditem1.displayDetails();	
		
		Opps fooditem2=new Opps();
		fooditem2.name="Briyanni";
		fooditem2.price=399.99;
		fooditem2.category="Rice";
		
		fooditem2.displayDetails();	
		
	}

}

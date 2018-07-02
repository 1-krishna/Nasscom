package june_22;

import java.util.ArrayList;
import java.util.Iterator;

import org.omg.CORBA.Principal;

/*
 * Write a java program to create a class Product with id, name and price
 * and constructor to assign them and , in main class have arrayList collection
 * maintained to add products to collection and display only those products
 * where price<30000 to added in productPriceList ArrayList and display
 */

class Product{
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class Activity {

	public static void main(String[] args) {
		
		ArrayList<Product> priceList = new ArrayList<Product>();
		
		Product p1 = new Product(101, "Car", 1000000);
		Product p2 = new Product(102, "Fridge", 20000);
		Product p3 = new Product(103, "TV", 15000);
		Product p4 = new Product(104, "AC", 25000);
		
		
		priceList.add(p1);	priceList.add(p2);	priceList.add(p3);	priceList.add(p4);

		ArrayList<Product> lesserPrice = new ArrayList<Product>();
		for(Product p : priceList){
			if(p.price < 30000){
				lesserPrice.add(p);
				System.out.println(p.name);
			}
		}
	}

}

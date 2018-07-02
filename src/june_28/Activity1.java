package june_28;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * DataOutputStream is use to write primitive data-type
 * */

/*
 * Make arrays for product name, price, unit
 * Write it to file using DataOutputStream
 * And read it from file using DataInputStream
 * Then calculate total amount for each product
 * and finally calculate gross amount
 * */

public class Activity1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String pName[] = {"Keyboard", "Mouse", "Mug", "T-shirt"};
		int pUnit[] = {2, 5, 6, 7};
		float pPrice[] = {5000.0f, 3000.0f, 2000.0f, 1200.0f};
		
		
		//File and Streams
		
		File file = new File("MyStore.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		//Writing
		for(int i=0;i<4;i++){
			dos.writeUTF(pName[i]);
			dos.writeFloat(pPrice[i]);
			dos.writeInt(pUnit[i]);
		}
		
		dos.close();
		
		System.out.println("Done writing.......");
		
		
		//Reading from file
		
		System.out.println("_____________________");
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		float grossAmount = 0.0f;
		for(int i=0;i<4;i++){
			float totalAmount;
			
			String prodName = dis.readUTF();
			System.out.print(prodName + "\t");
			float prodPrice = dis.readFloat();
			System.out.print(prodPrice + "\t");
			int prodQuantity = dis.readInt(); 
			System.out.print(prodQuantity + "\t");
			
			totalAmount = prodPrice*prodQuantity;
			System.out.println(totalAmount);
			
			grossAmount +=  totalAmount;
			
		}
		System.out.println("_ _ _ _ _ _ _ _ _ _ _");
		System.out.println("Gross Amount : " + grossAmount);
		dis.close();
		
	}

}

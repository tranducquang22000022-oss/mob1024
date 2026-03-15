package entity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainLab1 {
	public static void main(String[] args) {
		ArrayList<Product> listProducts = new ArrayList<Product>();
		
		Product p1 = new Product("Ao01","Áo Thun",10);
		listProducts.add(p1);
		listProducts.add(new Product("Ao02","sơ mi",12));
		listProducts.add(new ImportedProduct("Q01","quần tây",16,0.1,1));
		listProducts.add(new ImportedProduct("A01","áo thun",18,0.2,1));
		listProducts.add(new ImportedProduct("A01","áo polo",-18,0.2,1));
		for( Product p: listProducts) {
			System.out.println(p.toString());
		}
		Product max = listProducts.get(0);
		for( Product a: listProducts)
			if(a.finalPrice() > max.finalPrice()) {
			max =a;
		}
		System.out.println("Sản phẩm có giá cao nhất");
		System.out.println(max);
	}
	
}

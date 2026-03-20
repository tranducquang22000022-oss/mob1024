package Bai2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainBai2 {
	public static void main(String[] args) {
		List<Product> lisProducts = new ArrayList<Product>();
		
		lisProducts.add(new Product("001","bánh bao",15000, ProductCategory.Food));
		lisProducts.add(new Product("002","bánh mì",25000, ProductCategory.Food));
		lisProducts.add(new Product("003","ip12",25000000,ProductCategory.Electronic));
		lisProducts.add(new Product("004","ip 17",50000000,ProductCategory.Electronic));
		lisProducts.add(new Product("005","ip18",65000000, ProductCategory.Electronic));
		lisProducts.add(new Product("006","Áo Khoác",500000, ProductCategory.Clothing));
		lisProducts.add(new Product("007","Áo lót",250000, ProductCategory.Clothing));
		lisProducts.add(new Product("008","Quần jean",100000, ProductCategory.Clothing));
		lisProducts.add(new Product("fff","Quần jean",-100000, ProductCategory.Clothing));
		
		System.out.println(">> Danh sách sản phẩm là:");
	
		for ( Product a: lisProducts) {
			System.out.println(a);
		}
		// Thống kê
		Map<ProductCategory, Integer> countMap = new HashMap<ProductCategory, Integer>();
		
		Map<ProductCategory, Double>  sumPriceMap = new HashMap<ProductCategory, Double>();
		
		for( Product a : lisProducts) {
			ProductCategory cat = a.getLoaisanpham();
			
			sumPriceMap.put(cat, sumPriceMap.getOrDefault(cat, 0.0)+ a.getGiasanpham());
			countMap.put(cat, countMap.getOrDefault(cat, 0)+1);
		}
		// hiển thị kết quả
		System.out.println("_______________________________________________________________");
	    System.out.printf("%-15s | %-10s | %-20s\n","Loại", "Số lượng ", "Tổng Tiền" );
		for (Map.Entry<ProductCategory, Integer> entry : countMap.entrySet()) {
            ProductCategory key = entry.getKey();
            Integer count = entry.getValue();
            Double totalPrice = sumPriceMap.get(key); 
        
            System.out.printf("%-15s | %-10d | %,.0f VNĐ\n", key, count, totalPrice);
	}
}
}

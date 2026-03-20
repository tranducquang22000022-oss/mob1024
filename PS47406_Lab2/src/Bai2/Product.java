package Bai2;

public class Product {
	private String id;
	private String name;
	private double giasanpham;
	private ProductCategory loaisanpham;
	
	public Product() {}

	public Product(String id, String name, double giasanpham, ProductCategory loaisanpham) {
		if (!setid(id) || !setGiasanpham(giasanpham)) {
		this.id = id;
		this.name= name;
		if(!this.setGiasanpham(giasanpham)) {
			this.giasanpham= 0;
			System.out.println("Nhập Giá sai"+ name+"False");
		}
		
		this.loaisanpham = loaisanpham;
	}
}
	public String getId() {
		return id;
	}

	public  boolean setid(String id) {
		if(id != null &&id.trim().isEmpty()) {
			this.id = id;
			return true;
		}else 
		{return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGiasanpham() {
		return giasanpham;
	}

	public boolean setGiasanpham(double giasanpham) {
		if( giasanpham >= 0) {
			this.giasanpham = giasanpham;
			return true;
		}else return false;

		}

	public ProductCategory getLoaisanpham() {
		return loaisanpham;
	}

	public void setLoaisanpham(ProductCategory loaisanpham) {
		this.loaisanpham = loaisanpham;
	}
	public double finalprice() {
		return this.giasanpham;
	}

	@Override
	public String toString() {
	    return String.format("Product [ID: %-5s | Tên: %-15s | Giá: %,.0f VNĐ | Loại: %s]", 
	                          id, name, giasanpham, loaisanpham);
	}
	
}

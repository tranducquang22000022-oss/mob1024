package entity;

public class Product {
	private String id;
	private String name;
	private double basePrince;
	public Product() {
		
	}
	public Product( String id, String name, double basePrince) {
		this.setId(id);
		this.name = name;
		this.setBasePrince(basePrince);
	}
	public String getId() {
		return id;
	}
	public boolean setId(String id) {
		if( id!="") {
			this.id = id;
			return true;
		}
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasePrince() {
		return basePrince;
	}
	public boolean setBasePrince(double basePrince) {
		if(basePrince>0) {
			this.basePrince = basePrince;
			return true;
		}
		return false;
	}
	public double finalPrice() {
		return this.basePrince;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", basePrince=" 
				+ basePrince + ", finalPrice() ="+ finalPrice()+ "]";
	}
	
}

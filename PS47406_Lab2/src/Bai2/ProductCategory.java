package Bai2;

public enum ProductCategory {
	Food("thực phẩm"),
	Electronic("Điện tử"),
	Clothing("Quần Áo");
	private String ChonTen;

	private ProductCategory(String chonTen) {
		ChonTen = chonTen;
	}

	public String getChonTen() {
		return ChonTen;
	}

	public void setChonTen(String chonTen) {
		ChonTen = chonTen;
	}
	
}

package mob1024;

public class baitap1 {
	 private String hangXe;
     private int namSanXuat;
     public String gethangXe(){
         return this.hangXe;
     }
     public  void sethangXe(String hangXe){
         this.hangXe= hangXe;
     }

    public int getNamSanXuat() {
        return namSanXuat;
    }
   
    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
    public void Xuat(){
        System.out.println("Hãng Xe "+ this.hangXe );
        System.out.println("Năm sản xuất"+ this.namSanXuat); 
    }
}

package bai3;

import java.util.Scanner;

public class MainBai3 {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		int chon;
		do {
            System.out.println(" >>>MENU QUẢN LÝ<<< ");
            System.out.println("Chức năng 1>> Thêm nhân viên mới");
            System.out.println("Chức năng 2>>. Hiển thị danh sách");
            System.out.println("Chức năng 3>> Tìm nhân viên theo mã");
            System.out.println("Chức năng 4>> Cập nhật lương nhân viên");
            System.out.println("Chức năng 5>> Thoát chương trình");
            System.out.print(">> Hãy chọn chức năng: ");
            
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
            case 1:
                String tiepTuc;
                do {
                    System.out.println(" Nhập thông tin nhân viên");
                    Employee nvMoi = new Employee();                     
                    System.out.print("Nhập id: ");
                    String id = sc.nextLine().trim();                
                    System.out.print("Nhập tên: "); 
                    String name = sc.nextLine();
                    nvMoi.setName(name);                    
                    System.out.print("Nhập lương: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    if (nvMoi.setId(id) && nvMoi.setSalary(salary)) {
                        service.addEmployee(nvMoi); 
                    } else {
                        System.out.println(">> Thêm thất bại");
                    }

                    System.out.print("Bạn có muốn nhập thêm nhân viên nữa không?: ");
                    tiepTuc = sc.nextLine().trim();
                } while (tiepTuc.equalsIgnoreCase("y"));
                break;
			case 2:
				service.hienthidanhsach();
				break;
			case 3:
				System.out.println("nhập mã nhân viên cần tìm");
				String maTim = sc.nextLine().trim();
				Employee ketQua = service.timMaNV(maTim);
				if( ketQua != null) {
					System.out.println("Kết quả"+ ketQua);
					
				}else {
					System.out.println(">> Không thấy mã nhân viên" + maTim);
				} break;
			case 4:
				System.out.println(" Nhập mã nhân viên cần sửa lương");
				String maSua = sc.nextLine().trim();
				System.out.println("nhập lương mới");
				double luongMoi = sc.nextDouble();
				sc.nextLine();
				if( service.capNhatLuong(maSua, luongMoi))
				System.out.println(">> Đã cập nhật lương");
		
			 else {
				System.out.println(">> Cập nhật thất bại");
			} 
			break;
			case 0:
				System.out.println(" Thoát chương trình");
				break;
				
				default:
					System.out.println(" Lựa chọn không hợp lệ");
					break;
					}
		} while ( chon != 0);
		sc.close();
	
	}


}

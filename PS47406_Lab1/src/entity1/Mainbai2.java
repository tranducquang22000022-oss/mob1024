package entity1;

import java.util.ArrayList;
import java.util.List;

public class Mainbai2 {
	public static void main(String[] args) {
		ArrayList<Employee> listEmployee = new ArrayList<Employee>();
		
		Employee p1= new Employee("123","Quang",9000);
		listEmployee.add(p1);
		listEmployee.add(new Employee("456","Viet",8000));
		listEmployee.add( new FullTimeEmployee("567", "Khoy", 5000, 1000, 20));
		listEmployee.add( new FullTimeEmployee("789", "Khang", 4000, 500, 20));
		listEmployee.add( new PartTimeEmployee("987","Binh",2000,100,20));
		listEmployee.add( new PartTimeEmployee("258","Hai",1000,150,20));
		for(Employee p: listEmployee) {
			System.out.println(p.toString());
		}
		Employee max= listEmployee.get(0);
		for(Employee a : listEmployee) {
			if(a.finalSalary() > max.finalSalary()) {
			max =a;
			}
		}
		System.out.println(">>Lương cao nhất là:");
		System.out.println(max);	
		
		}
	
}

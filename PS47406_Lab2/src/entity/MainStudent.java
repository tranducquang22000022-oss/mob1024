package entity;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {

    public static void main(String[] args) {

        ArrayList<Student> listStudents = new ArrayList<Student>();

        listStudents.add(new Student("001","Quang", StudentType.INTERNATIONAL));
        listStudents.add(new Student("002","Viet", StudentType.PART_TIME));
        listStudents.add(new Student("003","Khang", StudentType.REGULAR));
        listStudents.add(new Student("004","Binh", StudentType.PART_TIME));
        listStudents.add(new Student("005","Khoi", StudentType.INTERNATIONAL));
        listStudents.add(new Student("006","Hai", StudentType.REGULAR));

        System.out.println("Danh sach sinh vien");

        for(Student a : listStudents){
            System.out.println(a);
        }

        for(StudentType type : StudentType.values()){

            System.out.println("Loai sinh vien: " + type);

            for(Student a : listStudents){
                if(a.getType() == type){
                    System.out.println(a);
                }
            }
        }
        for( StudentType type: StudentType.values()) {
        	int cout =0;
        	for( Student a: listStudents) {
        		if( a.getType()== type) {
        			cout++;
        		}
        	}
        	System.out.println(" Số lượng"+ type+":"+ cout);
        }
    }
}
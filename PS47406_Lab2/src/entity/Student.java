package entity;

public class Student  {
	private String id;
	private String tensinhvien;
	private StudentType type;
	public Student() {
		
	}
	
	public Student( String id, String tensinhvien, StudentType type) {
		
		this.id= id;
		this.tensinhvien= tensinhvien;
		this.type= type;
		
	}

	public String getId() {
		return id;
	}

	public boolean setId(String id) {
		if( id!="") {
			this.id = id;
			return true;

		}return false;
	}

	public String getTensinhvien() {
		return tensinhvien;
	}

	public void setTensinhvien(String tensinhvien) {
		this.tensinhvien = tensinhvien;
	}

	public StudentType getType() {
		return type;
	}

	public void setType(StudentType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", tensinhvien=" + tensinhvien + ", type=" + type + "]";
	}
	
}

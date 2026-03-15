package entity1;

public class PartTimeEmployee extends Employee {
	private  double workingHours;
	private  double hourlyRate;
	public PartTimeEmployee() {}
	public PartTimeEmployee(String id, String name, double basiSalary ,double workingHours, double hourlyRate) {
		super(id, name, basiSalary);
		this.setWorkingHours(workingHours);
		this.setHourlyRate(hourlyRate);;
	}
	public double getWorkingHours() {
		return workingHours;
	}
	public boolean setWorkingHours(double workingHours) {
		if( workingHours >=0) {
			this.workingHours = workingHours;
			return true;
		} return false;
		
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public boolean setHourlyRate(double hourlyRate) {
		if(hourlyRate >=0) {
			this.hourlyRate = hourlyRate;
			return true;
		}return false;
		
	}
	@Override
	public double finalSalary() {
		// TODO Auto-generated method stub
		return super.finalSalary()+this.workingHours+ this.hourlyRate;
	}
	@Override
	public String toString() {
		return "PartTimeEmployee [workingHours=" + workingHours + ", hourlyRate=" + hourlyRate +"finalSalary()="+finalSalary()+ "]";
	}
	

}

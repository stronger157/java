class Employee{
    private int id;
    private String name;
    private int salary;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getSalary(){
        return salary;
    }    
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void calculateAnnualSalary(){
        System.out.println("Annual Salary:"+(salary*12));
    }
    
}
class Manager extends Employee{
    private int bonus;
    
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    //@Override
    public void calculateAnnualSalary(int salary){
        int total = (getSalary() * 12) + bonus;
        System.out.println("Annual Salary with Bonus: " + total);
    }
    
}

public class Main
{
	public static void main(String[] args) {
		Employee e= new Employee();
		Manager m= new Manager();
		
		e.setId(101);
        e.setName("Alice");
        e.setSalary(20000);
		e.calculateAnnualSalary();
		
		m.setId(102);
        m.setName("Bob");
        m.setSalary(25000);
        m.setBonus(50000);
		m.calculateAnnualSalary();
	}
}
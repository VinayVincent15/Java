import java.util.*;
 
class Employee{
    public String name;
    public int yearofjoining;
    public int salary;
    public String address;
  
 
   
    public Employee(){}
 
    
    public Employee(String name, int yearofjoining, int salary, String address)
    {
        super();
        this.name = name;
        this.yearofjoining = yearofjoining;
        this.salary = salary;
        this.address = address;
    
    }
 
    public String getName() {
    return name;
    }
    public int getYearofjoining() {
    return yearofjoining;
    }
    public int getSalary() {
    return salary;
    }
    public String getAddress() {
    return address;
    }
 
}
 
public class DisplayArrayList {
public static void main(String[] args) throws Exception 
    {
     List<Employee> list = new ArrayList<Employee>();
 
     list.add(new Employee("Robert",1994,20000,"64C-WallsStreet"));
     list.add(new Employee("Sam   ",2000,40000,"68D-WallsStreet"));
     list.add(new Employee("John  ",1999,60000,"26B-WallsStreet"));
  System.out.print("Name          Year of joining             Salary             Address\n");
        for (Employee s : list) 
        {
            System.out.println(s.getName()+"            " +s.getYearofjoining()+"                     " +s.getSalary()+"            " +s.getAddress());
        }
    }
}

package Part6;

class Person1{
    String name;
    public Person1(){        }
    public Person1(String theName){      this.name = theName;  }
}

class Employee extends Person1{
    String id;
    public Employee(){    super();   }
    public Employee(String name){    super(name);   }
    public Employee(String name, String id){
        super(name);
        this.id = id;
    }
    @Override
    public String toString(){
        return "Employee [id=" + id + " name="+name+"]";
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("Kim", "20210001");
        System.out.println(e);
    }
};

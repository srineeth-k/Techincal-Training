public class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee (int id ,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void salaryIncrease(){
        if(this.salary<30000){
            this.salary+=(this.salary*10)/100;
        }
        System.out.println("Salary after increase: "+(this.salary));
       
    }
    public void display(){
        System.out.println("ID: "+id+" Name: "+name+" Salary: "+salary);
    }

    public static void main(String args[]){
        Employee e1 = new Employee(01,"saketh",37560);
        Employee e2 = new Employee(02,"sai",15000);
        System.out.println("Before Salary Increase:");
        e1.display();
        e2.display();
        System.out.println("After Salary Increase:");
       e1.salaryIncrease();
         e2.salaryIncrease();
         e1.display();
            e2.display();

    }

}

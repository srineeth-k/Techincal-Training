public class Student {
    private int id;
    private String name;
    private int marks;
    public Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getmarks(){
        return marks;
    }
    public void display(){
        System.out.println("ID: "+id+" Name: "+name+" Marks: "+marks);
    }
    public static void main(String args[]){
        Student s1=new Student(1,"sai",45);
        Student s2=new Student(2,"saketh",65);
        s1.display();
        s2.display();
        if(s1.getmarks()>s2.getmarks()){
            System.out.println("---------------------------");
            System.out.println(s1.name+" has scored more marks");
            s1.display();
        }
        else if(s1.getmarks()<s2.getmarks()){
            System.out.println("---------------------------");
            System.out.println(s2.name+" has scored more marks");
            s2.display();
        }
        else{
            System.out.println("Both have scored equal marks");
        }
    }
}

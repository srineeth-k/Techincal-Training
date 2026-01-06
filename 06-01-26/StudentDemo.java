class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int marks;

    public Student(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

    }

}

public class StudentDemo {
    public static void main(String args[]) {
        Student s1 = new Student("varun", 19, 89);
        s1.display();
    }
}

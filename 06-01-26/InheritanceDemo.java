class Grandparent {
    void show() {
        System.out.println("This is Grandparent class");
    }
}

class Parent extends Grandparent {
    void show() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is Child class");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}

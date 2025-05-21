public class Grandparents {
    void grandparentMethod() {
        System.out.println("Grandparent's method");
    }
}
class Parent extends Grandparents {
    void parentMethod() {
        System.out.println("Parent's method");
    }
}
class Child extends Parent {
    void childMethod() {
        System.out.println("Child's method'");
    }
}



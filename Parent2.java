package Sophmore;

public class Parent2 {
    void show()
    {
        System.out.println("Parent's Show()");
    }
}
class Child2 extends Parent2{
    void show(){
        super.show();
        System.out.println("Child's Show()");
    }
}
class Main2 {
    public static void main(String[] args) {
        Parent2 obj2= new Child2();
        obj2.show();
    }
}

package Abstract_Classes_13;

abstract class shape{

    abstract double calculateArea();
}
class Circle extends shape{

    @Override
    double calculateArea() {
        System.out.println("Abstract OVERRIDED Method in Circle");
        return 0.0;
    }

}
class Cyclinder extends shape{

    @Override
    double calculateArea() {
        System.out.println("Abstract OVERRIDED Method in Cyclinder");
        return 0.0;
    }

}
public class Module04{
    public static void main(String[] args) {
        shape s = new Circle();
        s.calculateArea();
    }
}